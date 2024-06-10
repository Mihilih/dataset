package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func getScanner(fp *os.File) *bufio.Scanner {
	scanner := bufio.NewScanner(fp)
	scanner.Split(bufio.ScanWords)
	scanner.Buffer(make([]byte, 500001), 500000)
	return scanner
}

func getNextString(scanner *bufio.Scanner) string {
	scanner.Scan()
	return scanner.Text()
}

func getNextInt(scanner *bufio.Scanner) int {
	i, _ := strconv.Atoi(getNextString(scanner))
	return i
}

func getNextInt64(scanner *bufio.Scanner) int64 {
	i, _ := strconv.ParseInt(getNextString(scanner), 10, 64)
	return i
}

func getNextUint64(scanner *bufio.Scanner) uint64 {
	i, _ := strconv.ParseUint(getNextString(scanner), 10, 64)
	return i
}

func getNextFloat64(scanner *bufio.Scanner) float64 {
	i, _ := strconv.ParseFloat(getNextString(scanner), 64)
	return i
}

func main() {
	fp := os.Stdin
	if len(os.Args) > 1 {
		fp, _ = os.Open(os.Args[1])
	}
	scanner := getScanner(fp)
	writer := bufio.NewWriter(os.Stdout)

	n := getNextInt(scanner)
	m := getNextInt(scanner)
	seg := Segment{}
	seg.init(n)
	for i := 0; i < n; i++ {
		seg.maximize(i, getNextInt(scanner))
	}
	for i := 0; i < m; i++ {
		seg.maximize(seg.top(), seg.bucket[seg.h-1][0]>>1)
	}

	var ans int64
	for i := 0; i < n; i++ {
		ans += int64(seg.bucket[0][i])
	}

	fmt.Fprintln(writer, ans)
	writer.Flush()
}

// Segment ...
type Segment struct {
	n, h, i, chunk int
	unit           []int
	bucket         [][]int
}

func (seg *Segment) init(n int) {
	seg.n = n
	seg.unit = make([]int, 1)
	seg.unit[0] = 1
	seg.bucket = make([][]int, 1)
	seg.bucket[0] = make([]int, n)

	chunk := 8
	for i := 0; n > 1; i++ {
		n = (n-1)/chunk + 1
		seg.bucket = append(seg.bucket, make([]int, n))
		seg.unit = append(seg.unit, seg.unit[i]*chunk)
	}
	seg.h = len(seg.unit)
	seg.chunk = chunk
}

func (seg *Segment) maximize(index, value int) {
	seg.bucket[0][index] = value
	for seg.i = 0; seg.i < seg.h-1; seg.i++ {
		s := index - index%seg.chunk
		t := s + seg.chunk
		if t > len(seg.bucket[seg.i]) {
			t = len(seg.bucket[seg.i])
		}
		parent := index / seg.chunk
		max := 0
		for i := s; i < t; i++ {
			if max < seg.bucket[seg.i][i] {
				max = seg.bucket[seg.i][i]
			}
		}
		seg.bucket[seg.i+1][parent] = max
		index /= seg.chunk
	}
}

func (seg *Segment) top() int {
	index := 0
	for seg.i = seg.h - 2; seg.i >= 0; seg.i-- {
		s := index * seg.chunk
		t := s + seg.chunk
		if t > len(seg.bucket[seg.i]) {
			t = len(seg.bucket[seg.i])
		}
		for i := s; i < t; i++ {
			if seg.bucket[seg.i][i] == seg.bucket[seg.i+1][index] {
				index = i
				break
			}
		}
	}

	return index
}
