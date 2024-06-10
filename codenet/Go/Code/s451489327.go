package main

import "fmt"

func main() {
	var n int
	fmt.Scan(&n)

	as := make([]int, n+1)
	bs := make([]int, n)

	for i := range as {
		fmt.Scan(&as[i])
	}

	for i := range bs {
		fmt.Scan(&bs[i])
	}

	var sum int
	for i := 0; i <= n-1; i++ {
		a := as[i]
		b := bs[i]
		if a <= b {
			sum += a
			b -= a
			if i+1 <= n {
				an := as[i+1]
				if an <= b {
					sum += an
					as[i+1] = 0
				} else {
					sum += b
					as[i+1] -= b
				}
			}
		} else {
			sum += b
		}
	}
	fmt.Println(sum)
}
