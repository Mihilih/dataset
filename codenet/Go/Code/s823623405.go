package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Scan(&n)
	as := make([]int, n)
	ps := make(map[int]int)
	for i := 0; i < n; i++ {
		fmt.Scan(&as[i])

		ns := primeFactorize(as[i])
		for k, v := range ns {
			ps[k] = max(ps[k], v)
		}
	}

	x := 1
	for k, v := range ps {
		for i := 1; i <= v; i++ {
			x = mul(x, k)
		}
	}

	ans := 0
	for i := 0; i < n; i++ {
		ans = add(ans, div(x, as[i]))
	}
	fmt.Println(ans)
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

func primeFactorize(n int) map[int]int {
	res := make(map[int]int)
	for i := 2; i*i <= n; i++ {
		for n%i == 0 {
			n /= i
			res[i]++
		}
	}
	if n != 1 {
		res[n]++
	}
	return res
}

const mod int = 1000000007

func pow(n, k int) int {
	if k == 0 {
		return 1
	} else if k%2 == 1 {
		return pow(n, k-1) * n % mod
	} else {
		t := pow(n, k/2)
		return t * t % mod
	}
}

func add(a, b int) int {
	return (a + b) % mod
}

func sub(a, b int) int {
	return (a + mod - b) % mod
}

func mul(a, b int) int {
	return a % mod * b % mod % mod
}

func div(a, b int) int {
	return mul(a, pow(b, mod-2))
}
