// Package main provides
//
// File:  a.go
// Author: ymiyamoto
//
// Created on Sat Dec 29 04:47:30 2018
//
package main

import "fmt"

func main() {
	var A, B, C int
	fmt.Scan(&A, &B, &C)

	if A+B >= C {
		fmt.Println("Yes")
	} else {
		fmt.Println("No")
	}
}
