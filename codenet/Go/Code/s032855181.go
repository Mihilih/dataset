package main

import (
	"fmt"
)

func group(n int) string {
	if n == 4 || n == 6 || n == 9 || n == 11 {
		return "B"
	} else {
		return "A"
	}
}

func main() {
	var x, y int
	fmt.Scan(&x, &y)

	if x == 2 || y == 2 {
		fmt.Println("No")
		return
	}

	xg := group(x)
	yg := group(y)

	if xg == yg {
		fmt.Println("Yes")
	} else {
		fmt.Println("No")
	}
}
