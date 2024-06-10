package main

import (
	"bufio"
	"fmt"
	"os"
)

var sc = bufio.NewScanner(os.Stdin)

func ri() (n int) {
	sc.Scan()
	for _, v := range sc.Bytes() {
		n = n*10 + int(v-48)
	}
	return
}

func ave(s []float64) float64 {
	var sum float64
	for _, v := range s {
		sum += v
	}
	return float64(sum) / float64(len(s))
}

func diff(a, b float64) float64 {
	if a > b {
		return a - b
	}
	return b - a
}

func main() {
	sc.Split(bufio.ScanWords)
	n := ri()
	a := make([]float64, n)
	for i := 0; i < n; i++ {
		a[i] = float64(ri())
	}
	// fmt.Println(a)

	ave := ave(a)

	minDiff := 999999.9
	ansIndex := -1
	for i, v := range a {
		diff := diff(v, ave)
		if diff < minDiff {
			minDiff = diff
			ansIndex = i
		}
	}
	fmt.Println(ansIndex)
}
