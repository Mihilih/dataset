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

	s := make([]int, n+1)
	for i := 0; i < n; i++ {
		s[i+1] = s[i] + a[i]
	}

	sort.Sort(sort.IntSlice(s))

	ans := 0
	count := 0
	for i := 0; i < n; i++ {
		if s[i] == s[i+1] {
			count++
		} else if count > 0 {
			ans += combi(count+1, 2)
			count = 0
		}
	}
	if count > 0 {
		ans += combi(count+1, 2)
	}

	fmt.Println(ans)
}

func combi(n, r int) int {
	c := 1
	for i := 1; i <= r; i++ {
		c = c * (n - i + 1) / i
	}
	return c
}
