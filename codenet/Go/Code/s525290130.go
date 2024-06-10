package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func nextInt(sc *bufio.Scanner) int {
	sc.Scan()
	t, _ := strconv.Atoi(sc.Text())
	return t
}

func reva(b []int) {
	for i := 0; i < len(b)/2; i++ {
		b[i], b[len(b)-1-i] = b[len(b)-1-i], b[i]
	}
}

func main() {
	sc := bufio.NewScanner(os.Stdin)
	sc.Split(bufio.ScanWords)
	n := nextInt(sc)
	a := make([]int, n)
	for i := range a {
		a[i] = nextInt(sc)
	}
	q := nextInt(sc)
	for i := 0; i < q; i++ {
		b := nextInt(sc)
		e := nextInt(sc)
		reva(a[b:e])
	}
	wtr := bufio.NewWriter(os.Stdout)
	for i := 0; i < n; i++ {
		if i > 0 {
			fmt.Fprint(wtr, " ")
		}
		fmt.Fprint(wtr, a[i])
	}
	fmt.Fprintln(wtr)
	wtr.Flush()
}

