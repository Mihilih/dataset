package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func out(x ...interface{}) {
	fmt.Println(x...)
}

var sc = bufio.NewScanner(os.Stdin)

func getInt() int {
	sc.Scan()
	i, e := strconv.Atoi(sc.Text())
	if e != nil {
		panic(e)
	}
	return i
}

func getString() string {
	sc.Scan()
	return sc.Text()
}

func main() {
	sc.Split(bufio.ScanWords)
	sc.Buffer([]byte{}, 1000000)
	n, q := getInt(), getInt()

	fw := FenwickTree(n)
	for i := 0; i < n; i++ {
		a := getInt()
		fw.Add(i, a)
	}

	for i := 0; i < q; i++ {
		t := getInt()
		if t == 0 {
			p, x := getInt(), getInt()
			fw.Add(p, x)
		} else {
			l, r := getInt(), getInt()
			out(fw.Sum(l, r))
		}

	}

}

// ** copy from here to your source code **
//
// fenwick tree
//  1. go lang have no generics, so implement int(long long)
//  data type only.
//  2. do not care overflow
//

// BIT :
type BIT struct {
	n    int
	data []int
}

// FenwickTree :
func FenwickTree(n int) *BIT {
	var ret BIT
	ret.n = n
	ret.data = make([]int, n)
	return &ret
}

// Add :
func (b *BIT) Add(p, x int) {
	p++
	for p <= b.n {
		b.data[p-1] += x
		p += p & -p
	}
}

// Sum :
func (b *BIT) Sum(l, r int) int {
	return b.sum(r) - b.sum(l)
}

func (b *BIT) sum(r int) int {
	s := 0
	for r > 0 {
		s += b.data[r-1]
		r -= r & -r
	}
	return s
}
