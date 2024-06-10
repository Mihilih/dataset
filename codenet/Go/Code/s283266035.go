package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)
	ans := 0
	for i := 1; i*i < n; i++ {
		if n%i == 0 && n%(n/i-1) == i {
			ans += n/i - 1
		}
	}
	fmt.Println(ans)
}
