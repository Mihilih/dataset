package main

import (
	"fmt"
	"strings"
)

func main() {
	var s string
	fmt.Scan(&s)

	n := strings.Count(s, "o")
	fmt.Println(700 + n*100)
}
