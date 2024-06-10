package main

import (
	"fmt"
)

const d = 1000000007

func main() {
	var n, p int
	fmt.Scan(&n)
	fmt.Scan(&p)

	mdans := map[int64]int64{}
	for index := 0; index < p; index++ {
		var n1 int64
		fmt.Scan(&n1)
		mdans[n1] = n1
	}

	dp := make([]int64, n+1, n+1)
	dp[0] = 1
	dp[1] = 1

	if _, ok := mdans[1]; ok {
		dp[1] = 0
	}

	for i := 2; i <= n; i++ {
		if _, ok := mdans[int64(i)]; ok {
			continue
		}
		dp[i] = (dp[i-1] + dp[i-2]) % d

	}

	fmt.Printf("%#v\n", dp[n])
}
