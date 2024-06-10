package main

import "fmt"

func main() {
	var n, m int
	fmt.Scanf("%d %d", &n, &m)
	h := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&h[i])
	}
	var a, b int
	counter := make(map[int]struct{})
	for i := 0; i < m; i++ {
		fmt.Scanf("%d %d", &a, &b)
		if h[a-1] < h[b-1] {
			counter[a] = struct{}{}
		} else if h[a-1] > h[b-1] {
			counter[b] = struct{}{}
		} else if h[a-1] == h[b-1] {
			counter[a] = struct{}{}
			counter[b] = struct{}{}
		}
	}
	fmt.Println(n - len(counter))
}
