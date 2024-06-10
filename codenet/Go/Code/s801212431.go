package main

import (
	"bufio"
	"fmt"
	"os"
)

const (
	initialBufSize = 1e4
	maxBufSize     = 1e8
)

var sc = bufio.NewScanner(os.Stdin)

func init() {
	buf := make([]byte, initialBufSize)
	sc.Buffer(buf, maxBufSize)
	sc.Split(bufio.ScanWords)
}

func next() string {
	sc.Scan()
	return sc.Text()
}

func min(x, y int) int {
	if x > y {
		return y
	} else {
		return x
	}
}

func main() {
	S := next()

	l0, l1 := 0, 0
	for i := 0; i < len(S); i++ {
		if S[i] == '0' {
			l0++
		} else {
			l1++
		}
	}
	fmt.Println(2 * min(l0, l1))
}
