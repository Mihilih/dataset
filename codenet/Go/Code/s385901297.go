package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)

	ns := make([]int, 4)
	scanner.Scan()
	fmt.Sscanf(scanner.Text(), "%d %d %d %d", &ns[0], &ns[1], &ns[2], &ns[3])

	sort.Sort(sort.IntSlice(ns))
	if ns[0] == 1 && ns[1] == 4 && ns[2] == 7 && ns[3] == 9 {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}
}
