package main

import (
	"fmt"
	"os"
	"strings"
)

var (
	s string
)

func main() {
	fmt.Scan(&s)

	for i := 0; i < len(s); i++ {
		if strings.Contains(s[i+1:], string(s[i])) {
			fmt.Println("no")
			os.Exit(0)
		}
	}

	fmt.Println("yes")
}