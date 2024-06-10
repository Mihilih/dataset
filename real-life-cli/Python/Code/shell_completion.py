import os
import re
import typing as t
from gettext import gettext as _

from .core import Argument
from .core import BaseCommand
from .core import Context
from .core import MultiCommand
from .core import Option
from .core import Parameter
from .core import ParameterSource
from .parser import split_arg_string
from .utils import echo


def shell_complete(
    cli: BaseCommand,
    ctx_args: t.MutableMapping[str, t.Any],
    prog_name: str,
    complete_var: str,
    instruction: str,
) -> int:
    
    shell, _, instruction = instruction.partition("_")
    comp_cls = get_completion_class(shell)

    if comp_cls is None:
        return 1

    comp = comp_cls(cli, ctx_args, prog_name, complete_var)

    if instruction == "source":
        echo(comp.source())
        return 0

    if instruction == "complete":
        echo(comp.complete())
        return 0

    return 1


class CompletionItem:
    

    __slots__ = ("value", "type", "help", "_info")

    def __init__(
        self,
        value: t.Any,
        type: str = "plain",
        help: t.Optional[str] = None,
        **kwargs: t.Any,
    ) -> None:
        self.value: t.Any = value
        self.type: str = type
        self.help: t.Optional[str] = help
        self._info = kwargs

    def __getattr__(self, name: str) -> t.Any:
        return self._info.get(name)



_SOURCE_BASH = 

_SOURCE_ZSH = 

_SOURCE_FISH = 


class ShellComplete:
    

    name: t.ClassVar[str]
    

    source_template: t.ClassVar[str]
    

    def __init__(
        self,
        cli: BaseCommand,
        ctx_args: t.MutableMapping[str, t.Any],
        prog_name: str,
        complete_var: str,
    ) -> None:
        self.cli = cli
        self.ctx_args = ctx_args
        self.prog_name = prog_name
        self.complete_var = complete_var

    @property
    def func_name(self) -> str:
        
        safe_name = re.sub(r"\W*", "", self.prog_name.replace("-", "_"), re.ASCII)
        return f"_{safe_name}_completion"

    def source_vars(self) -> t.Dict[str, t.Any]:
        
        return {
            "complete_func": self.func_name,
            "complete_var": self.complete_var,
            "prog_name": self.prog_name,
        }

    def source(self) -> str:
        
        return self.source_template % self.source_vars()

    def get_completion_args(self) -> t.Tuple[t.List[str], str]:
        
        raise NotImplementedError

    def get_completions(
        self, args: t.List[str], incomplete: str
    ) -> t.List[CompletionItem]:
        
        ctx = _resolve_context(self.cli, self.ctx_args, self.prog_name, args)
        obj, incomplete = _resolve_incomplete(ctx, args, incomplete)
        return obj.shell_complete(ctx, incomplete)

    def format_completion(self, item: CompletionItem) -> str:
        
        raise NotImplementedError

    def complete(self) -> str:
        
        args, incomplete = self.get_completion_args()
        completions = self.get_completions(args, incomplete)
        out = [self.format_completion(item) for item in completions]
        return "\n".join(out)


class BashComplete(ShellComplete):
    

    name = "bash"
    source_template = _SOURCE_BASH

    def _check_version(self) -> None:
        import subprocess

        output = subprocess.run(
            ["bash", "-c", 'echo "${BASH_VERSION}"'], stdout=subprocess.PIPE
        )
        match = re.search(r"^(\d+)\.(\d+)\.\d+", output.stdout.decode())

        if match is not None:
            major, minor = match.groups()

            if major < "4" or major == "4" and minor < "4":
                raise RuntimeError(
                    _(
                        "Shell completion is not supported for Bash"
                        " versions older than 4.4."
                    )
                )
        else:
            raise RuntimeError(
                _("Couldn't detect Bash version, shell completion is not supported.")
            )

    def source(self) -> str:
        self._check_version()
        return super().source()

    def get_completion_args(self) -> t.Tuple[t.List[str], str]:
        cwords = split_arg_string(os.environ["COMP_WORDS"])
        cword = int(os.environ["COMP_CWORD"])
        args = cwords[1:cword]

        try:
            incomplete = cwords[cword]
        except IndexError:
            incomplete = ""

        return args, incomplete

    def format_completion(self, item: CompletionItem) -> str:
        return f"{item.type},{item.value}"


class ZshComplete(ShellComplete):
    

    name = "zsh"
    source_template = _SOURCE_ZSH

    def get_completion_args(self) -> t.Tuple[t.List[str], str]:
        cwords = split_arg_string(os.environ["COMP_WORDS"])
        cword = int(os.environ["COMP_CWORD"])
        args = cwords[1:cword]

        try:
            incomplete = cwords[cword]
        except IndexError:
            incomplete = ""

        return args, incomplete

    def format_completion(self, item: CompletionItem) -> str:
        return f"{item.type}\n{item.value}\n{item.help if item.help else '_'}"


class FishComplete(ShellComplete):
    

    name = "fish"
    source_template = _SOURCE_FISH

    def get_completion_args(self) -> t.Tuple[t.List[str], str]:
        cwords = split_arg_string(os.environ["COMP_WORDS"])
        incomplete = os.environ["COMP_CWORD"]
        args = cwords[1:]

        
        
        if incomplete and args and args[-1] == incomplete:
            args.pop()

        return args, incomplete

    def format_completion(self, item: CompletionItem) -> str:
        if item.help:
            return f"{item.type},{item.value}\t{item.help}"

        return f"{item.type},{item.value}"


ShellCompleteType = t.TypeVar("ShellCompleteType", bound=t.Type[ShellComplete])


_available_shells: t.Dict[str, t.Type[ShellComplete]] = {
    "bash": BashComplete,
    "fish": FishComplete,
    "zsh": ZshComplete,
}


def add_completion_class(
    cls: ShellCompleteType, name: t.Optional[str] = None
) -> ShellCompleteType:
    
    if name is None:
        name = cls.name

    _available_shells[name] = cls

    return cls


def get_completion_class(shell: str) -> t.Optional[t.Type[ShellComplete]]:
    
    return _available_shells.get(shell)


def _is_incomplete_argument(ctx: Context, param: Parameter) -> bool:
    
    if not isinstance(param, Argument):
        return False

    assert param.name is not None
    
    value = ctx.params.get(param.name)
    return (
        param.nargs == -1
        or ctx.get_parameter_source(param.name) is not ParameterSource.COMMANDLINE
        or (
            param.nargs > 1
            and isinstance(value, (tuple, list))
            and len(value) < param.nargs
        )
    )


def _start_of_option(ctx: Context, value: str) -> bool:
    
    if not value:
        return False

    c = value[0]
    return c in ctx._opt_prefixes


def _is_incomplete_option(ctx: Context, args: t.List[str], param: Parameter) -> bool:
    
    if not isinstance(param, Option):
        return False

    if param.is_flag or param.count:
        return False

    last_option = None

    for index, arg in enumerate(reversed(args)):
        if index + 1 > param.nargs:
            break

        if _start_of_option(ctx, arg):
            last_option = arg

    return last_option is not None and last_option in param.opts


def _resolve_context(
    cli: BaseCommand,
    ctx_args: t.MutableMapping[str, t.Any],
    prog_name: str,
    args: t.List[str],
) -> Context:
    
    ctx_args["resilient_parsing"] = True
    ctx = cli.make_context(prog_name, args.copy(), **ctx_args)
    args = ctx.protected_args + ctx.args

    while args:
        command = ctx.command

        if isinstance(command, MultiCommand):
            if not command.chain:
                name, cmd, args = command.resolve_command(ctx, args)

                if cmd is None:
                    return ctx

                ctx = cmd.make_context(name, args, parent=ctx, resilient_parsing=True)
                args = ctx.protected_args + ctx.args
            else:
                sub_ctx = ctx

                while args:
                    name, cmd, args = command.resolve_command(ctx, args)

                    if cmd is None:
                        return ctx

                    sub_ctx = cmd.make_context(
                        name,
                        args,
                        parent=ctx,
                        allow_extra_args=True,
                        allow_interspersed_args=False,
                        resilient_parsing=True,
                    )
                    args = sub_ctx.args

                ctx = sub_ctx
                args = [*sub_ctx.protected_args, *sub_ctx.args]
        else:
            break

    return ctx


def _resolve_incomplete(
    ctx: Context, args: t.List[str], incomplete: str
) -> t.Tuple[t.Union[BaseCommand, Parameter], str]:
    
    
    
    
    
    if incomplete == "=":
        incomplete = ""
    elif "=" in incomplete and _start_of_option(ctx, incomplete):
        name, _, incomplete = incomplete.partition("=")
        args.append(name)

    
    
    
    
    if "--" not in args and _start_of_option(ctx, incomplete):
        return ctx.command, incomplete

    params = ctx.command.get_params(ctx)

    
    
    for param in params:
        if _is_incomplete_option(ctx, args, param):
            return param, incomplete

    
    
    for param in params:
        if _is_incomplete_argument(ctx, param):
            return param, incomplete

    
    
    return ctx.command, incomplete