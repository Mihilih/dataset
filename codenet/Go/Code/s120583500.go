package main

import (
	"fmt"
	"sort"
	"strings"
)

func main() {
	var s string
	fmt.Scan(&s)

	count := 0
	var counter []int

	if s == "" {
		return
	}
	counter = append(counter, 0)
	li := strings.Split(s, "")

	for _, s := range li {
		if s == "A" || s == "C" || s == "G" || s == "T" {
			count++
		} else {
			counter = append(counter, count)
			count = 0
		}
	}

	counter = append(counter, count)
	sort.Ints(counter)
	fmt.Println(counter[len(counter)-1])
}
