package main

import (
	"fmt"
)

func main() {
	var n int
	fmt.Scan(&n)
	var s []byte
	fmt.Scan(&s)
	ns := make([]int, n)
	for i := range s {
		switch s[i] {
		case 'R':
			ns[i] = 0
		case 'G':
			ns[i] = 1
		case 'B':
			ns[i] = 2
		}
	}

	rgb := make([][]int, n+1)
	rgb[0] = make([]int, 3)
	for i := 1; i <= n; i++ {
		rgb[i] = make([]int, 3)
		for j := 0; j < 3; j++ {
			rgb[i][j] = rgb[i-1][j]
		}
		rgb[i][ns[i-1]]++
	}
	var sum int
	for i := 0; i < n-2; i++ {
		for j := i + 1; j < n-1; j++ {
			if ns[i] != ns[j] {
				tn := 3 - ns[i] - ns[j]
				sum += rgb[n][tn] - rgb[j+1][tn]
				k := 2*j - i
				if k < n && ns[k] == tn {
					sum--
				}
			}
		}
	}
	fmt.Println(sum)
}
