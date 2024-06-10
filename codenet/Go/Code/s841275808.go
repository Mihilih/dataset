package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"sort"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Split(bufio.ScanWords)
	
	N := ScanInt(scanner)
	X := make([]int, N)
	Y := make([]int, N)
	for i := 0; i < N; i++ {
	    X[i] = ScanInt(scanner)
	    Y[i] = X[i]
	}
	
	sort.Sort(sort.IntSlice(Y))
	m1 := Y[N / 2 - 1]
	m2 := Y[N / 2]
	for i := 0; i < N; i++ {
	    if X[i] <= m1 {
	        fmt.Println(m2)
	    } else {
	        fmt.Println(m1)
	    }
	}
	
}

func ScanInt(scanner *bufio.Scanner) int {
	scanner.Scan()
	i, e := strconv.Atoi(scanner.Text())
	if e != nil {
		panic(e)
	}
	return i
}

func ScanFloat64(scanner *bufio.Scanner) float64 {
	scanner.Scan()
	f, e := strconv.ParseFloat(scanner.Text(), 64)
	if e != nil {
		panic(e)
	}
	return f
}

func ScanText(scanner *bufio.Scanner) string {
	scanner.Scan()
	return scanner.Text()
}

func Max(a, b int) int {
	if a < b {
		return b
	}
	return a
}

func Min(a, b int) int {
	if a > b {
		return b
	}
	return a
}

func Abs(a int) int {
	if a < 0 {
		a *= -1
	}
	return a
}