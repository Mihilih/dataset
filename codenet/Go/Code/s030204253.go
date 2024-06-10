package main

import (
	"fmt"
	"sort"
)

func main() {
	var n int
	fmt.Scan(&n)
	a := make([]float64, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&a[i])
	}
	for i := 0; i+1 < n; i++ {
		sort.Sort(sort.Float64Slice(a))
		na := make([]float64, 0)
		for j := 2; j < len(a); j++ {
			na = append(na, a[j])
		}
		na = append(na, (a[0]+a[1])/2)
		a = na
	}
	fmt.Println(a[0])
}
