package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

var sc *bufio.Scanner

func nextStr() string {
	sc.Scan()
	return sc.Text()
}

func nextInt() int {
	sc.Scan()
	i, e := strconv.Atoi(sc.Text())
	if e != nil {
		panic(e)
	}
	return i
}

func main() {
	sc = bufio.NewScanner(os.Stdin)
	sc.Buffer(make([]byte, 0), 1000000001*3)
	sc.Split(bufio.ScanWords)
	n := nextInt()

	ans := 0
	aPrev := 0
	for i := 0; i < n; i++ {
		a := nextInt()
		switch {
		case a > i || a > aPrev+1:
			fmt.Println(-1)
			return
		case a == aPrev+1:
			ans++
		default:
			ans += a
		}
		aPrev = a
	}
	fmt.Println(ans)
}
