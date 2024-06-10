package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"sort"
	"strconv"
)

func main() {
	INF := int(math.Pow10(11))
	A := nextInt()
	B := nextInt()
	Q := nextInt()
	s := make([]int, A+2)
	s[0], s[A+1] = -INF, INF
	for i := 1; i <= A; i++ {
		s[i] = nextInt()

	}

	t := make([]int, B+2)
	t[0], t[B+1] = -INF, INF
	for i := 1; i <= B; i++ {
		t[i] = nextInt()
	}

	for i := 0; i < Q; i++ {
		x := nextInt()
		b, d := sort.SearchInts(s, x), sort.SearchInts(t, x)
		res := INF
		for _, S := range []int{s[b-1], s[b]} {
			for _, T := range []int{t[d-1], t[d]} {
				d1, d2 := abs(S-x)+abs(T-S), abs(T-x)+abs(S-T)
				res = min(res, min(d1, d2))
			}
		}

		fmt.Println(res)
	}
}

// Input. ----------

var sc = bufio.NewScanner(os.Stdin)

func init() {
	sc.Buffer([]byte{}, math.MaxInt64)
	sc.Split(bufio.ScanWords)
}

func nextInt() int {
	sc.Scan()
	i, err := strconv.Atoi(sc.Text())
	if err != nil {
		panic(err)
	}

	return i
}

func nextFloat() float64 {
	sc.Scan()
	f64, err := strconv.ParseFloat(sc.Text(), 64)
	if err != nil {
		panic(err)
	}

	return f64
}

func nextString() string {
	sc.Scan()
	if err := sc.Err(); err != nil {
		panic(err)
	}

	return sc.Text()
}

// ---------- Input.

// Util. ----------

func abs(x int) int {
	return int(math.Abs(float64(x)))
}

func min(x, y int) int {
	return int(math.Min(float64(x), float64(y)))
}

func max(x, y int) int {
	return int(math.Max(float64(x), float64(y)))
}

// ---------- Util.
