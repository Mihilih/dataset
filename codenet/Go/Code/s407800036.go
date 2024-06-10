package main

import "fmt"

func main() {
	// Code for A - Between Two Integers
	var A, B, C int
	fmt.Scanf("%d %d %d", &A, &B, &C)

	if C >= A && C <= B {
		fmt.Println("Yes")
	} else {
		fmt.Println("No")
	}
}
