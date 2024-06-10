import contextlib
import io
import os
import shlex
import shutil
import sys
import tempfile
import typing as t
from types import TracebackType

from . import formatting
from . import termui
from . import utils
from ._compat import _find_binary_reader

if t.TYPE_CHECKING:
    from .core import BaseCommand


class EchoingStdin:
    def __init__(self, input: t.BinaryIO, output: t.BinaryIO) -> None:
        self._input = input
        self._output = output
        self._paused = False

    def __getattr__(self, x: str) -> t.Any:
        return getattr(self._input, x)

    def _echo(self, rv: bytes) -> bytes:
        if not self._paused:
            self._output.write(rv)

        return rv

    def read(self, n: int = -1) -> bytes:
        return self._echo(self._input.read(n))

    def read1(self, n: int = -1) -> bytes:
        return self._echo(self._input.read1(n))  

    def readline(self, n: int = -1) -> bytes:
        return self._echo(self._input.readline(n))

    def readlines(self) -> t.List[bytes]:
        return [self._echo(x) for x in self._input.readlines()]

    def __iter__(self) -> t.Iterator[bytes]:
        return iter(self._echo(x) for x in self._input)

    def __repr__(self) -> str:
        return repr(self._input)


@contextlib.contextmanager
def _pause_echo(stream: t.Optional[EchoingStdin]) -> t.Iterator[None]:
    if stream is None:
        yield
    else:
        stream._paused = True
        yield
        stream._paused = False


class _NamedTextIOWrapper(io.TextIOWrapper):
    def __init__(
        self, buffer: t.BinaryIO, name: str, mode: str, **kwargs: t.Any
    ) -> None:
        super().__init__(buffer, **kwargs)
        self._name = name
        self._mode = mode

    @property
    def name(self) -> str:
        return self._name

    @property
    def mode(self) -> str:
        return self._mode


def make_input_stream(
    input: t.Optional[t.Union[str, bytes, t.IO[t.Any]]], charset: str
) -> t.BinaryIO:
    
    if hasattr(input, "read"):
        rv = _find_binary_reader(t.cast(t.IO[t.Any], input))

        if rv is not None:
            return rv

        raise TypeError("Could not find binary reader for input stream.")

    if input is None:
        input = b""
    elif isinstance(input, str):
        input = input.encode(charset)

    return io.BytesIO(input)


class Result:
    

    def __init__(
        self,
        runner: "CliRunner",
        stdout_bytes: bytes,
        stderr_bytes: t.Optional[bytes],
        return_value: t.Any,
        exit_code: int,
        exception: t.Optional[BaseException],
        exc_info: t.Optional[
            t.Tuple[t.Type[BaseException], BaseException, TracebackType]
        ] = None,
    ):
        
        self.runner = runner
        
        self.stdout_bytes = stdout_bytes
        
        self.stderr_bytes = stderr_bytes
        
        
        
        self.return_value = return_value
        
        self.exit_code = exit_code
        
        self.exception = exception
        
        self.exc_info = exc_info

    @property
    def output(self) -> str:
        
        return self.stdout

    @property
    def stdout(self) -> str:
        
        return self.stdout_bytes.decode(self.runner.charset, "replace").replace(
            "\r\n", "\n"
        )

    @property
    def stderr(self) -> str:
        
        if self.stderr_bytes is None:
            raise ValueError("stderr not separately captured")
        return self.stderr_bytes.decode(self.runner.charset, "replace").replace(
            "\r\n", "\n"
        )

    def __repr__(self) -> str:
        exc_str = repr(self.exception) if self.exception else "okay"
        return f"<{type(self).__name__} {exc_str}>"


class CliRunner:
    

    def __init__(
        self,
        charset: str = "utf-8",
        env: t.Optional[t.Mapping[str, t.Optional[str]]] = None,
        echo_stdin: bool = False,
        mix_stderr: bool = True,
    ) -> None:
        self.charset = charset
        self.env: t.Mapping[str, t.Optional[str]] = env or {}
        self.echo_stdin = echo_stdin
        self.mix_stderr = mix_stderr

    def get_default_prog_name(self, cli: "BaseCommand") -> str:
        
        return cli.name or "root"

    def make_env(
        self, overrides: t.Optional[t.Mapping[str, t.Optional[str]]] = None
    ) -> t.Mapping[str, t.Optional[str]]:
        
        rv = dict(self.env)
        if overrides:
            rv.update(overrides)
        return rv

    @contextlib.contextmanager
    def isolation(
        self,
        input: t.Optional[t.Union[str, bytes, t.IO[t.Any]]] = None,
        env: t.Optional[t.Mapping[str, t.Optional[str]]] = None,
        color: bool = False,
    ) -> t.Iterator[t.Tuple[io.BytesIO, t.Optional[io.BytesIO]]]:
        
        bytes_input = make_input_stream(input, self.charset)
        echo_input = None

        old_stdin = sys.stdin
        old_stdout = sys.stdout
        old_stderr = sys.stderr
        old_forced_width = formatting.FORCED_WIDTH
        formatting.FORCED_WIDTH = 80

        env = self.make_env(env)

        bytes_output = io.BytesIO()

        if self.echo_stdin:
            bytes_input = echo_input = t.cast(
                t.BinaryIO, EchoingStdin(bytes_input, bytes_output)
            )

        sys.stdin = text_input = _NamedTextIOWrapper(
            bytes_input, encoding=self.charset, name="<stdin>", mode="r"
        )

        if self.echo_stdin:
            
            
            text_input._CHUNK_SIZE = 1  

        sys.stdout = _NamedTextIOWrapper(
            bytes_output, encoding=self.charset, name="<stdout>", mode="w"
        )

        bytes_error = None
        if self.mix_stderr:
            sys.stderr = sys.stdout
        else:
            bytes_error = io.BytesIO()
            sys.stderr = _NamedTextIOWrapper(
                bytes_error,
                encoding=self.charset,
                name="<stderr>",
                mode="w",
                errors="backslashreplace",
            )

        @_pause_echo(echo_input)  
        def visible_input(prompt: t.Optional[str] = None) -> str:
            sys.stdout.write(prompt or "")
            val = text_input.readline().rstrip("\r\n")
            sys.stdout.write(f"{val}\n")
            sys.stdout.flush()
            return val

        @_pause_echo(echo_input)  
        def hidden_input(prompt: t.Optional[str] = None) -> str:
            sys.stdout.write(f"{prompt or ''}\n")
            sys.stdout.flush()
            return text_input.readline().rstrip("\r\n")

        @_pause_echo(echo_input)  
        def _getchar(echo: bool) -> str:
            char = sys.stdin.read(1)

            if echo:
                sys.stdout.write(char)

            sys.stdout.flush()
            return char

        default_color = color

        def should_strip_ansi(
            stream: t.Optional[t.IO[t.Any]] = None, color: t.Optional[bool] = None
        ) -> bool:
            if color is None:
                return not default_color
            return not color

        old_visible_prompt_func = termui.visible_prompt_func
        old_hidden_prompt_func = termui.hidden_prompt_func
        old__getchar_func = termui._getchar
        old_should_strip_ansi = utils.should_strip_ansi  
        termui.visible_prompt_func = visible_input
        termui.hidden_prompt_func = hidden_input
        termui._getchar = _getchar
        utils.should_strip_ansi = should_strip_ansi  

        old_env = {}
        try:
            for key, value in env.items():
                old_env[key] = os.environ.get(key)
                if value is None:
                    try:
                        del os.environ[key]
                    except Exception:
                        pass
                else:
                    os.environ[key] = value
            yield (bytes_output, bytes_error)
        finally:
            for key, value in old_env.items():
                if value is None:
                    try:
                        del os.environ[key]
                    except Exception:
                        pass
                else:
                    os.environ[key] = value
            sys.stdout = old_stdout
            sys.stderr = old_stderr
            sys.stdin = old_stdin
            termui.visible_prompt_func = old_visible_prompt_func
            termui.hidden_prompt_func = old_hidden_prompt_func
            termui._getchar = old__getchar_func
            utils.should_strip_ansi = old_should_strip_ansi  
            formatting.FORCED_WIDTH = old_forced_width

    def invoke(
        self,
        cli: "BaseCommand",
        args: t.Optional[t.Union[str, t.Sequence[str]]] = None,
        input: t.Optional[t.Union[str, bytes, t.IO[t.Any]]] = None,
        env: t.Optional[t.Mapping[str, t.Optional[str]]] = None,
        catch_exceptions: bool = True,
        color: bool = False,
        **extra: t.Any,
    ) -> Result:
        
        exc_info = None
        with self.isolation(input=input, env=env, color=color) as outstreams:
            return_value = None
            exception: t.Optional[BaseException] = None
            exit_code = 0

            if isinstance(args, str):
                args = shlex.split(args)

            try:
                prog_name = extra.pop("prog_name")
            except KeyError:
                prog_name = self.get_default_prog_name(cli)

            try:
                return_value = cli.main(args=args or (), prog_name=prog_name, **extra)
            except SystemExit as e:
                exc_info = sys.exc_info()
                e_code = t.cast(t.Optional[t.Union[int, t.Any]], e.code)

                if e_code is None:
                    e_code = 0

                if e_code != 0:
                    exception = e

                if not isinstance(e_code, int):
                    sys.stdout.write(str(e_code))
                    sys.stdout.write("\n")
                    e_code = 1

                exit_code = e_code

            except Exception as e:
                if not catch_exceptions:
                    raise
                exception = e
                exit_code = 1
                exc_info = sys.exc_info()
            finally:
                sys.stdout.flush()
                stdout = outstreams[0].getvalue()
                if self.mix_stderr:
                    stderr = None
                else:
                    stderr = outstreams[1].getvalue()  

        return Result(
            runner=self,
            stdout_bytes=stdout,
            stderr_bytes=stderr,
            return_value=return_value,
            exit_code=exit_code,
            exception=exception,
            exc_info=exc_info,  
        )

    @contextlib.contextmanager
    def isolated_filesystem(
        self, temp_dir: t.Optional[t.Union[str, "os.PathLike[str]"]] = None
    ) -> t.Iterator[str]:
        
        cwd = os.getcwd()
        dt = tempfile.mkdtemp(dir=temp_dir)
        os.chdir(dt)

        try:
            yield dt
        finally:
            os.chdir(cwd)

            if temp_dir is None:
                try:
                    shutil.rmtree(dt)
                except OSError:  
                    pass
