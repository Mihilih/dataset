package main

import (
	"fmt"
	"strings"
)

func main() {
	var a string
	fmt.Scan(&a)
	tmp := strings.Replace(a, "1", "0", -1)
	b := strings.Replace(tmp, "9", "1", -1)
	ans := strings.Replace(b, "0", "9", -1)
	fmt.Println(ans)
}