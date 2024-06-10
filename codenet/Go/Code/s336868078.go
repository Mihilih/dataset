package main

import (
	"bufio"
	"fmt"
	"os"
)

var in = bufio.NewReader(os.Stdin)

func solve(a, b, c int) int {
	var temp_ int
	if c == a+b {
		temp_ = b + c
	}else if c-1 > a+b {
		temp := (c - 1) - (a + b)
		temp_ = b + c - temp
	}else{
		temp_ = b+c
	}
	 
	return temp_
}
func main() {
	var a, b, c int
	fmt.Fscanf(in, "%d %d %d¥n", &a, &b, &c)

	ans := solve(a, b, c)
	fmt.Println(ans)
}
