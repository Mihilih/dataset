package main

import (
	"fmt"
	"math"
)

const inf = 10000000000.0

func main() {
	var n int
	fmt.Scan(&n)

	arrA := make([]int, n)
	for i := 0; i < n; i++ {
		fmt.Scan(&arrA[i])
	}

	cumSumA := make([]int, n+1)
	cumSumA[0] = 0
	for i, a := range arrA {
		cumSumA[i+1] = cumSumA[i] + a
	}

	ans := inf
	for i := 1; i < n; i++ {
		if math.Abs(float64(cumSumA[n]-(cumSumA[i]*2))) < ans {
			ans = math.Abs(float64(cumSumA[n] - cumSumA[i]*2))
		}
	}

	fmt.Println(int(ans))
}
