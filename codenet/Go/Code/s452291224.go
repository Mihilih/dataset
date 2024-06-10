package main

import "fmt"

func main() {
	var A, B, C int
	fmt.Scanf("%d %d %d", &A, &B, &C)
	if C-A+B < 0 {
		fmt.Println("0")
	} else {
		fmt.Printf("%d\n", C-A+B)
	}
}
