import enum
import errno
import inspect
import os
import sys
import typing as t
from collections import abc
from contextlib import contextmanager
from contextlib import ExitStack
from functools import update_wrapper
from gettext import gettext as _
from gettext import ngettext
from itertools import repeat
from types import TracebackType

from . import types
from .exceptions import Abort
from .exceptions import BadParameter
from .exceptions import ClickException
from .exceptions import Exit
from .exceptions import MissingParameter
from .exceptions import UsageError
from .formatting import HelpFormatter
from .formatting import join_options
from .globals import pop_context
from .globals import push_context
from .parser import _flag_needs_value
from .parser import OptionParser
from .parser import split_opt
from .termui import confirm
from .termui import prompt
from .termui import style
from .utils import _detect_program_name
from .utils import _expand_args
from .utils import echo
from .utils import make_default_short_help
from .utils import make_str
from .utils import PacifyFlushWrapper

if t.TYPE_CHECKING:
    import typing_extensions as te
    from .shell_completion import CompletionItem

F = t.TypeVar("F", bound=t.Callable[..., t.Any])
V = t.TypeVar("V")


def _complete_visible_commands(
    ctx: "Context", incomplete: str
) -> t.Iterator[t.Tuple[str, "Command"]]:
    
    multi = t.cast(MultiCommand, ctx.command)

    for name in multi.list_commands(ctx):
        if name.startswith(incomplete):
            command = multi.get_command(ctx, name)

            if command is not None and not command.hidden:
                yield name, command


def _check_multicommand(
    base_command: "MultiCommand", cmd_name: str, cmd: "Command", register: bool = False
) -> None:
    if not base_command.chain or not isinstance(cmd, MultiCommand):
        return
    if register:
        hint = (
            "It is not possible to add multi commands as children to"
            " another multi command that is in chain mode."
        )
    else:
        hint = (
            "Found a multi command as subcommand to a multi command"
            " that is in chain mode. This is not supported."
        )
    raise RuntimeError(
        f"{hint}. Command {base_command.name!r} is set to chain and"
        f" {cmd_name!r} was added as a subcommand but it in itself is a"
        f" multi command. ({cmd_name!r} is a {type(cmd).__name__}"
        f" within a chained {type(base_command).__name__} named"
        f" {base_command.name!r})."
    )


def batch(iterable: t.Iterable[V], batch_size: int) -> t.List[t.Tuple[V, ...]]:
    return list(zip(*repeat(iter(iterable), batch_size)))


@contextmanager
def augment_usage_errors(
    ctx: "Context", param: t.Optional["Parameter"] = None
) -> t.Iterator[None]:
    
    try:
        yield
    except BadParameter as e:
        if e.ctx is None:
            e.ctx = ctx
        if param is not None and e.param is None:
            e.param = param
        raise
    except UsageError as e:
        if e.ctx is None:
            e.ctx = ctx
        raise


def iter_params_for_processing(
    invocation_order: t.Sequence["Parameter"],
    declaration_order: t.Sequence["Parameter"],
) -> t.List["Parameter"]:
    

    def sort_key(item: "Parameter") -> t.Tuple[bool, float]:
        try:
            idx: float = invocation_order.index(item)
        except ValueError:
            idx = float("inf")

        return not item.is_eager, idx

    return sorted(declaration_order, key=sort_key)


class ParameterSource(enum.Enum):
    

    COMMANDLINE = enum.auto()
    
    ENVIRONMENT = enum.auto()
    
    DEFAULT = enum.auto()
    
    DEFAULT_MAP = enum.auto()
    
    PROMPT = enum.auto()
    


class Context:
    

    
    
    
    formatter_class: t.Type["HelpFormatter"] = HelpFormatter

    def __init__(
        self,
        command: "Command",
        parent: t.Optional["Context"] = None,
        info_name: t.Optional[str] = None,
        obj: t.Optional[t.Any] = None,
        auto_envvar_prefix: t.Optional[str] = None,
        default_map: t.Optional[t.MutableMapping[str, t.Any]] = None,
        terminal_width: t.Optional[int] = None,
        max_content_width: t.Optional[int] = None,
        resilient_parsing: bool = False,
        allow_extra_args: t.Optional[bool] = None,
        allow_interspersed_args: t.Optional[bool] = None,
        ignore_unknown_options: t.Optional[bool] = None,
        help_option_names: t.Optional[t.List[str]] = None,
        token_normalize_func: t.Optional[t.Callable[[str], str]] = None,
        color: t.Optional[bool] = None,
        show_default: t.Optional[bool] = None,
    ) -> None:
        
        self.parent = parent
        
        self.command = command
        
        self.info_name = info_name
        
        
        self.params: t.Dict[str, t.Any] = {}
        
        self.args: t.List[str] = []
        
        
        
        
        self.protected_args: t.List[str] = []
        
        self._opt_prefixes: t.Set[str] = set(parent._opt_prefixes) if parent else set()

        if obj is None and parent is not None:
            obj = parent.obj

        
        self.obj: t.Any = obj
        self._meta: t.Dict[str, t.Any] = getattr(parent, "meta", {})

        
        if (
            default_map is None
            and info_name is not None
            and parent is not None
            and parent.default_map is not None
        ):
            default_map = parent.default_map.get(info_name)

        self.default_map: t.Optional[t.MutableMapping[str, t.Any]] = default_map

        
        
        
        
        
        
        
        
        
        
        self.invoked_subcommand: t.Optional[str] = None

        if terminal_width is None and parent is not None:
            terminal_width = parent.terminal_width

        
        self.terminal_width: t.Optional[int] = terminal_width

        if max_content_width is None and parent is not None:
            max_content_width = parent.max_content_width

        
        
        self.max_content_width: t.Optional[int] = max_content_width

        if allow_extra_args is None:
            allow_extra_args = command.allow_extra_args

        
        
        
        
        self.allow_extra_args = allow_extra_args

        if allow_interspersed_args is None:
            allow_interspersed_args = command.allow_interspersed_args

        
        
        
        
        self.allow_interspersed_args: bool = allow_interspersed_args

        if ignore_unknown_options is None:
            ignore_unknown_options = command.ignore_unknown_options

        
        
        
        
        
        
        
        
        self.ignore_unknown_options: bool = ignore_unknown_options

        if help_option_names is None:
            if parent is not None:
                help_option_names = parent.help_option_names
            else:
                help_option_names = ["--help"]

        
        self.help_option_names: t.List[str] = help_option_names

        if token_normalize_func is None and parent is not None:
            token_normalize_func = parent.token_normalize_func

        
        
        self.token_normalize_func: t.Optional[
            t.Callable[[str], str]
        ] = token_normalize_func

        
        
        
        self.resilient_parsing: bool = resilient_parsing

        
        
        
        if auto_envvar_prefix is None:
            if (
                parent is not None
                and parent.auto_envvar_prefix is not None
                and self.info_name is not None
            ):
                auto_envvar_prefix = (
                    f"{parent.auto_envvar_prefix}_{self.info_name.upper()}"
                )
        else:
            auto_envvar_prefix = auto_envvar_prefix.upper()

        if auto_envvar_prefix is not None:
            auto_envvar_prefix = auto_envvar_prefix.replace("-", "_")

        self.auto_envvar_prefix: t.Optional[str] = auto_envvar_prefix

        if color is None and parent is not None:
            color = parent.color

        
        self.color: t.Optional[bool] = color

        if show_default is None and parent is not None:
            show_default = parent.show_default

        
        self.show_default: t.Optional[bool] = show_default

        self._close_callbacks: t.List[t.Callable[[], t.Any]] = []
        self._depth = 0
        self._parameter_source: t.Dict[str, ParameterSource] = {}
        self._exit_stack = ExitStack()

    def to_info_dict(self) -> t.Dict[str, t.Any]:
        
        return {
            "command": self.command.to_info_dict(self),
            "info_name": self.info_name,
            "allow_extra_args": self.allow_extra_args,
            "allow_interspersed_args": self.allow_interspersed_args,
            "ignore_unknown_options": self.ignore_unknown_options,
            "auto_envvar_prefix": self.auto_envvar_prefix,
        }

    def __enter__(self) -> "Context":
        self._depth += 1
        push_context(self)
        return self

    def __exit__(
        self,
        exc_type: t.Optional[t.Type[BaseException]],
        exc_value: t.Optional[BaseException],
        tb: t.Optional[TracebackType],
    ) -> None:
        self._depth -= 1
        if self._depth == 0:
            self.close()
        pop_context()

    @contextmanager
    def scope(self, cleanup: bool = True) -> t.Iterator["Context"]:
        
        if not cleanup:
            self._depth += 1
        try:
            with self as rv:
                yield rv
        finally:
            if not cleanup:
                self._depth -= 1

    @property
    def meta(self) -> t.Dict[str, t.Any]:
        
        return self._meta

    def make_formatter(self) -> HelpFormatter:
        
        return self.formatter_class(
            width=self.terminal_width, max_width=self.max_content_width
        )

    def with_resource(self, context_manager: t.ContextManager[V]) -> V:
        
        return self._exit_stack.enter_context(context_manager)

    def call_on_close(self, f: t.Callable[..., t.Any]) -> t.Callable[..., t.Any]:
        
        return self._exit_stack.callback(f)

    def close(self) -> None:
        
        self._exit_stack.close()
        
        self._exit_stack = ExitStack()

    @property
    def command_path(self) -> str:
        
        rv = ""
        if self.info_name is not None:
            rv = self.info_name
        if self.parent is not None:
            parent_command_path = [self.parent.command_path]

            if isinstance(self.parent.command, Command):
                for param in self.parent.command.get_params(self):
                    parent_command_path.extend(param.get_usage_pieces(self))

            rv = f"{' '.join(parent_command_path)} {rv}"
        return rv.lstrip()

    def find_root(self) -> "Context":
        
        node = self
        while node.parent is not None:
            node = node.parent
        return node

    def find_object(self, object_type: t.Type[V]) -> t.Optional[V]:
        
        node: t.Optional["Context"] = self

        while node is not None:
            if isinstance(node.obj, object_type):
                return node.obj

            node = node.parent

        return None

    def ensure_object(self, object_type: t.Type[V]) -> V:
        
        rv = self.find_object(object_type)
        if rv is None:
            self.obj = rv = object_type()
        return rv

    @t.overload
    def lookup_default(
        self, name: str, call: "te.Literal[True]" = True
    ) -> t.Optional[t.Any]:
        ...

    @t.overload
    def lookup_default(
        self, name: str, call: "te.Literal[False]" = ...
    ) -> t.Optional[t.Union[t.Any, t.Callable[[], t.Any]]]:
        ...

    def lookup_default(self, name: str, call: bool = True) -> t.Optional[t.Any]:
        
        if self.default_map is not None:
            value = self.default_map.get(name)

            if call and callable(value):
                return value()

            return value

        return None

    def fail(self, message: str) -> "te.NoReturn":
        
        raise UsageError(message, self)

    def abort(self) -> "te.NoReturn":
        
        raise Abort()

    def exit(self, code: int = 0) -> "te.NoReturn":
        
        raise Exit(code)

    def get_usage(self) -> str:
        
        return self.command.get_usage(self)

    def get_help(self) -> str:
        
        return self.command.get_help(self)

    def _make_sub_context(self, command: "Command") -> "Context":
        
        return type(self)(command, info_name=command.name, parent=self)

    @t.overload
    def invoke(
        __self,  
        __callback: "t.Callable[..., V]",
        *args: t.Any,
        **kwargs: t.Any,
    ) -> V:
        ...

    @t.overload
    def invoke(
        __self,  
        __callback: "Command",
        *args: t.Any,
        **kwargs: t.Any,
    ) -> t.Any:
        ...

    def invoke(
        __self,  
        __callback: t.Union["Command", "t.Callable[..., V]"],
        *args: t.Any,
        **kwargs: t.Any,
    ) -> t.Union[t.Any, V]:
        
        if isinstance(__callback, Command):
            other_cmd = __callback

            if other_cmd.callback is None:
                raise TypeError(
                    "The given command does not have a callback that can be invoked."
                )
            else:
                __callback = t.cast("t.Callable[..., V]", other_cmd.callback)

            ctx = __self._make_sub_context(other_cmd)

            for param in other_cmd.params:
                if param.name not in kwargs and param.expose_value:
                    kwargs[param.name] = param.type_cast_value(  
                        ctx, param.get_default(ctx)
                    )

            
            
            ctx.params.update(kwargs)
        else:
            ctx = __self

        with augment_usage_errors(__self):
            with ctx:
                return __callback(*args, **kwargs)

    def forward(
        __self, __cmd: "Command", *args: t.Any, **kwargs: t.Any  
    ) -> t.Any:
        
        
        if not isinstance(__cmd, Command):
            raise TypeError("Callback is not a command.")

        for param in __self.params:
            if param not in kwargs:
                kwargs[param] = __self.params[param]

        return __self.invoke(__cmd, *args, **kwargs)

    def set_parameter_source(self, name: str, source: ParameterSource) -> None:
        
        self._parameter_source[name] = source

    def get_parameter_source(self, name: str) -> t.Optional[ParameterSource]:
        
        return self._parameter_source.get(name)


class BaseCommand:
    

    
    
    
    context_class: t.Type[Context] = Context
    
    allow_extra_args = False
    
    allow_interspersed_args = True
    
    ignore_unknown_options = False

    def __init__(
        self,
        name: t.Optional[str],
        context_settings: t.Optional[t.MutableMapping[str, t.Any]] = None,
    ) -> None:
        
        
        
        
        self.name = name

        if context_settings is None:
            context_settings = {}

        
        self.context_settings: t.MutableMapping[str, t.Any] = context_settings

    def to_info_dict(self, ctx: Context) -> t.Dict[str, t.Any]:
        
        return {"name": self.name}

    def __repr__(self) -> str:
        return f"<{self.__class__.__name__} {self.name}>"

    def get_usage(self, ctx: Context) -> str:
        raise NotImplementedError("Base commands cannot get usage")

    def get_help(self, ctx: Context) -> str:
        raise NotImplementedError("Base commands cannot get help")

    def make_context(
        self,
        info_name: t.Optional[str],
        args: t.List[str],
        parent: t.Optional[Context] = None,
        **extra: t.Any,
    ) -> Context:
        
        for key, value in self.context_settings.items():
            if key not in extra:
                extra[key] = value

        ctx = self.context_class(
            self, info_name=info_name, parent=parent, **extra  
        )

        with ctx.scope(cleanup=False):
            self.parse_args(ctx, args)
        return ctx

    def parse_args(self, ctx: Context, args: t.List[str]) -> t.List[str]:
        
        raise NotImplementedError("Base commands do not know how to parse arguments.")

    def invoke(self, ctx: Context) -> t.Any:
        
        raise NotImplementedError("Base commands are not invocable by default")

    def shell_complete(self, ctx: Context, incomplete: str) -> t.List["CompletionItem"]:
        
        from click.shell_completion import CompletionItem

        results: t.List["CompletionItem"] = []

        while ctx.parent is not None:
            ctx = ctx.parent

            if isinstance(ctx.command, MultiCommand) and ctx.command.chain:
                results.extend(
                    CompletionItem(name, help=command.get_short_help_str())
                    for name, command in _complete_visible_commands(ctx, incomplete)
                    if name not in ctx.protected_args
                )

        return results

    @t.overload
    def main(
        self,
        args: t.Optional[t.Sequence[str]] = None,
        prog_name: t.Optional[str] = None,
        complete_var: t.Optional[str] = None,
        standalone_mode: "te.Literal[True]" = True,
        **extra: t.Any,
    ) -> "te.NoReturn":
        ...

    @t.overload
    def main(
        self,
        args: t.Optional[t.Sequence[str]] = None,
        prog_name: t.Optional[str] = None,
        complete_var: t.Optional[str] = None,
        standalone_mode: bool = ...,
        **extra: t.Any,
    ) -> t.Any:
        ...

    def main(
        self,
        args: t.Optional[t.Sequence[str]] = None,
        prog_name: t.Optional[str] = None,
        complete_var: t.Optional[str] = None,
        standalone_mode: bool = True,
        windows_expand_args: bool = True,
        **extra: t.Any,
    ) -> t.Any:
        
        if args is None:
            args = sys.argv[1:]

            if os.name == "nt" and windows_expand_args:
                args = _expand_args(args)
        else:
            args = list(args)

        if prog_name is None:
            prog_name = _detect_program_name()

        
        self._main_shell_completion(extra, prog_name, complete_var)

        try:
            try:
                with self.make_context(prog_name, args, **extra) as ctx:
                    rv = self.invoke(ctx)
                    if not standalone_mode:
                        return rv
                    
                    
                    
                    
                    
                    
                    
                    ctx.exit()
            except (EOFError, KeyboardInterrupt) as e:
                echo(file=sys.stderr)
                raise Abort() from e
            except ClickException as e:
                if not standalone_mode:
                    raise
                e.show()
                sys.exit(e.exit_code)
            except OSError as e:
                if e.errno == errno.EPIPE:
                    sys.stdout = t.cast(t.TextIO, PacifyFlushWrapper(sys.stdout))
                    sys.stderr = t.cast(t.TextIO, PacifyFlushWrapper(sys.stderr))
                    sys.exit(1)
                else:
                    raise
        except Exit as e:
            if standalone_mode:
                sys.exit(e.exit_code)
            else:
                
                
                
                
                
                
                
                
                return e.exit_code
        except Abort:
            if not standalone_mode:
                raise
            echo(_("Aborted!"), file=sys.stderr)
            sys.exit(1)

    def _main_shell_completion(
        self,
        ctx_args: t.MutableMapping[str, t.Any],
        prog_name: str,
        complete_var: t.Optional[str] = None,
    ) -> None:
        
        if complete_var is None:
            complete_name = prog_name.replace("-", "_").replace(".", "_")
            complete_var = f"_{complete_name}_COMPLETE".upper()

        instruction = os.environ.get(complete_var)

        if not instruction:
            return

        from .shell_completion import shell_complete

        rv = shell_complete(self, ctx_args, prog_name, complete_var, instruction)
        sys.exit(rv)

    def __call__(self, *args: t.Any, **kwargs: t.Any) -> t.Any:
        
        return self.main(*args, **kwargs)


class Command(BaseCommand):
    

    def __init__(
        self,
        name: t.Optional[str],
        context_settings: t.Optional[t.MutableMapping[str, t.Any]] = None,
        callback: t.Optional[t.Callable[..., t.Any]] = None,
        params: t.Optional[t.List["Parameter"]] = None,
        help: t.Optional[str] = None,
        epilog: t.Optional[str] = None,
        short_help: t.Optional[str] = None,
        options_metavar: t.Optional[str] = "[OPTIONS]",
        add_help_option: bool = True,
        no_args_is_help: bool = False,
        hidden: bool = False,
        deprecated: bool = False,
    ) -> None:
        super().__init__(name, context_settings)
        
        
        self.callback = callback
        
        
        
        self.params: t.List["Parameter"] = params or []
        self.help = help
        self.epilog = epilog
        self.options_metavar = options_metavar
        self.short_help = short_help
        self.add_help_option = add_help_option
        self.no_args_is_help = no_args_is_help
        self.hidden = hidden
        self.deprecated = deprecated

    def to_info_dict(self, ctx: Context) -> t.Dict[str, t.Any]:
        info_dict = super().to_info_dict(ctx)
        info_dict.update(
            params=[param.to_info_dict() for param in self.get_params(ctx)],
            help=self.help,
            epilog=self.epilog,
            short_help=self.short_help,
            hidden=self.hidden,
            deprecated=self.deprecated,
        )
        return info_dict

    def get_usage(self, ctx: Context) -> str:
        
        formatter = ctx.make_formatter()
        self.format_usage(ctx, formatter)
        return formatter.getvalue().rstrip("\n")

    def get_params(self, ctx: Context) -> t.List["Parameter"]:
        rv = self.params
        help_option = self.get_help_option(ctx)

        if help_option is not None:
            rv = [*rv, help_option]

        return rv

    def format_usage(self, ctx: Context, formatter: HelpFormatter) -> None:
        
        pieces = self.collect_usage_pieces(ctx)
        formatter.write_usage(ctx.command_path, " ".join(pieces))

    def collect_usage_pieces(self, ctx: Context) -> t.List[str]:
        
        rv = [self.options_metavar] if self.options_metavar else []

        for param in self.get_params(ctx):
            rv.extend(param.get_usage_pieces(ctx))

        return rv

    def get_help_option_names(self, ctx: Context) -> t.List[str]:
        
        all_names = set(ctx.help_option_names)
        for param in self.params:
            all_names.difference_update(param.opts)
            all_names.difference_update(param.secondary_opts)
        return list(all_names)

    def get_help_option(self, ctx: Context) -> t.Optional["Option"]:
        
        help_options = self.get_help_option_names(ctx)

        if not help_options or not self.add_help_option:
            return None

        def show_help(ctx: Context, param: "Parameter", value: str) -> None:
            if value and not ctx.resilient_parsing:
                echo(ctx.get_help(), color=ctx.color)
                ctx.exit()

        return Option(
            help_options,
            is_flag=True,
            is_eager=True,
            expose_value=False,
            callback=show_help,
            help=_("Show this message and exit."),
        )

    def make_parser(self, ctx: Context) -> OptionParser:
        
        parser = OptionParser(ctx)
        for param in self.get_params(ctx):
            param.add_to_parser(parser, ctx)
        return parser

    def get_help(self, ctx: Context) -> str:
        
        formatter = ctx.make_formatter()
        self.format_help(ctx, formatter)
        return formatter.getvalue().rstrip("\n")

    def get_short_help_str(self, limit: int = 45) -> str:
        
        if self.short_help:
            text = inspect.cleandoc(self.short_help)
        elif self.help:
            text = make_default_short_help(self.help, limit)
        else:
            text = ""

        if self.deprecated:
            text = _("(Deprecated) {text}").format(text=text)

        return text.strip()

    def format_help(self, ctx: Context, formatter: HelpFormatter) -> None:
        
        self.format_usage(ctx, formatter)
        self.format_help_text(ctx, formatter)
        self.format_options(ctx, formatter)
        self.format_epilog(ctx, formatter)

    def format_help_text(self, ctx: Context, formatter: HelpFormatter) -> None:
        
        if self.help is not None:
            
            text = inspect.cleandoc(self.help).partition("\f")[0]
        else:
            text = ""

        if self.deprecated:
            text = _("(Deprecated) {text}").format(text=text)

        if text:
            formatter.write_paragraph()

            with formatter.indentation():
                formatter.write_text(text)

    def format_options(self, ctx: Context, formatter: HelpFormatter) -> None:
        
        opts = []
        for param in self.get_params(ctx):
            rv = param.get_help_record(ctx)
            if rv is not None:
                opts.append(rv)

        if opts:
            with formatter.section(_("Options")):
                formatter.write_dl(opts)

    def format_epilog(self, ctx: Context, formatter: HelpFormatter) -> None:
        
        if self.epilog:
            epilog = inspect.cleandoc(self.epilog)
            formatter.write_paragraph()

            with formatter.indentation():
                formatter.write_text(epilog)

    def parse_args(self, ctx: Context, args: t.List[str]) -> t.List[str]:
        if not args and self.no_args_is_help and not ctx.resilient_parsing:
            echo(ctx.get_help(), color=ctx.color)
            ctx.exit()

        parser = self.make_parser(ctx)
        opts, args, param_order = parser.parse_args(args=args)

        for param in iter_params_for_processing(param_order, self.get_params(ctx)):
            value, args = param.handle_parse_result(ctx, opts, args)

        if args and not ctx.allow_extra_args and not ctx.resilient_parsing:
            ctx.fail(
                ngettext(
                    "Got unexpected extra argument ({args})",
                    "Got unexpected extra arguments ({args})",
                    len(args),
                ).format(args=" ".join(map(str, args)))
            )

        ctx.args = args
        ctx._opt_prefixes.update(parser._opt_prefixes)
        return args

    def invoke(self, ctx: Context) -> t.Any:
        
        if self.deprecated:
            message = _(
                "DeprecationWarning: The command {name!r} is deprecated."
            ).format(name=self.name)
            echo(style(message, fg="red"), err=True)

        if self.callback is not None:
            return ctx.invoke(self.callback, **ctx.params)

    def shell_complete(self, ctx: Context, incomplete: str) -> t.List["CompletionItem"]:
        
        from click.shell_completion import CompletionItem

        results: t.List["CompletionItem"] = []

        if incomplete and not incomplete[0].isalnum():
            for param in self.get_params(ctx):
                if (
                    not isinstance(param, Option)
                    or param.hidden
                    or (
                        not param.multiple
                        and ctx.get_parameter_source(param.name)  
                        is ParameterSource.COMMANDLINE
                    )
                ):
                    continue

                results.extend(
                    CompletionItem(name, help=param.help)
                    for name in [*param.opts, *param.secondary_opts]
                    if name.startswith(incomplete)
                )

        results.extend(super().shell_complete(ctx, incomplete))
        return results


class MultiCommand(Command):
    

    allow_extra_args = True
    allow_interspersed_args = False

    def __init__(
        self,
        name: t.Optional[str] = None,
        invoke_without_command: bool = False,
        no_args_is_help: t.Optional[bool] = None,
        subcommand_metavar: t.Optional[str] = None,
        chain: bool = False,
        result_callback: t.Optional[t.Callable[..., t.Any]] = None,
        **attrs: t.Any,
    ) -> None:
        super().__init__(name, **attrs)

        if no_args_is_help is None:
            no_args_is_help = not invoke_without_command

        self.no_args_is_help = no_args_is_help
        self.invoke_without_command = invoke_without_command

        if subcommand_metavar is None:
            if chain:
                subcommand_metavar = "COMMAND1 [ARGS]... [COMMAND2 [ARGS]...]..."
            else:
                subcommand_metavar = "COMMAND [ARGS]..."

        self.subcommand_metavar = subcommand_metavar
        self.chain = chain
        
        
        self._result_callback = result_callback

        if self.chain:
            for param in self.params:
                if isinstance(param, Argument) and not param.required:
                    raise RuntimeError(
                        "Multi commands in chain mode cannot have"
                        " optional arguments."
                    )

    def to_info_dict(self, ctx: Context) -> t.Dict[str, t.Any]:
        info_dict = super().to_info_dict(ctx)
        commands = {}

        for name in self.list_commands(ctx):
            command = self.get_command(ctx, name)

            if command is None:
                continue

            sub_ctx = ctx._make_sub_context(command)

            with sub_ctx.scope(cleanup=False):
                commands[name] = command.to_info_dict(sub_ctx)

        info_dict.update(commands=commands, chain=self.chain)
        return info_dict

    def collect_usage_pieces(self, ctx: Context) -> t.List[str]:
        rv = super().collect_usage_pieces(ctx)
        rv.append(self.subcommand_metavar)
        return rv

    def format_options(self, ctx: Context, formatter: HelpFormatter) -> None:
        super().format_options(ctx, formatter)
        self.format_commands(ctx, formatter)

    def result_callback(self, replace: bool = False) -> t.Callable[[F], F]:
        

        def decorator(f: F) -> F:
            old_callback = self._result_callback

            if old_callback is None or replace:
                self._result_callback = f
                return f

            def function(__value, *args, **kwargs):  
                inner = old_callback(__value, *args, **kwargs)
                return f(inner, *args, **kwargs)

            self._result_callback = rv = update_wrapper(t.cast(F, function), f)
            return rv

        return decorator

    def format_commands(self, ctx: Context, formatter: HelpFormatter) -> None:
        
        commands = []
        for subcommand in self.list_commands(ctx):
            cmd = self.get_command(ctx, subcommand)
            
            if cmd is None:
                continue
            if cmd.hidden:
                continue

            commands.append((subcommand, cmd))

        
        if len(commands):
            limit = formatter.width - 6 - max(len(cmd[0]) for cmd in commands)

            rows = []
            for subcommand, cmd in commands:
                help = cmd.get_short_help_str(limit)
                rows.append((subcommand, help))

            if rows:
                with formatter.section(_("Commands")):
                    formatter.write_dl(rows)

    def parse_args(self, ctx: Context, args: t.List[str]) -> t.List[str]:
        if not args and self.no_args_is_help and not ctx.resilient_parsing:
            echo(ctx.get_help(), color=ctx.color)
            ctx.exit()

        rest = super().parse_args(ctx, args)

        if self.chain:
            ctx.protected_args = rest
            ctx.args = []
        elif rest:
            ctx.protected_args, ctx.args = rest[:1], rest[1:]

        return ctx.args

    def invoke(self, ctx: Context) -> t.Any:
        def _process_result(value: t.Any) -> t.Any:
            if self._result_callback is not None:
                value = ctx.invoke(self._result_callback, value, **ctx.params)
            return value

        if not ctx.protected_args:
            if self.invoke_without_command:
                
                
                
                with ctx:
                    rv = super().invoke(ctx)
                    return _process_result([] if self.chain else rv)
            ctx.fail(_("Missing command."))

        
        args = [*ctx.protected_args, *ctx.args]
        ctx.args = []
        ctx.protected_args = []

        
        
        
        if not self.chain:
            
            
            with ctx:
                cmd_name, cmd, args = self.resolve_command(ctx, args)
                assert cmd is not None
                ctx.invoked_subcommand = cmd_name
                super().invoke(ctx)
                sub_ctx = cmd.make_context(cmd_name, args, parent=ctx)
                with sub_ctx:
                    return _process_result(sub_ctx.command.invoke(sub_ctx))

        
        
        
        
        
        with ctx:
            ctx.invoked_subcommand = "*" if args else None
            super().invoke(ctx)

            
            
            
            contexts = []
            while args:
                cmd_name, cmd, args = self.resolve_command(ctx, args)
                assert cmd is not None
                sub_ctx = cmd.make_context(
                    cmd_name,
                    args,
                    parent=ctx,
                    allow_extra_args=True,
                    allow_interspersed_args=False,
                )
                contexts.append(sub_ctx)
                args, sub_ctx.args = sub_ctx.args, []

            rv = []
            for sub_ctx in contexts:
                with sub_ctx:
                    rv.append(sub_ctx.command.invoke(sub_ctx))
            return _process_result(rv)

    def resolve_command(
        self, ctx: Context, args: t.List[str]
    ) -> t.Tuple[t.Optional[str], t.Optional[Command], t.List[str]]:
        cmd_name = make_str(args[0])
        original_cmd_name = cmd_name

        
        cmd = self.get_command(ctx, cmd_name)

        
        
        if cmd is None and ctx.token_normalize_func is not None:
            cmd_name = ctx.token_normalize_func(cmd_name)
            cmd = self.get_command(ctx, cmd_name)

        
        
        
        
        
        
        if cmd is None and not ctx.resilient_parsing:
            if split_opt(cmd_name)[0]:
                self.parse_args(ctx, ctx.args)
            ctx.fail(_("No such command {name!r}.").format(name=original_cmd_name))
        return cmd_name if cmd else None, cmd, args[1:]

    def get_command(self, ctx: Context, cmd_name: str) -> t.Optional[Command]:
        
        raise NotImplementedError

    def list_commands(self, ctx: Context) -> t.List[str]:
        
        return []

    def shell_complete(self, ctx: Context, incomplete: str) -> t.List["CompletionItem"]:
        
        from click.shell_completion import CompletionItem

        results = [
            CompletionItem(name, help=command.get_short_help_str())
            for name, command in _complete_visible_commands(ctx, incomplete)
        ]
        results.extend(super().shell_complete(ctx, incomplete))
        return results


class Group(MultiCommand):
    

    
    
    
    
    
    command_class: t.Optional[t.Type[Command]] = None

    
    
    
    
    
    
    
    
    
    
    group_class: t.Optional[t.Union[t.Type["Group"], t.Type[type]]] = None
    

    def __init__(
        self,
        name: t.Optional[str] = None,
        commands: t.Optional[
            t.Union[t.MutableMapping[str, Command], t.Sequence[Command]]
        ] = None,
        **attrs: t.Any,
    ) -> None:
        super().__init__(name, **attrs)

        if commands is None:
            commands = {}
        elif isinstance(commands, abc.Sequence):
            commands = {c.name: c for c in commands if c.name is not None}

        
        self.commands: t.MutableMapping[str, Command] = commands

    def add_command(self, cmd: Command, name: t.Optional[str] = None) -> None:
        
        name = name or cmd.name
        if name is None:
            raise TypeError("Command has no name.")
        _check_multicommand(self, name, cmd, register=True)
        self.commands[name] = cmd

    @t.overload
    def command(self, __func: t.Callable[..., t.Any]) -> Command:
        ...

    @t.overload
    def command(
        self, *args: t.Any, **kwargs: t.Any
    ) -> t.Callable[[t.Callable[..., t.Any]], Command]:
        ...

    def command(
        self, *args: t.Any, **kwargs: t.Any
    ) -> t.Union[t.Callable[[t.Callable[..., t.Any]], Command], Command]:
        
        from .decorators import command

        func: t.Optional[t.Callable[..., t.Any]] = None

        if args and callable(args[0]):
            assert (
                len(args) == 1 and not kwargs
            ), "Use 'command(**kwargs)(callable)' to provide arguments."
            (func,) = args
            args = ()

        if self.command_class and kwargs.get("cls") is None:
            kwargs["cls"] = self.command_class

        def decorator(f: t.Callable[..., t.Any]) -> Command:
            cmd: Command = command(*args, **kwargs)(f)
            self.add_command(cmd)
            return cmd

        if func is not None:
            return decorator(func)

        return decorator

    @t.overload
    def group(self, __func: t.Callable[..., t.Any]) -> "Group":
        ...

    @t.overload
    def group(
        self, *args: t.Any, **kwargs: t.Any
    ) -> t.Callable[[t.Callable[..., t.Any]], "Group"]:
        ...

    def group(
        self, *args: t.Any, **kwargs: t.Any
    ) -> t.Union[t.Callable[[t.Callable[..., t.Any]], "Group"], "Group"]:
        
        from .decorators import group

        func: t.Optional[t.Callable[..., t.Any]] = None

        if args and callable(args[0]):
            assert (
                len(args) == 1 and not kwargs
            ), "Use 'group(**kwargs)(callable)' to provide arguments."
            (func,) = args
            args = ()

        if self.group_class is not None and kwargs.get("cls") is None:
            if self.group_class is type:
                kwargs["cls"] = type(self)
            else:
                kwargs["cls"] = self.group_class

        def decorator(f: t.Callable[..., t.Any]) -> "Group":
            cmd: Group = group(*args, **kwargs)(f)
            self.add_command(cmd)
            return cmd

        if func is not None:
            return decorator(func)

        return decorator

    def get_command(self, ctx: Context, cmd_name: str) -> t.Optional[Command]:
        return self.commands.get(cmd_name)

    def list_commands(self, ctx: Context) -> t.List[str]:
        return sorted(self.commands)


class CommandCollection(MultiCommand):
    

    def __init__(
        self,
        name: t.Optional[str] = None,
        sources: t.Optional[t.List[MultiCommand]] = None,
        **attrs: t.Any,
    ) -> None:
        super().__init__(name, **attrs)
        
        self.sources: t.List[MultiCommand] = sources or []

    def add_source(self, multi_cmd: MultiCommand) -> None:
        
        self.sources.append(multi_cmd)

    def get_command(self, ctx: Context, cmd_name: str) -> t.Optional[Command]:
        for source in self.sources:
            rv = source.get_command(ctx, cmd_name)

            if rv is not None:
                if self.chain:
                    _check_multicommand(self, cmd_name, rv)

                return rv

        return None

    def list_commands(self, ctx: Context) -> t.List[str]:
        rv: t.Set[str] = set()

        for source in self.sources:
            rv.update(source.list_commands(ctx))

        return sorted(rv)


def _check_iter(value: t.Any) -> t.Iterator[t.Any]:
    
    if isinstance(value, str):
        raise TypeError

    return iter(value)


class Parameter:
    r

    param_type_name = "parameter"

    def __init__(
        self,
        param_decls: t.Optional[t.Sequence[str]] = None,
        type: t.Optional[t.Union[types.ParamType, t.Any]] = None,
        required: bool = False,
        default: t.Optional[t.Union[t.Any, t.Callable[[], t.Any]]] = None,
        callback: t.Optional[t.Callable[[Context, "Parameter", t.Any], t.Any]] = None,
        nargs: t.Optional[int] = None,
        multiple: bool = False,
        metavar: t.Optional[str] = None,
        expose_value: bool = True,
        is_eager: bool = False,
        envvar: t.Optional[t.Union[str, t.Sequence[str]]] = None,
        shell_complete: t.Optional[
            t.Callable[
                [Context, "Parameter", str],
                t.Union[t.List["CompletionItem"], t.List[str]],
            ]
        ] = None,
    ) -> None:
        self.name: t.Optional[str]
        self.opts: t.List[str]
        self.secondary_opts: t.List[str]
        self.name, self.opts, self.secondary_opts = self._parse_decls(
            param_decls or (), expose_value
        )
        self.type: types.ParamType = types.convert_type(type, default)

        
        
        if nargs is None:
            if self.type.is_composite:
                nargs = self.type.arity
            else:
                nargs = 1

        self.required = required
        self.callback = callback
        self.nargs = nargs
        self.multiple = multiple
        self.expose_value = expose_value
        self.default = default
        self.is_eager = is_eager
        self.metavar = metavar
        self.envvar = envvar
        self._custom_shell_complete = shell_complete

        if __debug__:
            if self.type.is_composite and nargs != self.type.arity:
                raise ValueError(
                    f"'nargs' must be {self.type.arity} (or None) for"
                    f" type {self.type!r}, but it was {nargs}."
                )

            
            check_default = default if not callable(default) else None

            if check_default is not None:
                if multiple:
                    try:
                        
                        check_default = next(_check_iter(check_default), None)
                    except TypeError:
                        raise ValueError(
                            "'default' must be a list when 'multiple' is true."
                        ) from None

                
                if nargs != 1 and check_default is not None:
                    try:
                        _check_iter(check_default)
                    except TypeError:
                        if multiple:
                            message = (
                                "'default' must be a list of lists when 'multiple' is"
                                " true and 'nargs' != 1."
                            )
                        else:
                            message = "'default' must be a list when 'nargs' != 1."

                        raise ValueError(message) from None

                    if nargs > 1 and len(check_default) != nargs:
                        subject = "item length" if multiple else "length"
                        raise ValueError(
                            f"'default' {subject} must match nargs={nargs}."
                        )

    def to_info_dict(self) -> t.Dict[str, t.Any]:
        
        return {
            "name": self.name,
            "param_type_name": self.param_type_name,
            "opts": self.opts,
            "secondary_opts": self.secondary_opts,
            "type": self.type.to_info_dict(),
            "required": self.required,
            "nargs": self.nargs,
            "multiple": self.multiple,
            "default": self.default,
            "envvar": self.envvar,
        }

    def __repr__(self) -> str:
        return f"<{self.__class__.__name__} {self.name}>"

    def _parse_decls(
        self, decls: t.Sequence[str], expose_value: bool
    ) -> t.Tuple[t.Optional[str], t.List[str], t.List[str]]:
        raise NotImplementedError()

    @property
    def human_readable_name(self) -> str:
        
        return self.name  

    def make_metavar(self) -> str:
        if self.metavar is not None:
            return self.metavar

        metavar = self.type.get_metavar(self)

        if metavar is None:
            metavar = self.type.name.upper()

        if self.nargs != 1:
            metavar += "..."

        return metavar

    @t.overload
    def get_default(
        self, ctx: Context, call: "te.Literal[True]" = True
    ) -> t.Optional[t.Any]:
        ...

    @t.overload
    def get_default(
        self, ctx: Context, call: bool = ...
    ) -> t.Optional[t.Union[t.Any, t.Callable[[], t.Any]]]:
        ...

    def get_default(
        self, ctx: Context, call: bool = True
    ) -> t.Optional[t.Union[t.Any, t.Callable[[], t.Any]]]:
        
        value = ctx.lookup_default(self.name, call=False)  

        if value is None:
            value = self.default

        if call and callable(value):
            value = value()

        return value

    def add_to_parser(self, parser: OptionParser, ctx: Context) -> None:
        raise NotImplementedError()

    def consume_value(
        self, ctx: Context, opts: t.Mapping[str, t.Any]
    ) -> t.Tuple[t.Any, ParameterSource]:
        value = opts.get(self.name)  
        source = ParameterSource.COMMANDLINE

        if value is None:
            value = self.value_from_envvar(ctx)
            source = ParameterSource.ENVIRONMENT

        if value is None:
            value = ctx.lookup_default(self.name)  
            source = ParameterSource.DEFAULT_MAP

        if value is None:
            value = self.get_default(ctx)
            source = ParameterSource.DEFAULT

        return value, source

    def type_cast_value(self, ctx: Context, value: t.Any) -> t.Any:
        
        if value is None:
            return () if self.multiple or self.nargs == -1 else None

        def check_iter(value: t.Any) -> t.Iterator[t.Any]:
            try:
                return _check_iter(value)
            except TypeError:
                
                
                
                raise BadParameter(
                    _("Value must be an iterable."), ctx=ctx, param=self
                ) from None

        if self.nargs == 1 or self.type.is_composite:

            def convert(value: t.Any) -> t.Any:
                return self.type(value, param=self, ctx=ctx)

        elif self.nargs == -1:

            def convert(value: t.Any) -> t.Any:  
                return tuple(self.type(x, self, ctx) for x in check_iter(value))

        else:  

            def convert(value: t.Any) -> t.Any:  
                value = tuple(check_iter(value))

                if len(value) != self.nargs:
                    raise BadParameter(
                        ngettext(
                            "Takes {nargs} values but 1 was given.",
                            "Takes {nargs} values but {len} were given.",
                            len(value),
                        ).format(nargs=self.nargs, len=len(value)),
                        ctx=ctx,
                        param=self,
                    )

                return tuple(self.type(x, self, ctx) for x in value)

        if self.multiple:
            return tuple(convert(x) for x in check_iter(value))

        return convert(value)

    def value_is_missing(self, value: t.Any) -> bool:
        if value is None:
            return True

        if (self.nargs != 1 or self.multiple) and value == ():
            return True

        return False

    def process_value(self, ctx: Context, value: t.Any) -> t.Any:
        value = self.type_cast_value(ctx, value)

        if self.required and self.value_is_missing(value):
            raise MissingParameter(ctx=ctx, param=self)

        if self.callback is not None:
            value = self.callback(ctx, self, value)

        return value

    def resolve_envvar_value(self, ctx: Context) -> t.Optional[str]:
        if self.envvar is None:
            return None

        if isinstance(self.envvar, str):
            rv = os.environ.get(self.envvar)

            if rv:
                return rv
        else:
            for envvar in self.envvar:
                rv = os.environ.get(envvar)

                if rv:
                    return rv

        return None

    def value_from_envvar(self, ctx: Context) -> t.Optional[t.Any]:
        rv: t.Optional[t.Any] = self.resolve_envvar_value(ctx)

        if rv is not None and self.nargs != 1:
            rv = self.type.split_envvar_value(rv)

        return rv

    def handle_parse_result(
        self, ctx: Context, opts: t.Mapping[str, t.Any], args: t.List[str]
    ) -> t.Tuple[t.Any, t.List[str]]:
        with augment_usage_errors(ctx, param=self):
            value, source = self.consume_value(ctx, opts)
            ctx.set_parameter_source(self.name, source)  

            try:
                value = self.process_value(ctx, value)
            except Exception:
                if not ctx.resilient_parsing:
                    raise

                value = None

        if self.expose_value:
            ctx.params[self.name] = value  

        return value, args

    def get_help_record(self, ctx: Context) -> t.Optional[t.Tuple[str, str]]:
        pass

    def get_usage_pieces(self, ctx: Context) -> t.List[str]:
        return []

    def get_error_hint(self, ctx: Context) -> str:
        
        hint_list = self.opts or [self.human_readable_name]
        return " / ".join(f"'{x}'" for x in hint_list)

    def shell_complete(self, ctx: Context, incomplete: str) -> t.List["CompletionItem"]:
        
        if self._custom_shell_complete is not None:
            results = self._custom_shell_complete(ctx, self, incomplete)

            if results and isinstance(results[0], str):
                from click.shell_completion import CompletionItem

                results = [CompletionItem(c) for c in results]

            return t.cast(t.List["CompletionItem"], results)

        return self.type.shell_complete(ctx, self, incomplete)


class Option(Parameter):
    

    param_type_name = "option"

    def __init__(
        self,
        param_decls: t.Optional[t.Sequence[str]] = None,
        show_default: t.Union[bool, str, None] = None,
        prompt: t.Union[bool, str] = False,
        confirmation_prompt: t.Union[bool, str] = False,
        prompt_required: bool = True,
        hide_input: bool = False,
        is_flag: t.Optional[bool] = None,
        flag_value: t.Optional[t.Any] = None,
        multiple: bool = False,
        count: bool = False,
        allow_from_autoenv: bool = True,
        type: t.Optional[t.Union[types.ParamType, t.Any]] = None,
        help: t.Optional[str] = None,
        hidden: bool = False,
        show_choices: bool = True,
        show_envvar: bool = False,
        **attrs: t.Any,
    ) -> None:
        if help:
            help = inspect.cleandoc(help)

        default_is_missing = "default" not in attrs
        super().__init__(param_decls, type=type, multiple=multiple, **attrs)

        if prompt is True:
            if self.name is None:
                raise TypeError("'name' is required with 'prompt=True'.")

            prompt_text: t.Optional[str] = self.name.replace("_", " ").capitalize()
        elif prompt is False:
            prompt_text = None
        else:
            prompt_text = prompt

        self.prompt = prompt_text
        self.confirmation_prompt = confirmation_prompt
        self.prompt_required = prompt_required
        self.hide_input = hide_input
        self.hidden = hidden

        
        
        self._flag_needs_value = self.prompt is not None and not self.prompt_required

        if is_flag is None:
            if flag_value is not None:
                
                is_flag = True
            elif self._flag_needs_value:
                
                is_flag = False
            else:
                
                is_flag = bool(self.secondary_opts)
        elif is_flag is False and not self._flag_needs_value:
            
            
            self._flag_needs_value = flag_value is not None

        self.default: t.Union[t.Any, t.Callable[[], t.Any]]

        if is_flag and default_is_missing and not self.required:
            if multiple:
                self.default = ()
            else:
                self.default = False

        if flag_value is None:
            flag_value = not self.default

        self.type: types.ParamType
        if is_flag and type is None:
            
            
            self.type = types.convert_type(None, flag_value)

        self.is_flag: bool = is_flag
        self.is_bool_flag: bool = is_flag and isinstance(self.type, types.BoolParamType)
        self.flag_value: t.Any = flag_value

        
        self.count = count
        if count:
            if type is None:
                self.type = types.IntRange(min=0)
            if default_is_missing:
                self.default = 0

        self.allow_from_autoenv = allow_from_autoenv
        self.help = help
        self.show_default = show_default
        self.show_choices = show_choices
        self.show_envvar = show_envvar

        if __debug__:
            if self.nargs == -1:
                raise TypeError("nargs=-1 is not supported for options.")

            if self.prompt and self.is_flag and not self.is_bool_flag:
                raise TypeError("'prompt' is not valid for non-boolean flag.")

            if not self.is_bool_flag and self.secondary_opts:
                raise TypeError("Secondary flag is not valid for non-boolean flag.")

            if self.is_bool_flag and self.hide_input and self.prompt is not None:
                raise TypeError(
                    "'prompt' with 'hide_input' is not valid for boolean flag."
                )

            if self.count:
                if self.multiple:
                    raise TypeError("'count' is not valid with 'multiple'.")

                if self.is_flag:
                    raise TypeError("'count' is not valid with 'is_flag'.")

    def to_info_dict(self) -> t.Dict[str, t.Any]:
        info_dict = super().to_info_dict()
        info_dict.update(
            help=self.help,
            prompt=self.prompt,
            is_flag=self.is_flag,
            flag_value=self.flag_value,
            count=self.count,
            hidden=self.hidden,
        )
        return info_dict

    def _parse_decls(
        self, decls: t.Sequence[str], expose_value: bool
    ) -> t.Tuple[t.Optional[str], t.List[str], t.List[str]]:
        opts = []
        secondary_opts = []
        name = None
        possible_names = []

        for decl in decls:
            if decl.isidentifier():
                if name is not None:
                    raise TypeError(f"Name '{name}' defined twice")
                name = decl
            else:
                split_char = ";" if decl[:1] == "/" else "/"
                if split_char in decl:
                    first, second = decl.split(split_char, 1)
                    first = first.rstrip()
                    if first:
                        possible_names.append(split_opt(first))
                        opts.append(first)
                    second = second.lstrip()
                    if second:
                        secondary_opts.append(second.lstrip())
                    if first == second:
                        raise ValueError(
                            f"Boolean option {decl!r} cannot use the"
                            " same flag for true/false."
                        )
                else:
                    possible_names.append(split_opt(decl))
                    opts.append(decl)

        if name is None and possible_names:
            possible_names.sort(key=lambda x: -len(x[0]))  
            name = possible_names[0][1].replace("-", "_").lower()
            if not name.isidentifier():
                name = None

        if name is None:
            if not expose_value:
                return None, opts, secondary_opts
            raise TypeError("Could not determine name for option")

        if not opts and not secondary_opts:
            raise TypeError(
                f"No options defined but a name was passed ({name})."
                " Did you mean to declare an argument instead? Did"
                f" you mean to pass '--{name}'?"
            )

        return name, opts, secondary_opts

    def add_to_parser(self, parser: OptionParser, ctx: Context) -> None:
        if self.multiple:
            action = "append"
        elif self.count:
            action = "count"
        else:
            action = "store"

        if self.is_flag:
            action = f"{action}_const"

            if self.is_bool_flag and self.secondary_opts:
                parser.add_option(
                    obj=self, opts=self.opts, dest=self.name, action=action, const=True
                )
                parser.add_option(
                    obj=self,
                    opts=self.secondary_opts,
                    dest=self.name,
                    action=action,
                    const=False,
                )
            else:
                parser.add_option(
                    obj=self,
                    opts=self.opts,
                    dest=self.name,
                    action=action,
                    const=self.flag_value,
                )
        else:
            parser.add_option(
                obj=self,
                opts=self.opts,
                dest=self.name,
                action=action,
                nargs=self.nargs,
            )

    def get_help_record(self, ctx: Context) -> t.Optional[t.Tuple[str, str]]:
        if self.hidden:
            return None

        any_prefix_is_slash = False

        def _write_opts(opts: t.Sequence[str]) -> str:
            nonlocal any_prefix_is_slash

            rv, any_slashes = join_options(opts)

            if any_slashes:
                any_prefix_is_slash = True

            if not self.is_flag and not self.count:
                rv += f" {self.make_metavar()}"

            return rv

        rv = [_write_opts(self.opts)]

        if self.secondary_opts:
            rv.append(_write_opts(self.secondary_opts))

        help = self.help or ""
        extra = []

        if self.show_envvar:
            envvar = self.envvar

            if envvar is None:
                if (
                    self.allow_from_autoenv
                    and ctx.auto_envvar_prefix is not None
                    and self.name is not None
                ):
                    envvar = f"{ctx.auto_envvar_prefix}_{self.name.upper()}"

            if envvar is not None:
                var_str = (
                    envvar
                    if isinstance(envvar, str)
                    else ", ".join(str(d) for d in envvar)
                )
                extra.append(_("env var: {var}").format(var=var_str))

        
        
        
        resilient = ctx.resilient_parsing
        ctx.resilient_parsing = True

        try:
            default_value = self.get_default(ctx, call=False)
        finally:
            ctx.resilient_parsing = resilient

        show_default = False
        show_default_is_str = False

        if self.show_default is not None:
            if isinstance(self.show_default, str):
                show_default_is_str = show_default = True
            else:
                show_default = self.show_default
        elif ctx.show_default is not None:
            show_default = ctx.show_default

        if show_default_is_str or (show_default and (default_value is not None)):
            if show_default_is_str:
                default_string = f"({self.show_default})"
            elif isinstance(default_value, (list, tuple)):
                default_string = ", ".join(str(d) for d in default_value)
            elif inspect.isfunction(default_value):
                default_string = _("(dynamic)")
            elif self.is_bool_flag and self.secondary_opts:
                
                
                default_string = split_opt(
                    (self.opts if self.default else self.secondary_opts)[0]
                )[1]
            elif self.is_bool_flag and not self.secondary_opts and not default_value:
                default_string = ""
            else:
                default_string = str(default_value)

            if default_string:
                extra.append(_("default: {default}").format(default=default_string))

        if (
            isinstance(self.type, types._NumberRangeBase)
            
            and not (self.count and self.type.min == 0 and self.type.max is None)
        ):
            range_str = self.type._describe_range()

            if range_str:
                extra.append(range_str)

        if self.required:
            extra.append(_("required"))

        if extra:
            extra_str = "; ".join(extra)
            help = f"{help}  [{extra_str}]" if help else f"[{extra_str}]"

        return ("; " if any_prefix_is_slash else " / ").join(rv), help

    @t.overload
    def get_default(
        self, ctx: Context, call: "te.Literal[True]" = True
    ) -> t.Optional[t.Any]:
        ...

    @t.overload
    def get_default(
        self, ctx: Context, call: bool = ...
    ) -> t.Optional[t.Union[t.Any, t.Callable[[], t.Any]]]:
        ...

    def get_default(
        self, ctx: Context, call: bool = True
    ) -> t.Optional[t.Union[t.Any, t.Callable[[], t.Any]]]:
        
        
        
        
        if self.is_flag and not self.is_bool_flag:
            for param in ctx.command.params:
                if param.name == self.name and param.default:
                    return t.cast(Option, param).flag_value

            return None

        return super().get_default(ctx, call=call)

    def prompt_for_value(self, ctx: Context) -> t.Any:
        
        assert self.prompt is not None

        
        default = self.get_default(ctx)

        
        
        if self.is_bool_flag:
            return confirm(self.prompt, default)

        return prompt(
            self.prompt,
            default=default,
            type=self.type,
            hide_input=self.hide_input,
            show_choices=self.show_choices,
            confirmation_prompt=self.confirmation_prompt,
            value_proc=lambda x: self.process_value(ctx, x),
        )

    def resolve_envvar_value(self, ctx: Context) -> t.Optional[str]:
        rv = super().resolve_envvar_value(ctx)

        if rv is not None:
            return rv

        if (
            self.allow_from_autoenv
            and ctx.auto_envvar_prefix is not None
            and self.name is not None
        ):
            envvar = f"{ctx.auto_envvar_prefix}_{self.name.upper()}"
            rv = os.environ.get(envvar)

            if rv:
                return rv

        return None

    def value_from_envvar(self, ctx: Context) -> t.Optional[t.Any]:
        rv: t.Optional[t.Any] = self.resolve_envvar_value(ctx)

        if rv is None:
            return None

        value_depth = (self.nargs != 1) + bool(self.multiple)

        if value_depth > 0:
            rv = self.type.split_envvar_value(rv)

            if self.multiple and self.nargs != 1:
                rv = batch(rv, self.nargs)

        return rv

    def consume_value(
        self, ctx: Context, opts: t.Mapping[str, "Parameter"]
    ) -> t.Tuple[t.Any, ParameterSource]:
        value, source = super().consume_value(ctx, opts)

        
        
        
        if value is _flag_needs_value:
            if self.prompt is not None and not ctx.resilient_parsing:
                value = self.prompt_for_value(ctx)
                source = ParameterSource.PROMPT
            else:
                value = self.flag_value
                source = ParameterSource.COMMANDLINE

        elif (
            self.multiple
            and value is not None
            and any(v is _flag_needs_value for v in value)
        ):
            value = [self.flag_value if v is _flag_needs_value else v for v in value]
            source = ParameterSource.COMMANDLINE

        
        
        elif (
            source in {None, ParameterSource.DEFAULT}
            and self.prompt is not None
            and (self.required or self.prompt_required)
            and not ctx.resilient_parsing
        ):
            value = self.prompt_for_value(ctx)
            source = ParameterSource.PROMPT

        return value, source


class Argument(Parameter):
    

    param_type_name = "argument"

    def __init__(
        self,
        param_decls: t.Sequence[str],
        required: t.Optional[bool] = None,
        **attrs: t.Any,
    ) -> None:
        if required is None:
            if attrs.get("default") is not None:
                required = False
            else:
                required = attrs.get("nargs", 1) > 0

        if "multiple" in attrs:
            raise TypeError("__init__() got an unexpected keyword argument 'multiple'.")

        super().__init__(param_decls, required=required, **attrs)

        if __debug__:
            if self.default is not None and self.nargs == -1:
                raise TypeError("'default' is not supported for nargs=-1.")

    @property
    def human_readable_name(self) -> str:
        if self.metavar is not None:
            return self.metavar
        return self.name.upper()  

    def make_metavar(self) -> str:
        if self.metavar is not None:
            return self.metavar
        var = self.type.get_metavar(self)
        if not var:
            var = self.name.upper()  
        if not self.required:
            var = f"[{var}]"
        if self.nargs != 1:
            var += "..."
        return var

    def _parse_decls(
        self, decls: t.Sequence[str], expose_value: bool
    ) -> t.Tuple[t.Optional[str], t.List[str], t.List[str]]:
        if not decls:
            if not expose_value:
                return None, [], []
            raise TypeError("Could not determine name for argument")
        if len(decls) == 1:
            name = arg = decls[0]
            name = name.replace("-", "_").lower()
        else:
            raise TypeError(
                "Arguments take exactly one parameter declaration, got"
                f" {len(decls)}."
            )
        return name, [arg], []

    def get_usage_pieces(self, ctx: Context) -> t.List[str]:
        return [self.make_metavar()]

    def get_error_hint(self, ctx: Context) -> str:
        return f"'{self.make_metavar()}'"

    def add_to_parser(self, parser: OptionParser, ctx: Context) -> None:
        parser.add_argument(dest=self.name, nargs=self.nargs, obj=self)
