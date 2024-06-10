package main

import (
	"fmt"
)

func main() {
	var n, x int

	for {
		fmt.Scan(&n, &x)
		if n == 0 && x == 0 {
			break
		}

		c := 0
		for i := 1; i <= n-2; i++ {
			for j := i + 1; j <= n-1; j++ {
				for k := j + 1; k <= n; k++ {
					if i+j+k == x {
						c++
					}
				}
			}
		}
		fmt.Println(c)
	}
}

