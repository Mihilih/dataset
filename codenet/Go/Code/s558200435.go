package main

import (
	"fmt"
	"sort"
)

func main() {
	var n int
	fmt.Scan(&n)

	a := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&a[i])
	}

	b := make([]int, 0, n)
	for _, v := range a {
		x := sort.Search(len(b), func(i int) bool {
			return b[i] < v
		})
		if x == len(b) {
			b = append(b, v)
		} else {
			b[x] = v
		}
	}

	fmt.Println(len(b))
}
