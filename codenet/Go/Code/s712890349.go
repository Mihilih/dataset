package main

import (
	"bufio"
	"fmt"
	"os"
)

type Block struct {
	Value string
	Len   int
}

func main() {
	var N, K, ans int
	fmt.Scan(&N, &K)
	var S string
	s := bufio.NewScanner(os.Stdin)
	b := make([]byte, 1000000)
	s.Buffer(b, 1000000)
	s.Scan()
	S = s.Text()
	blocks := RunLength(S)
	sum, zero, l := 0, 0, 0
	for r := 0; r < len(blocks); r++ {
		sum += blocks[r].Len
		if blocks[r].Value == "0" {
			zero++
		}
		for K < zero {
			sum -= blocks[l].Len
			if blocks[l].Value == "0" {
				zero--
			}
			l++
		}
		ans = Max(ans, sum)
	}
	fmt.Println(ans)
}

func RunLength(s string) []Block {
	var r []Block
	if len(s) == 0 {
		return r
	}
	t := Block{Value: string(s[0]), Len: 1}
	for _, v := range s[1:] {
		if t.Value == string(v) {
			t.Len++
		} else {
			r = append(r, t)
			t = Block{Value: string(v), Len: 1}
		}
	}
	r = append(r, t)
	return r
}

func Max(a, b int) int {
	if b > a {
		return b
	}
	return a
}
