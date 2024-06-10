package main

import (
	_"bufio"
	"fmt"
	_"os"
	_"strconv"
)

func main() {
	var x, a, b int
	fmt.Scan(&x, &a, &b)
	switch {
		case b-a <= 0:
			fmt.Println("delicious")
			break
		case b-a <= x:
			fmt.Println("safe")
			break
		default:
			fmt.Println("dangerous")
			break
	}
}
