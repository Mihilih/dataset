package main

import "fmt"

func main() {
	var a, b, c, d, e int

	fmt.Scan(&a, &b, &c, &d, &e)

	al := []int{a, b, c, d, e}

	for n, i := range al {
		if i == 0 {
			fmt.Println(n + 1)
			break
		}
	}
}