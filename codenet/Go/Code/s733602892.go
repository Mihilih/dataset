package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

func main() {
	N, K := ReadInt(), ReadInt()
	As := ReadInts(N)
	Fs := ReadInts(N)

	sort.Ints(As)
	sort.Sort(sort.Reverse(sort.IntSlice(Fs)))
	scores := make([]int, N)
	for i := 0; i < N; i++ {
		scores[i] = As[i] * Fs[i]
	}
	sort.Sort(sort.Reverse(sort.IntSlice(scores)))

	ok := scores[0]
	ng := -1
	for ok-ng > 1 {
		mid := (ok + ng) / 2

		isOK := true
		k := K
		for i := 0; isOK && i < N; i++ {
			if As[i]*Fs[i] > mid {
				k -= As[i] - mid/Fs[i]
			}
			if k < 0 {
				isOK = false
			}
		}

		if isOK {
			ok = mid
		} else {
			ng = mid
		}

	}
	fmt.Println(ok)
}

func ReadInts(n int) []int {
	ret := make([]int, n)
	for i := 0; i < n; i++ {
		ret[i] = ReadInt()
	}
	return ret
}

var sc = bufio.NewScanner(os.Stdin)

func init()        { sc.Buffer(make([]byte, 256), 1e9); sc.Split(bufio.ScanWords) }
func Read() string { sc.Scan(); return sc.Text() }

func ReadInt() int {
	v, e := strconv.Atoi(Read())
	if e != nil {
		panic(e.Error())
	}
	return v
}
