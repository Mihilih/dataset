package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
)

func main() {
	m := make(map[int]int)
	N, M := ReadInt(), ReadInt()
	for i := 0; i < N; i++ {
		m[ReadInt()]++
	}
	for i := 0; i < M; i++ {
		B, C := ReadInt(), ReadInt()
		m[C] += B
	}
	ints := make([]int, len(m))
	for i, _ := range m {
		ints = append(ints, i)
	}
	sort.Sort(sort.Reverse(sort.IntSlice(ints)))
	rest := N
	sum := 0
	for _, i := range ints {
		num := m[i]
		if num >= rest {
			sum += rest * i
			break
		}
		sum += num * i
		rest -= num
	}
	fmt.Println(sum)
}

var reader = bufio.NewReader(os.Stdin)

func Scan(a ...interface{}) {
	if _, err := fmt.Fscan(reader, a...); err != nil {
		panic(err)
	}
}
func ReadInt() (i int) { Scan(&i); return }
