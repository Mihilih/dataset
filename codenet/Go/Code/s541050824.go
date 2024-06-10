package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

type bufReader struct {
	r   *bufio.Reader
	buf []byte
	i   int
}

var reader = &bufReader{
	bufio.NewReader(os.Stdin),
	make([]byte, 0),
	0,
}

func (r *bufReader) readLine() {
	if r.i < len(r.buf) {
		return
	}
	r.buf = make([]byte, 0)
	r.i = 0
	for {
		line, isPrefix, err := r.r.ReadLine()
		if err != nil {
			panic(err)
		}
		r.buf = append(r.buf, line...)
		if !isPrefix {
			break
		}
	}
}

func (r *bufReader) next() string {
	r.readLine()
	from := r.i
	for ; r.i < len(r.buf); r.i++ {
		if r.buf[r.i] == ' ' {
			break
		}
	}
	s := string(r.buf[from:r.i])
	r.i++
	return s
}

func (r *bufReader) nextLine() string {
	r.readLine()
	s := string(r.buf[r.i:])
	r.i = len(r.buf)
	return s
}

var writer = bufio.NewWriter(os.Stdout)

func next() string {
	return reader.next()
}

func nextInt() int64 {
	i, err := strconv.ParseInt(reader.next(), 10, 64)
	if err != nil {
		panic(err)
	}
	return i
}

func nextLine() string {
	return reader.nextLine()
}

func out(a ...interface{}) {
	fmt.Fprintln(writer, a...)
}

func max(x, y int64) int64 {
	if x > y {
		return x
	}
	return y
}

func min(x, y int64) int64 {
	if x < y {
		return x
	}
	return y
}

func joinInts(a []int64, sep string) string {
	b := make([]string, len(a))
	for i, v := range a {
		b[i] = strconv.FormatInt(v, 10)
	}
	return strings.Join(b, sep)
}

func divUp(x, y int64) int64 {
	return (x + y - 1) / y
}

func main() {
	solve()
	writer.Flush()
}

func solve() {
	N := nextInt()
	T, A := make([]int64, N), make([]int64, N)
	for i := 0; i < int(N); i++ {
		T[i], A[i] = nextInt(), nextInt()
	}
	t, a := T[0], A[0]
	for i := 1; i < int(N); i++ {
		r := max(divUp(t, T[i]), divUp(a, A[i]))
		t, a = T[i]*r, A[i]*r
	}
	out(t + a)
}