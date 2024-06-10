package main

import (
	"fmt"
	"math"
)

func main() {
	var n, m int
	fmt.Scan(&n, &m)
	x := m*1900 + (n-m)*100
	fmt.Println(x * int(math.Pow(2.0, float64(m))))
}
