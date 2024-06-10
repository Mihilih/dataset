package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

var (
	a   []int
	ans = 0
)

func dfs(left, i, res int) {
	if left == 0 {
		ans += res
		return
	}
	for j := i; j < len(a); j++ {
		dfs(left-1, j+1, res*a[j])
	}
}

func main() {
	io := newIo()
	n := io.nextInt()
	dic := map[rune]int{}

	for range make([]struct{}, n) {
		c := io.nextString()[0]
		switch c {
		case 'M', 'A', 'R', 'C', 'H':
			dic[rune(c)]++
		}
	}

	for _, v := range dic {
		a = append(a, v)
	}

	dfs(3, 0, 1)
	fmt.Println(ans)
}

type io struct {
	reader    *bufio.Reader
	tokens    []string
	nextToken int
}

func newIo() *io {
	return &io{reader: bufio.NewReader(os.Stdin)}
}

func (io *io) nextLine() string {
	var buffer []byte
	for {
		line, isPrefix, _ := io.reader.ReadLine()
		buffer = append(buffer, line...)
		if !isPrefix {
			break
		}
	}
	return string(buffer)
}

func (io *io) nextString() string {
	for io.nextToken >= len(io.tokens) {
		line := io.nextLine()
		io.tokens = strings.Fields(line)
		io.nextToken = 0
	}
	r := io.tokens[io.nextToken]
	io.nextToken++
	return r
}

func (io *io) nextInt() int {
	i, _ := strconv.Atoi(io.nextString())
	return i
}
