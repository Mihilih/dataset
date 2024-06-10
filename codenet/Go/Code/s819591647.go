//problem_b.go

package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
	//"strings"
)

const (
	constMod = int(1e9) + 7
)

var (
	sc = bufio.NewScanner(os.Stdin)
	wr = bufio.NewWriter(os.Stdout)
)

// -----------------------------------------

func getInt() int {
	sc.Scan()
	i, e := strconv.Atoi(sc.Text())
	if e != nil {
		panic(e)
	}
	return i
}

func getIntSlice(n int) []int {
	ns := []int{}
	for i := 0; i < n; i++ {
		ns = append(ns, getInt())
	}
	return ns
}

func getIntDoubleSlice(m int, n int) [][]int {
	var nds [][]int
	for i := 0; i < m; i++ {
		ns := getIntSlice(n)
		nds = append(nds, ns)
	}

	return nds
}

func getString() string {
	sc.Scan()
	return sc.Text()
}

func getStringSlice(n int) []string {
	ss := []string{}
	for i := 0; i < n; i++ {
		ss = append(ss, getString())
	}
	return ss
}

func getStringDoubleSlice(m int, n int) [][]string {
	sds := [][]string{}
	for i := 0; i < m; i++ {
		ss := getStringSlice(n)
		sds = append(sds, ss)
	}

	return sds

}

// -----------------------------------------

// Sort Fanction

func sortIntSlice(ns []int) []int {
	sort.Sort(sort.IntSlice(ns))
	return ns
}

func sortIntReverseSlice(ns []int) []int {
	sort.Sort(sort.Reverse(sort.IntSlice(ns)))
	return ns
}

// -----------------------------------------

// Num Fanction

//numAbs(x) = abs(s)
func numAbs(x int) int {
	if x < 0 {
		return -x
	}

	return x
}

//numModPow(a, n, m) = a^n % m
func numModPow(a int, n int, m int) int {
	result := 1

	for n > 0 {
		if n%2 == 1 {
			result = (result * a) % m
		}

		a = (a * a) % m
		n >>= 1
	}

	return result
}

// numGcd(a, b) = gcd(a, b)
func numGcd(a int, b int) int {
	if b == 0 {
		return a
	}

	return numGcd(b, a%b)
}

// numLcm(a, b) = lcm(a, b)
func numLcm(a int, b int) int {
	return a * b / numGcd(a, b)
}

// numModInv(a, p) = a^(-1) % p
func numModInv(a int, p int) int {
	if a == 1 {
		return 1
	}

	return p - numModInv(p%a, p)*(p/a)%p
}

// numModFrac(n) = n! % constMod
func numModFrac(n int) []int {
	frac := []int{1}

	for i := 1; i <= n; i++ {
		frac = append(frac, i*frac[i-1]%constMod)
	}

	return frac
}

// numModConb(n, r) = nCr % constMod
func numModConb(n int, r int) int {
	frac := numModFrac(n)

	return (frac[n] / ((frac[n-r] * frac[r]) % constMod)) % constMod
}

// -----------------------------------------

func solve() {

	n, m := getInt(), getInt()
	a := getIntSlice(n)

	sum := 0
	for _, v := range a {
		sum += v
	}

	count := 0
	for _, v := range a {
		rate := float64(sum) / float64(4*m)
		if float64(v) >= rate {
			count++
		}
	}

	if count >= m {
		fmt.Fprintln(wr, "Yes")
	} else {
		fmt.Fprintln(wr, "No")
	}

}

// -----------------------------------------

func main() {
	maxBufSize := int(1e8)
	sc.Buffer(make([]byte, 4096), maxBufSize)
	sc.Split(bufio.ScanWords)
	solve()
	wr.Flush()
}
