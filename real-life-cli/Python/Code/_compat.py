import codecs
import io
import os
import re
import sys
import typing as t
from weakref import WeakKeyDictionary

CYGWIN = sys.platform.startswith("cygwin")
WIN = sys.platform.startswith("win")
auto_wrap_for_ansi: t.Optional[t.Callable[[t.TextIO], t.TextIO]] = None
_ansi_re = re.compile(r"\033\[[;?0-9]*[a-zA-Z]")


def _make_text_stream(
    stream: t.BinaryIO,
    encoding: t.Optional[str],
    errors: t.Optional[str],
    force_readable: bool = False,
    force_writable: bool = False,
) -> t.TextIO:
    if encoding is None:
        encoding = get_best_encoding(stream)
    if errors is None:
        errors = "replace"
    return _NonClosingTextIOWrapper(
        stream,
        encoding,
        errors,
        line_buffering=True,
        force_readable=force_readable,
        force_writable=force_writable,
    )


def is_ascii_encoding(encoding: str) -> bool:
    
    try:
        return codecs.lookup(encoding).name == "ascii"
    except LookupError:
        return False


def get_best_encoding(stream: t.IO[t.Any]) -> str:
    
    rv = getattr(stream, "encoding", None) or sys.getdefaultencoding()
    if is_ascii_encoding(rv):
        return "utf-8"
    return rv


class _NonClosingTextIOWrapper(io.TextIOWrapper):
    def __init__(
        self,
        stream: t.BinaryIO,
        encoding: t.Optional[str],
        errors: t.Optional[str],
        force_readable: bool = False,
        force_writable: bool = False,
        **extra: t.Any,
    ) -> None:
        self._stream = stream = t.cast(
            t.BinaryIO, _FixupStream(stream, force_readable, force_writable)
        )
        super().__init__(stream, encoding, errors, **extra)

    def __del__(self) -> None:
        try:
            self.detach()
        except Exception:
            pass

    def isatty(self) -> bool:
        
        return self._stream.isatty()


class _FixupStream:
    

    def __init__(
        self,
        stream: t.BinaryIO,
        force_readable: bool = False,
        force_writable: bool = False,
    ):
        self._stream = stream
        self._force_readable = force_readable
        self._force_writable = force_writable

    def __getattr__(self, name: str) -> t.Any:
        return getattr(self._stream, name)

    def read1(self, size: int) -> bytes:
        f = getattr(self._stream, "read1", None)

        if f is not None:
            return t.cast(bytes, f(size))

        return self._stream.read(size)

    def readable(self) -> bool:
        if self._force_readable:
            return True
        x = getattr(self._stream, "readable", None)
        if x is not None:
            return t.cast(bool, x())
        try:
            self._stream.read(0)
        except Exception:
            return False
        return True

    def writable(self) -> bool:
        if self._force_writable:
            return True
        x = getattr(self._stream, "writable", None)
        if x is not None:
            return t.cast(bool, x())
        try:
            self._stream.write("")  
        except Exception:
            try:
                self._stream.write(b"")
            except Exception:
                return False
        return True

    def seekable(self) -> bool:
        x = getattr(self._stream, "seekable", None)
        if x is not None:
            return t.cast(bool, x())
        try:
            self._stream.seek(self._stream.tell())
        except Exception:
            return False
        return True


def _is_binary_reader(stream: t.IO[t.Any], default: bool = False) -> bool:
    try:
        return isinstance(stream.read(0), bytes)
    except Exception:
        return default
        
        


def _is_binary_writer(stream: t.IO[t.Any], default: bool = False) -> bool:
    try:
        stream.write(b"")
    except Exception:
        try:
            stream.write("")
            return False
        except Exception:
            pass
        return default
    return True


def _find_binary_reader(stream: t.IO[t.Any]) -> t.Optional[t.BinaryIO]:
    
    
    
    
    if _is_binary_reader(stream, False):
        return t.cast(t.BinaryIO, stream)

    buf = getattr(stream, "buffer", None)

    
    
    if buf is not None and _is_binary_reader(buf, True):
        return t.cast(t.BinaryIO, buf)

    return None


def _find_binary_writer(stream: t.IO[t.Any]) -> t.Optional[t.BinaryIO]:
    
    
    
    
    if _is_binary_writer(stream, False):
        return t.cast(t.BinaryIO, stream)

    buf = getattr(stream, "buffer", None)

    
    
    if buf is not None and _is_binary_writer(buf, True):
        return t.cast(t.BinaryIO, buf)

    return None


def _stream_is_misconfigured(stream: t.TextIO) -> bool:
    
    
    
    
    
    return is_ascii_encoding(getattr(stream, "encoding", None) or "ascii")


def _is_compat_stream_attr(stream: t.TextIO, attr: str, value: t.Optional[str]) -> bool:
    
    stream_value = getattr(stream, attr, None)
    return stream_value == value or (value is None and stream_value is not None)


def _is_compatible_text_stream(
    stream: t.TextIO, encoding: t.Optional[str], errors: t.Optional[str]
) -> bool:
    
    return _is_compat_stream_attr(
        stream, "encoding", encoding
    ) and _is_compat_stream_attr(stream, "errors", errors)


def _force_correct_text_stream(
    text_stream: t.IO[t.Any],
    encoding: t.Optional[str],
    errors: t.Optional[str],
    is_binary: t.Callable[[t.IO[t.Any], bool], bool],
    find_binary: t.Callable[[t.IO[t.Any]], t.Optional[t.BinaryIO]],
    force_readable: bool = False,
    force_writable: bool = False,
) -> t.TextIO:
    if is_binary(text_stream, False):
        binary_reader = t.cast(t.BinaryIO, text_stream)
    else:
        text_stream = t.cast(t.TextIO, text_stream)
        
        
        if _is_compatible_text_stream(text_stream, encoding, errors) and not (
            encoding is None and _stream_is_misconfigured(text_stream)
        ):
            return text_stream

        
        possible_binary_reader = find_binary(text_stream)

        
        
        if possible_binary_reader is None:
            return text_stream

        binary_reader = possible_binary_reader

    
    
    if errors is None:
        errors = "replace"

    
    
    return _make_text_stream(
        binary_reader,
        encoding,
        errors,
        force_readable=force_readable,
        force_writable=force_writable,
    )


def _force_correct_text_reader(
    text_reader: t.IO[t.Any],
    encoding: t.Optional[str],
    errors: t.Optional[str],
    force_readable: bool = False,
) -> t.TextIO:
    return _force_correct_text_stream(
        text_reader,
        encoding,
        errors,
        _is_binary_reader,
        _find_binary_reader,
        force_readable=force_readable,
    )


def _force_correct_text_writer(
    text_writer: t.IO[t.Any],
    encoding: t.Optional[str],
    errors: t.Optional[str],
    force_writable: bool = False,
) -> t.TextIO:
    return _force_correct_text_stream(
        text_writer,
        encoding,
        errors,
        _is_binary_writer,
        _find_binary_writer,
        force_writable=force_writable,
    )


def get_binary_stdin() -> t.BinaryIO:
    reader = _find_binary_reader(sys.stdin)
    if reader is None:
        raise RuntimeError("Was not able to determine binary stream for sys.stdin.")
    return reader


def get_binary_stdout() -> t.BinaryIO:
    writer = _find_binary_writer(sys.stdout)
    if writer is None:
        raise RuntimeError("Was not able to determine binary stream for sys.stdout.")
    return writer


def get_binary_stderr() -> t.BinaryIO:
    writer = _find_binary_writer(sys.stderr)
    if writer is None:
        raise RuntimeError("Was not able to determine binary stream for sys.stderr.")
    return writer


def get_text_stdin(
    encoding: t.Optional[str] = None, errors: t.Optional[str] = None
) -> t.TextIO:
    rv = _get_windows_console_stream(sys.stdin, encoding, errors)
    if rv is not None:
        return rv
    return _force_correct_text_reader(sys.stdin, encoding, errors, force_readable=True)


def get_text_stdout(
    encoding: t.Optional[str] = None, errors: t.Optional[str] = None
) -> t.TextIO:
    rv = _get_windows_console_stream(sys.stdout, encoding, errors)
    if rv is not None:
        return rv
    return _force_correct_text_writer(sys.stdout, encoding, errors, force_writable=True)


def get_text_stderr(
    encoding: t.Optional[str] = None, errors: t.Optional[str] = None
) -> t.TextIO:
    rv = _get_windows_console_stream(sys.stderr, encoding, errors)
    if rv is not None:
        return rv
    return _force_correct_text_writer(sys.stderr, encoding, errors, force_writable=True)


def _wrap_io_open(
    file: t.Union[str, "os.PathLike[str]", int],
    mode: str,
    encoding: t.Optional[str],
    errors: t.Optional[str],
) -> t.IO[t.Any]:
    
    if "b" in mode:
        return open(file, mode)

    return open(file, mode, encoding=encoding, errors=errors)


def open_stream(
    filename: "t.Union[str, os.PathLike[str]]",
    mode: str = "r",
    encoding: t.Optional[str] = None,
    errors: t.Optional[str] = "strict",
    atomic: bool = False,
) -> t.Tuple[t.IO[t.Any], bool]:
    binary = "b" in mode
    filename = os.fspath(filename)

    
    
    if os.fsdecode(filename) == "-":
        if any(m in mode for m in ["w", "a", "x"]):
            if binary:
                return get_binary_stdout(), False
            return get_text_stdout(encoding=encoding, errors=errors), False
        if binary:
            return get_binary_stdin(), False
        return get_text_stdin(encoding=encoding, errors=errors), False

    
    if not atomic:
        return _wrap_io_open(filename, mode, encoding, errors), True

    
    if "a" in mode:
        raise ValueError(
            "Appending to an existing file is not supported, because that"
            " would involve an expensive `copy`-operation to a temporary"
            " file. Open the file in normal `w`-mode and copy explicitly"
            " if that's what you're after."
        )
    if "x" in mode:
        raise ValueError("Use the `overwrite`-parameter instead.")
    if "w" not in mode:
        raise ValueError("Atomic writes only make sense with `w`-mode.")

    
    
    
    
    import errno
    import random

    try:
        perm: t.Optional[int] = os.stat(filename).st_mode
    except OSError:
        perm = None

    flags = os.O_RDWR | os.O_CREAT | os.O_EXCL

    if binary:
        flags |= getattr(os, "O_BINARY", 0)

    while True:
        tmp_filename = os.path.join(
            os.path.dirname(filename),
            f".__atomic-write{random.randrange(1 << 32):08x}",
        )
        try:
            fd = os.open(tmp_filename, flags, 0o666 if perm is None else perm)
            break
        except OSError as e:
            if e.errno == errno.EEXIST or (
                os.name == "nt"
                and e.errno == errno.EACCES
                and os.path.isdir(e.filename)
                and os.access(e.filename, os.W_OK)
            ):
                continue
            raise

    if perm is not None:
        os.chmod(tmp_filename, perm)  

    f = _wrap_io_open(fd, mode, encoding, errors)
    af = _AtomicFile(f, tmp_filename, os.path.realpath(filename))
    return t.cast(t.IO[t.Any], af), True


class _AtomicFile:
    def __init__(self, f: t.IO[t.Any], tmp_filename: str, real_filename: str) -> None:
        self._f = f
        self._tmp_filename = tmp_filename
        self._real_filename = real_filename
        self.closed = False

    @property
    def name(self) -> str:
        return self._real_filename

    def close(self, delete: bool = False) -> None:
        if self.closed:
            return
        self._f.close()
        os.replace(self._tmp_filename, self._real_filename)
        self.closed = True

    def __getattr__(self, name: str) -> t.Any:
        return getattr(self._f, name)

    def __enter__(self) -> "_AtomicFile":
        return self

    def __exit__(self, exc_type: t.Optional[t.Type[BaseException]], *_: t.Any) -> None:
        self.close(delete=exc_type is not None)

    def __repr__(self) -> str:
        return repr(self._f)


def strip_ansi(value: str) -> str:
    return _ansi_re.sub("", value)


def _is_jupyter_kernel_output(stream: t.IO[t.Any]) -> bool:
    while isinstance(stream, (_FixupStream, _NonClosingTextIOWrapper)):
        stream = stream._stream

    return stream.__class__.__module__.startswith("ipykernel.")


def should_strip_ansi(
    stream: t.Optional[t.IO[t.Any]] = None, color: t.Optional[bool] = None
) -> bool:
    if color is None:
        if stream is None:
            stream = sys.stdin
        return not isatty(stream) and not _is_jupyter_kernel_output(stream)
    return not color





if sys.platform.startswith("win") and WIN:
    from ._winconsole import _get_windows_console_stream

    def _get_argv_encoding() -> str:
        import locale

        return locale.getpreferredencoding()

    _ansi_stream_wrappers: t.MutableMapping[t.TextIO, t.TextIO] = WeakKeyDictionary()

    def auto_wrap_for_ansi(
        stream: t.TextIO, color: t.Optional[bool] = None
    ) -> t.TextIO:
        
        try:
            cached = _ansi_stream_wrappers.get(stream)
        except Exception:
            cached = None

        if cached is not None:
            return cached

        import colorama

        strip = should_strip_ansi(stream, color)
        ansi_wrapper = colorama.AnsiToWin32(stream, strip=strip)
        rv = t.cast(t.TextIO, ansi_wrapper.stream)
        _write = rv.write

        def _safe_write(s):
            try:
                return _write(s)
            except BaseException:
                ansi_wrapper.reset_all()
                raise

        rv.write = _safe_write

        try:
            _ansi_stream_wrappers[stream] = rv
        except Exception:
            pass

        return rv

else:

    def _get_argv_encoding() -> str:
        return getattr(sys.stdin, "encoding", None) or sys.getfilesystemencoding()

    def _get_windows_console_stream(
        f: t.TextIO, encoding: t.Optional[str], errors: t.Optional[str]
    ) -> t.Optional[t.TextIO]:
        return None


def term_len(x: str) -> int:
    return len(strip_ansi(x))


def isatty(stream: t.IO[t.Any]) -> bool:
    try:
        return stream.isatty()
    except Exception:
        return False


def _make_cached_stream_func(
    src_func: t.Callable[[], t.Optional[t.TextIO]],
    wrapper_func: t.Callable[[], t.TextIO],
) -> t.Callable[[], t.Optional[t.TextIO]]:
    cache: t.MutableMapping[t.TextIO, t.TextIO] = WeakKeyDictionary()

    def func() -> t.Optional[t.TextIO]:
        stream = src_func()

        if stream is None:
            return None

        try:
            rv = cache.get(stream)
        except Exception:
            rv = None
        if rv is not None:
            return rv
        rv = wrapper_func()
        try:
            cache[stream] = rv
        except Exception:
            pass
        return rv

    return func


_default_text_stdin = _make_cached_stream_func(lambda: sys.stdin, get_text_stdin)
_default_text_stdout = _make_cached_stream_func(lambda: sys.stdout, get_text_stdout)
_default_text_stderr = _make_cached_stream_func(lambda: sys.stderr, get_text_stderr)


binary_streams: t.Mapping[str, t.Callable[[], t.BinaryIO]] = {
    "stdin": get_binary_stdin,
    "stdout": get_binary_stdout,
    "stderr": get_binary_stderr,
}

text_streams: t.Mapping[
    str, t.Callable[[t.Optional[str], t.Optional[str]], t.TextIO]
] = {
    "stdin": get_text_stdin,
    "stdout": get_text_stdout,
    "stderr": get_text_stderr,
}