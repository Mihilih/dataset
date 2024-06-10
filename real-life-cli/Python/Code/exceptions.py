import typing as t
from gettext import gettext as _
from gettext import ngettext

from ._compat import get_text_stderr
from .utils import echo
from .utils import format_filename

if t.TYPE_CHECKING:
    from .core import Command
    from .core import Context
    from .core import Parameter


def _join_param_hints(
    param_hint: t.Optional[t.Union[t.Sequence[str], str]]
) -> t.Optional[str]:
    if param_hint is not None and not isinstance(param_hint, str):
        return " / ".join(repr(x) for x in param_hint)

    return param_hint


class ClickException(Exception):
    

    
    exit_code = 1

    def __init__(self, message: str) -> None:
        super().__init__(message)
        self.message = message

    def format_message(self) -> str:
        return self.message

    def __str__(self) -> str:
        return self.message

    def show(self, file: t.Optional[t.IO[t.Any]] = None) -> None:
        if file is None:
            file = get_text_stderr()

        echo(_("Error: {message}").format(message=self.format_message()), file=file)


class UsageError(ClickException):
    

    exit_code = 2

    def __init__(self, message: str, ctx: t.Optional["Context"] = None) -> None:
        super().__init__(message)
        self.ctx = ctx
        self.cmd: t.Optional["Command"] = self.ctx.command if self.ctx else None

    def show(self, file: t.Optional[t.IO[t.Any]] = None) -> None:
        if file is None:
            file = get_text_stderr()
        color = None
        hint = ""
        if (
            self.ctx is not None
            and self.ctx.command.get_help_option(self.ctx) is not None
        ):
            hint = _("Try '{command} {option}' for help.").format(
                command=self.ctx.command_path, option=self.ctx.help_option_names[0]
            )
            hint = f"{hint}\n"
        if self.ctx is not None:
            color = self.ctx.color
            echo(f"{self.ctx.get_usage()}\n{hint}", file=file, color=color)
        echo(
            _("Error: {message}").format(message=self.format_message()),
            file=file,
            color=color,
        )


class BadParameter(UsageError):
    

    def __init__(
        self,
        message: str,
        ctx: t.Optional["Context"] = None,
        param: t.Optional["Parameter"] = None,
        param_hint: t.Optional[str] = None,
    ) -> None:
        super().__init__(message, ctx)
        self.param = param
        self.param_hint = param_hint

    def format_message(self) -> str:
        if self.param_hint is not None:
            param_hint = self.param_hint
        elif self.param is not None:
            param_hint = self.param.get_error_hint(self.ctx)  
        else:
            return _("Invalid value: {message}").format(message=self.message)

        return _("Invalid value for {param_hint}: {message}").format(
            param_hint=_join_param_hints(param_hint), message=self.message
        )


class MissingParameter(BadParameter):
    

    def __init__(
        self,
        message: t.Optional[str] = None,
        ctx: t.Optional["Context"] = None,
        param: t.Optional["Parameter"] = None,
        param_hint: t.Optional[str] = None,
        param_type: t.Optional[str] = None,
    ) -> None:
        super().__init__(message or "", ctx, param, param_hint)
        self.param_type = param_type

    def format_message(self) -> str:
        if self.param_hint is not None:
            param_hint: t.Optional[str] = self.param_hint
        elif self.param is not None:
            param_hint = self.param.get_error_hint(self.ctx)  
        else:
            param_hint = None

        param_hint = _join_param_hints(param_hint)
        param_hint = f" {param_hint}" if param_hint else ""

        param_type = self.param_type
        if param_type is None and self.param is not None:
            param_type = self.param.param_type_name

        msg = self.message
        if self.param is not None:
            msg_extra = self.param.type.get_missing_message(self.param)
            if msg_extra:
                if msg:
                    msg += f". {msg_extra}"
                else:
                    msg = msg_extra

        msg = f" {msg}" if msg else ""

        
        if param_type == "argument":
            missing = _("Missing argument")
        elif param_type == "option":
            missing = _("Missing option")
        elif param_type == "parameter":
            missing = _("Missing parameter")
        else:
            missing = _("Missing {param_type}").format(param_type=param_type)

        return f"{missing}{param_hint}.{msg}"

    def __str__(self) -> str:
        if not self.message:
            param_name = self.param.name if self.param else None
            return _("Missing parameter: {param_name}").format(param_name=param_name)
        else:
            return self.message


class NoSuchOption(UsageError):
    

    def __init__(
        self,
        option_name: str,
        message: t.Optional[str] = None,
        possibilities: t.Optional[t.Sequence[str]] = None,
        ctx: t.Optional["Context"] = None,
    ) -> None:
        if message is None:
            message = _("No such option: {name}").format(name=option_name)

        super().__init__(message, ctx)
        self.option_name = option_name
        self.possibilities = possibilities

    def format_message(self) -> str:
        if not self.possibilities:
            return self.message

        possibility_str = ", ".join(sorted(self.possibilities))
        suggest = ngettext(
            "Did you mean {possibility}?",
            "(Possible options: {possibilities})",
            len(self.possibilities),
        ).format(possibility=possibility_str, possibilities=possibility_str)
        return f"{self.message} {suggest}"


class BadOptionUsage(UsageError):
    

    def __init__(
        self, option_name: str, message: str, ctx: t.Optional["Context"] = None
    ) -> None:
        super().__init__(message, ctx)
        self.option_name = option_name


class BadArgumentUsage(UsageError):
    


class FileError(ClickException):
    

    def __init__(self, filename: str, hint: t.Optional[str] = None) -> None:
        if hint is None:
            hint = _("unknown error")

        super().__init__(hint)
        self.ui_filename: str = format_filename(filename)
        self.filename = filename

    def format_message(self) -> str:
        return _("Could not open file {filename!r}: {message}").format(
            filename=self.ui_filename, message=self.message
        )


class Abort(RuntimeError):
    


class Exit(RuntimeError):
    

    __slots__ = ("exit_code",)

    def __init__(self, code: int = 0) -> None:
        self.exit_code: int = code
