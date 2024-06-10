import typing as t
from threading import local

if t.TYPE_CHECKING:
    import typing_extensions as te
    from .core import Context

_local = local()


@t.overload
def get_current_context(silent: "te.Literal[False]" = False) -> "Context":
    ...


@t.overload
def get_current_context(silent: bool = ...) -> t.Optional["Context"]:
    ...


def get_current_context(silent: bool = False) -> t.Optional["Context"]:
    
    try:
        return t.cast("Context", _local.stack[-1])
    except (AttributeError, IndexError) as e:
        if not silent:
            raise RuntimeError("There is no active click context.") from e

    return None


def push_context(ctx: "Context") -> None:
    
    _local.__dict__.setdefault("stack", []).append(ctx)


def pop_context() -> None:
    
    _local.stack.pop()


def resolve_color_default(color: t.Optional[bool] = None) -> t.Optional[bool]:
    
    if color is not None:
        return color

    ctx = get_current_context(silent=True)

    if ctx is not None:
        return ctx.color

    return None
