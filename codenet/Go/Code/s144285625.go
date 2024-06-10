package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

var sc = bufio.NewScanner(os.Stdin)

func main() {
	sc.Split(bufio.ScanWords)
	n := nextInt()
	ar := make([]int, 3*n)
	for i := range ar {
		ar[i] = nextInt()
	}
	sort.Ints(ar)
	sum := 0
	for i := 0; i < n; i++ {
		sum += ar[3*n-(i+1)*2]
	}
	fmt.Println(sum)
}

func nextInt() int {
	sc.Scan()
	i, _ := strconv.Atoi(sc.Text())
	return i
}
