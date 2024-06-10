package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	var N int
	fmt.Scan(&N)
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Split(bufio.ScanWords)
	v := make([]int, N)
	var a int

	for i := 1; i < N; i++ {
		scanner.Scan()
		a, _ = strconv.Atoi(scanner.Text())
		v[a-1]++
	}

	w := bufio.NewWriter(os.Stdout)
	for _, e := range v {
		fmt.Fprintln(w, e)
	}
	w.Flush()

}
