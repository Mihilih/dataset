package main

import (
	"fmt"
	"sort"
)

func main() {
	// Code for B - Traveling AtCoDeer Problem
	var N int
	fmt.Scanf("%d", &N)

	A := make([]int, N)
	for i := 0; i < N; i++ {
		fmt.Scanf("%d", &A[i])
	}

	sort.Sort(sort.IntSlice(A))

	var ans int
	for i := 1; i < N; i++ {
		ans += A[i] - A[i-1]
	}

	fmt.Println(ans)
}
