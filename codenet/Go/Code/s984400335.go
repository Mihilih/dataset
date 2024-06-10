package main

import (
	"fmt"
)

func min(nums ...int) int {
	min := nums[0]
	for _, v := range nums {
		if v < min {
			min = v
		}
	}
	return min
}

func main() {
	var n, a, b int
	fmt.Scan(&n, &a, &b)

	fmt.Println(min(n*a, b))
}
