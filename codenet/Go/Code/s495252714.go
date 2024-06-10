package main

import (
	"sort"
	"fmt"
	"bufio"
	"os"
	"strconv"
)

//=====I/O=====

var (
	sc = bufio.NewScanner(os.Stdin)
	wr = bufio.NewWriter(os.Stdout)
)

func scanInt() int {
	sc.Scan()
	a,_ := strconv.Atoi(sc.Text())
	return a
}

func scanInt64() int64 {
	sc.Scan()
	a,_ := strconv.ParseInt(sc.Text(),10,64)
	return a
}

func scanInts(n int) []int {
	res := make([]int, n)
	for i := 0; i < n; i++ { res[i] = scanInt() }
	return res
}

func scanText() string {
	sc.Scan()
	return sc.Text()
}

func printInts(a ...int) {
	for i, e := range a {
		fmt.Fprint(wr, e)
		if i != len(a)-1 { fmt.Fprint(wr, " ") }
	}
	fmt.Fprintln(wr)
	wr.Flush()
}

//=====main=====

func main() {
	sc.Split(bufio.ScanWords)

	n := scanInt()

	c := scanInts(n)

	ans := 0
	sort.Ints(c)

	for i := 0; i < n; i++ {
		ans = (ans+(n+1-i)*c[i]%mod)%mod
	}

	fmt.Println(ans*modpow(4,n-1)%mod)
}

const mod = 1000000007

func modpow(a,n int) int {
	res := 1
	for n>0 {
		if n&1 == 1 {
			res = res*a%mod
		}
		a = a*a%mod
		n= n>>1
	}
	return res
}
