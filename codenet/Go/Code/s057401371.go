package main

import (
	"bufio"
	"fmt"
	"os"
)

func main() {
	sc := bufio.NewScanner(os.Stdin)
	sc.Scan()
	s := sc.Text()

	d := 'a' - 'A'
	for _, r := range s {
		rr := r
		if 'A' <= r && r <= 'Z' {
			rr = r + d
		} else if 'a' <= r && r <= 'z' {
			rr = r - d
		}
		fmt.Printf("%c", rr)
	}
	fmt.Println()
}

