package main

import (
	"fmt"
	"math"
)

func walkOnMultiplicationTable(num int) int {

	div := 0
	for i := int(math.Sqrt(float64(num))); i > 1; i-- {
		if num%i == 0 {
			div = i
			break
		}
	}
	if div == 0 {
		return num - 1
	}
	return div + num/div - 2

}

func main() {
	var a int
	fmt.Scan(&a)
	fmt.Println(walkOnMultiplicationTable(a))
}
