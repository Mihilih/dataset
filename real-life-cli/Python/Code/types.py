import os
import stat
import sys
import typing as t
from datetime import datetime
from gettext import gettext as _
from gettext import ngettext

from ._compat import _get_argv_encoding
from ._compat import open_stream
from .exceptions import BadParameter
from .utils import format_filename
from .utils import LazyFile
from .utils import safecall

if t.TYPE_CHECKING:
    import typing_extensions as te
    from .core import Context
    from .core import Parameter
    from .shell_completion import CompletionItem


class ParamType:
    

    is_composite: t.ClassVar[bool] = False
    arity: t.ClassVar[int] = 1

    
    name: str

    
    
    
    
    
    
    envvar_list_splitter: t.ClassVar[t.Optional[str]] = None

    def to_info_dict(self) -> t.Dict[str, t.Any]:
        
        
        param_type = type(self).__name__.partition("ParamType")[0]
        param_type = param_type.partition("ParameterType")[0]

        
        if hasattr(self, "name"):
            name = self.name
        else:
            name = param_type

        return {"param_type": param_type, "name": name}

    def __call__(
        self,
        value: t.Any,
        param: t.Optional["Parameter"] = None,
        ctx: t.Optional["Context"] = None,
    ) -> t.Any:
        if value is not None:
            return self.convert(value, param, ctx)

    def get_metavar(self, param: "Parameter") -> t.Optional[str]:
        

    def get_missing_message(self, param: "Parameter") -> t.Optional[str]:
        

    def convert(
        self, value: t.Any, param: t.Optional["Parameter"], ctx: t.Optional["Context"]
    ) -> t.Any:
        
        return value

    def split_envvar_value(self, rv: str) -> t.Sequence[str]:
        
        return (rv or "").split(self.envvar_list_splitter)

    def fail(
        self,
        message: str,
        param: t.Optional["Parameter"] = None,
        ctx: t.Optional["Context"] = None,
    ) -> "t.NoReturn":
        
        raise BadParameter(message, ctx=ctx, param=param)

    def shell_complete(
        self, ctx: "Context", param: "Parameter", incomplete: str
    ) -> t.List["CompletionItem"]:
        
        return []


class CompositeParamType(ParamType):
    is_composite = True

    @property
    def arity(self) -> int:  
        raise NotImplementedError()


class FuncParamType(ParamType):
    def __init__(self, func: t.Callable[[t.Any], t.Any]) -> None:
        self.name: str = func.__name__
        self.func = func

    def to_info_dict(self) -> t.Dict[str, t.Any]:
        info_dict = super().to_info_dict()
        info_dict["func"] = self.func
        return info_dict

    def convert(
        self, value: t.Any, param: t.Optional["Parameter"], ctx: t.Optional["Context"]
    ) -> t.Any:
        try:
            return self.func(value)
        except ValueError:
            try:
                value = str(value)
            except UnicodeError:
                value = value.decode("utf-8", "replace")

            self.fail(value, param, ctx)


class UnprocessedParamType(ParamType):
    name = "text"

    def convert(
        self, value: t.Any, param: t.Optional["Parameter"], ctx: t.Optional["Context"]
    ) -> t.Any:
        return value

    def __repr__(self) -> str:
        return "UNPROCESSED"


class StringParamType(ParamType):
    name = "text"

    def convert(
        self, value: t.Any, param: t.Optional["Parameter"], ctx: t.Optional["Context"]
    ) -> t.Any:
        if isinstance(value, bytes):
            enc = _get_argv_encoding()
            try:
                value = value.decode(enc)
            except UnicodeError:
                fs_enc = sys.getfilesystemencoding()
                if fs_enc != enc:
                    try:
                        value = value.decode(fs_enc)
                    except UnicodeError:
                        value = value.decode("utf-8", "replace")
                else:
                    value = value.decode("utf-8", "replace")
            return value
        return str(value)

    def __repr__(self) -> str:
        return "STRING"


class Choice(ParamType):
    

    name = "choice"

    def __init__(self, choices: t.Sequence[str], case_sensitive: bool = True) -> None:
        self.choices = choices
        self.case_sensitive = case_sensitive

    def to_info_dict(self) -> t.Dict[str, t.Any]:
        info_dict = super().to_info_dict()
        info_dict["choices"] = self.choices
        info_dict["case_sensitive"] = self.case_sensitive
        return info_dict

    def get_metavar(self, param: "Parameter") -> str:
        choices_str = "|".join(self.choices)

        
        if param.required and param.param_type_name == "argument":
            return f"{{{choices_str}}}"

        
        return f"[{choices_str}]"

    def get_missing_message(self, param: "Parameter") -> str:
        return _("Choose from:\n\t{choices}").format(choices=",\n\t".join(self.choices))

    def convert(
        self, value: t.Any, param: t.Optional["Parameter"], ctx: t.Optional["Context"]
    ) -> t.Any:
        
        
        
        
        normed_value = value
        normed_choices = {choice: choice for choice in self.choices}

        if ctx is not None and ctx.token_normalize_func is not None:
            normed_value = ctx.token_normalize_func(value)
            normed_choices = {
                ctx.token_normalize_func(normed_choice): original
                for normed_choice, original in normed_choices.items()
            }

        if not self.case_sensitive:
            normed_value = normed_value.casefold()
            normed_choices = {
                normed_choice.casefold(): original
                for normed_choice, original in normed_choices.items()
            }

        if normed_value in normed_choices:
            return normed_choices[normed_value]

        choices_str = ", ".join(map(repr, self.choices))
        self.fail(
            ngettext(
                "{value!r} is not {choice}.",
                "{value!r} is not one of {choices}.",
                len(self.choices),
            ).format(value=value, choice=choices_str, choices=choices_str),
            param,
            ctx,
        )

    def __repr__(self) -> str:
        return f"Choice({list(self.choices)})"

    def shell_complete(
        self, ctx: "Context", param: "Parameter", incomplete: str
    ) -> t.List["CompletionItem"]:
        
        from click.shell_completion import CompletionItem

        str_choices = map(str, self.choices)

        if self.case_sensitive:
            matched = (c for c in str_choices if c.startswith(incomplete))
        else:
            incomplete = incomplete.lower()
            matched = (c for c in str_choices if c.lower().startswith(incomplete))

        return [CompletionItem(c) for c in matched]


class DateTime(ParamType):
    

    name = "datetime"

    def __init__(self, formats: t.Optional[t.Sequence[str]] = None):
        self.formats: t.Sequence[str] = formats or [
            "%Y-%m-%d",
            "%Y-%m-%dT%H:%M:%S",
            "%Y-%m-%d %H:%M:%S",
        ]

    def to_info_dict(self) -> t.Dict[str, t.Any]:
        info_dict = super().to_info_dict()
        info_dict["formats"] = self.formats
        return info_dict

    def get_metavar(self, param: "Parameter") -> str:
        return f"[{'|'.join(self.formats)}]"

    def _try_to_convert_date(self, value: t.Any, format: str) -> t.Optional[datetime]:
        try:
            return datetime.strptime(value, format)
        except ValueError:
            return None

    def convert(
        self, value: t.Any, param: t.Optional["Parameter"], ctx: t.Optional["Context"]
    ) -> t.Any:
        if isinstance(value, datetime):
            return value

        for format in self.formats:
            converted = self._try_to_convert_date(value, format)

            if converted is not None:
                return converted

        formats_str = ", ".join(map(repr, self.formats))
        self.fail(
            ngettext(
                "{value!r} does not match the format {format}.",
                "{value!r} does not match the formats {formats}.",
                len(self.formats),
            ).format(value=value, format=formats_str, formats=formats_str),
            param,
            ctx,
        )

    def __repr__(self) -> str:
        return "DateTime"


class _NumberParamTypeBase(ParamType):
    _number_class: t.ClassVar[t.Type[t.Any]]

    def convert(
        self, value: t.Any, param: t.Optional["Parameter"], ctx: t.Optional["Context"]
    ) -> t.Any:
        try:
            return self._number_class(value)
        except ValueError:
            self.fail(
                _("{value!r} is not a valid {number_type}.").format(
                    value=value, number_type=self.name
                ),
                param,
                ctx,
            )


class _NumberRangeBase(_NumberParamTypeBase):
    def __init__(
        self,
        min: t.Optional[float] = None,
        max: t.Optional[float] = None,
        min_open: bool = False,
        max_open: bool = False,
        clamp: bool = False,
    ) -> None:
        self.min = min
        self.max = max
        self.min_open = min_open
        self.max_open = max_open
        self.clamp = clamp

    def to_info_dict(self) -> t.Dict[str, t.Any]:
        info_dict = super().to_info_dict()
        info_dict.update(
            min=self.min,
            max=self.max,
            min_open=self.min_open,
            max_open=self.max_open,
            clamp=self.clamp,
        )
        return info_dict

    def convert(
        self, value: t.Any, param: t.Optional["Parameter"], ctx: t.Optional["Context"]
    ) -> t.Any:
        import operator

        rv = super().convert(value, param, ctx)
        lt_min: bool = self.min is not None and (
            operator.le if self.min_open else operator.lt
        )(rv, self.min)
        gt_max: bool = self.max is not None and (
            operator.ge if self.max_open else operator.gt
        )(rv, self.max)

        if self.clamp:
            if lt_min:
                return self._clamp(self.min, 1, self.min_open)  

            if gt_max:
                return self._clamp(self.max, -1, self.max_open)  

        if lt_min or gt_max:
            self.fail(
                _("{value} is not in the range {range}.").format(
                    value=rv, range=self._describe_range()
                ),
                param,
                ctx,
            )

        return rv

    def _clamp(self, bound: float, dir: "te.Literal[1, -1]", open: bool) -> float:
        
        raise NotImplementedError

    def _describe_range(self) -> str:
        
        if self.min is None:
            op = "<" if self.max_open else "<="
            return f"x{op}{self.max}"

        if self.max is None:
            op = ">" if self.min_open else ">="
            return f"x{op}{self.min}"

        lop = "<" if self.min_open else "<="
        rop = "<" if self.max_open else "<="
        return f"{self.min}{lop}x{rop}{self.max}"

    def __repr__(self) -> str:
        clamp = " clamped" if self.clamp else ""
        return f"<{type(self).__name__} {self._describe_range()}{clamp}>"


class IntParamType(_NumberParamTypeBase):
    name = "integer"
    _number_class = int

    def __repr__(self) -> str:
        return "INT"


class IntRange(_NumberRangeBase, IntParamType):
    

    name = "integer range"

    def _clamp(  
        self, bound: int, dir: "te.Literal[1, -1]", open: bool
    ) -> int:
        if not open:
            return bound

        return bound + dir


class FloatParamType(_NumberParamTypeBase):
    name = "float"
    _number_class = float

    def __repr__(self) -> str:
        return "FLOAT"


class FloatRange(_NumberRangeBase, FloatParamType):
    

    name = "float range"

    def __init__(
        self,
        min: t.Optional[float] = None,
        max: t.Optional[float] = None,
        min_open: bool = False,
        max_open: bool = False,
        clamp: bool = False,
    ) -> None:
        super().__init__(
            min=min, max=max, min_open=min_open, max_open=max_open, clamp=clamp
        )

        if (min_open or max_open) and clamp:
            raise TypeError("Clamping is not supported for open bounds.")

    def _clamp(self, bound: float, dir: "te.Literal[1, -1]", open: bool) -> float:
        if not open:
            return bound

        
        
        
        raise RuntimeError("Clamping is not supported for open bounds.")


class BoolParamType(ParamType):
    name = "boolean"

    def convert(
        self, value: t.Any, param: t.Optional["Parameter"], ctx: t.Optional["Context"]
    ) -> t.Any:
        if value in {False, True}:
            return bool(value)

        norm = value.strip().lower()

        if norm in {"1", "true", "t", "yes", "y", "on"}:
            return True

        if norm in {"0", "false", "f", "no", "n", "off"}:
            return False

        self.fail(
            _("{value!r} is not a valid boolean.").format(value=value), param, ctx
        )

    def __repr__(self) -> str:
        return "BOOL"


class UUIDParameterType(ParamType):
    name = "uuid"

    def convert(
        self, value: t.Any, param: t.Optional["Parameter"], ctx: t.Optional["Context"]
    ) -> t.Any:
        import uuid

        if isinstance(value, uuid.UUID):
            return value

        value = value.strip()

        try:
            return uuid.UUID(value)
        except ValueError:
            self.fail(
                _("{value!r} is not a valid UUID.").format(value=value), param, ctx
            )

    def __repr__(self) -> str:
        return "UUID"


class File(ParamType):
    

    name = "filename"
    envvar_list_splitter: t.ClassVar[str] = os.path.pathsep

    def __init__(
        self,
        mode: str = "r",
        encoding: t.Optional[str] = None,
        errors: t.Optional[str] = "strict",
        lazy: t.Optional[bool] = None,
        atomic: bool = False,
    ) -> None:
        self.mode = mode
        self.encoding = encoding
        self.errors = errors
        self.lazy = lazy
        self.atomic = atomic

    def to_info_dict(self) -> t.Dict[str, t.Any]:
        info_dict = super().to_info_dict()
        info_dict.update(mode=self.mode, encoding=self.encoding)
        return info_dict

    def resolve_lazy_flag(self, value: "t.Union[str, os.PathLike[str]]") -> bool:
        if self.lazy is not None:
            return self.lazy
        if os.fspath(value) == "-":
            return False
        elif "w" in self.mode:
            return True
        return False

    def convert(
        self,
        value: t.Union[str, "os.PathLike[str]", t.IO[t.Any]],
        param: t.Optional["Parameter"],
        ctx: t.Optional["Context"],
    ) -> t.IO[t.Any]:
        if _is_file_like(value):
            return value

        value = t.cast("t.Union[str, os.PathLike[str]]", value)

        try:
            lazy = self.resolve_lazy_flag(value)

            if lazy:
                lf = LazyFile(
                    value, self.mode, self.encoding, self.errors, atomic=self.atomic
                )

                if ctx is not None:
                    ctx.call_on_close(lf.close_intelligently)

                return t.cast(t.IO[t.Any], lf)

            f, should_close = open_stream(
                value, self.mode, self.encoding, self.errors, atomic=self.atomic
            )

            
            
            
            
            
            if ctx is not None:
                if should_close:
                    ctx.call_on_close(safecall(f.close))
                else:
                    ctx.call_on_close(safecall(f.flush))

            return f
        except OSError as e:  
            self.fail(f"'{format_filename(value)}': {e.strerror}", param, ctx)

    def shell_complete(
        self, ctx: "Context", param: "Parameter", incomplete: str
    ) -> t.List["CompletionItem"]:
        
        from click.shell_completion import CompletionItem

        return [CompletionItem(incomplete, type="file")]


def _is_file_like(value: t.Any) -> "te.TypeGuard[t.IO[t.Any]]":
    return hasattr(value, "read") or hasattr(value, "write")


class Path(ParamType):
    

    envvar_list_splitter: t.ClassVar[str] = os.path.pathsep

    def __init__(
        self,
        exists: bool = False,
        file_okay: bool = True,
        dir_okay: bool = True,
        writable: bool = False,
        readable: bool = True,
        resolve_path: bool = False,
        allow_dash: bool = False,
        path_type: t.Optional[t.Type[t.Any]] = None,
        executable: bool = False,
    ):
        self.exists = exists
        self.file_okay = file_okay
        self.dir_okay = dir_okay
        self.readable = readable
        self.writable = writable
        self.executable = executable
        self.resolve_path = resolve_path
        self.allow_dash = allow_dash
        self.type = path_type

        if self.file_okay and not self.dir_okay:
            self.name: str = _("file")
        elif self.dir_okay and not self.file_okay:
            self.name = _("directory")
        else:
            self.name = _("path")

    def to_info_dict(self) -> t.Dict[str, t.Any]:
        info_dict = super().to_info_dict()
        info_dict.update(
            exists=self.exists,
            file_okay=self.file_okay,
            dir_okay=self.dir_okay,
            writable=self.writable,
            readable=self.readable,
            allow_dash=self.allow_dash,
        )
        return info_dict

    def coerce_path_result(
        self, value: "t.Union[str, os.PathLike[str]]"
    ) -> "t.Union[str, bytes, os.PathLike[str]]":
        if self.type is not None and not isinstance(value, self.type):
            if self.type is str:
                return os.fsdecode(value)
            elif self.type is bytes:
                return os.fsencode(value)
            else:
                return t.cast("os.PathLike[str]", self.type(value))

        return value

    def convert(
        self,
        value: "t.Union[str, os.PathLike[str]]",
        param: t.Optional["Parameter"],
        ctx: t.Optional["Context"],
    ) -> "t.Union[str, bytes, os.PathLike[str]]":
        rv = value

        is_dash = self.file_okay and self.allow_dash and rv in (b"-", "-")

        if not is_dash:
            if self.resolve_path:
                
                
                import pathlib

                rv = os.fsdecode(pathlib.Path(rv).resolve())

            try:
                st = os.stat(rv)
            except OSError:
                if not self.exists:
                    return self.coerce_path_result(rv)
                self.fail(
                    _("{name} {filename!r} does not exist.").format(
                        name=self.name.title(), filename=format_filename(value)
                    ),
                    param,
                    ctx,
                )

            if not self.file_okay and stat.S_ISREG(st.st_mode):
                self.fail(
                    _("{name} {filename!r} is a file.").format(
                        name=self.name.title(), filename=format_filename(value)
                    ),
                    param,
                    ctx,
                )
            if not self.dir_okay and stat.S_ISDIR(st.st_mode):
                self.fail(
                    _("{name} '{filename}' is a directory.").format(
                        name=self.name.title(), filename=format_filename(value)
                    ),
                    param,
                    ctx,
                )

            if self.readable and not os.access(rv, os.R_OK):
                self.fail(
                    _("{name} {filename!r} is not readable.").format(
                        name=self.name.title(), filename=format_filename(value)
                    ),
                    param,
                    ctx,
                )

            if self.writable and not os.access(rv, os.W_OK):
                self.fail(
                    _("{name} {filename!r} is not writable.").format(
                        name=self.name.title(), filename=format_filename(value)
                    ),
                    param,
                    ctx,
                )

            if self.executable and not os.access(value, os.X_OK):
                self.fail(
                    _("{name} {filename!r} is not executable.").format(
                        name=self.name.title(), filename=format_filename(value)
                    ),
                    param,
                    ctx,
                )

        return self.coerce_path_result(rv)

    def shell_complete(
        self, ctx: "Context", param: "Parameter", incomplete: str
    ) -> t.List["CompletionItem"]:
        
        from click.shell_completion import CompletionItem

        type = "dir" if self.dir_okay and not self.file_okay else "file"
        return [CompletionItem(incomplete, type=type)]


class Tuple(CompositeParamType):
    

    def __init__(self, types: t.Sequence[t.Union[t.Type[t.Any], ParamType]]) -> None:
        self.types: t.Sequence[ParamType] = [convert_type(ty) for ty in types]

    def to_info_dict(self) -> t.Dict[str, t.Any]:
        info_dict = super().to_info_dict()
        info_dict["types"] = [t.to_info_dict() for t in self.types]
        return info_dict

    @property
    def name(self) -> str:  
        return f"<{' '.join(ty.name for ty in self.types)}>"

    @property
    def arity(self) -> int:  
        return len(self.types)

    def convert(
        self, value: t.Any, param: t.Optional["Parameter"], ctx: t.Optional["Context"]
    ) -> t.Any:
        len_type = len(self.types)
        len_value = len(value)

        if len_value != len_type:
            self.fail(
                ngettext(
                    "{len_type} values are required, but {len_value} was given.",
                    "{len_type} values are required, but {len_value} were given.",
                    len_value,
                ).format(len_type=len_type, len_value=len_value),
                param=param,
                ctx=ctx,
            )

        return tuple(ty(x, param, ctx) for ty, x in zip(self.types, value))


def convert_type(ty: t.Optional[t.Any], default: t.Optional[t.Any] = None) -> ParamType:
    
    guessed_type = False

    if ty is None and default is not None:
        if isinstance(default, (tuple, list)):
            
            
            if default:
                item = default[0]

                
                
                
                if isinstance(item, (tuple, list)):
                    ty = tuple(map(type, item))
                else:
                    ty = type(item)
        else:
            ty = type(default)

        guessed_type = True

    if isinstance(ty, tuple):
        return Tuple(ty)

    if isinstance(ty, ParamType):
        return ty

    if ty is str or ty is None:
        return STRING

    if ty is int:
        return INT

    if ty is float:
        return FLOAT

    if ty is bool:
        return BOOL

    if guessed_type:
        return STRING

    if __debug__:
        try:
            if issubclass(ty, ParamType):
                raise AssertionError(
                    f"Attempted to use an uninstantiated parameter type ({ty})."
                )
        except TypeError:
            
            pass

    return FuncParamType(ty)













UNPROCESSED = UnprocessedParamType()



STRING = StringParamType()



INT = IntParamType()



FLOAT = FloatParamType()



BOOL = BoolParamType()


UUID = UUIDParameterType()
