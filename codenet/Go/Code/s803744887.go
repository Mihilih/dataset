package main

import "fmt"

func main() {
	const MX = 10000
	sieve := make([]int, MX)
	primes := make([]int, 0, MX)
	for i := 2; i < MX; i++ {
		if sieve[i] != 0 {
			continue
		}
		primes = append(primes, i)
		for j := i + i; j < MX; j += i {
			sieve[j] = i
		}
	}

	var n int
	fmt.Scan(&n)
	ans := 0
	for i := 0; i < n; i++ {
		var x int
		fmt.Scan(&x)
		ans++
		for j := 0; j < len(primes); j++ {
			if x > primes[j] && x%primes[j] == 0 {
				ans--
				break
			}
		}
	}
	fmt.Println(ans)
}

