// +build ignore
package main

import (
	"bufio"
	"fmt"
	"io"
	"os"
	"strconv"
)

// I/O
type Scanner struct {
	sc *bufio.Scanner
}

func NewScanner() *Scanner {
	sc := bufio.NewScanner(os.Stdin)
	sc.Split(bufio.ScanWords)
	sc.Buffer(make([]byte, 10240), int(1e+9))
	return &Scanner{sc}
}

func (s *Scanner) nextStr() string {
	s.sc.Scan()
	return s.sc.Text()
}

func (s *Scanner) nextInt() int {
	i, e := strconv.Atoi(s.nextStr())
	if e != nil {
		panic(e)
	}
	return i
}

func (s *Scanner) nextFloat() float64 {
	f, e := strconv.ParseFloat(s.nextStr(), 64)
	if e != nil {
		panic(e)
	}
	return f
}

func (s *Scanner) nextRuneSlice() []byte {
	return []byte(s.nextStr())
}

func (s *Scanner) nextIntSlice(n int) []int {
	res := make([]int, n)
	for i := 0; i < n; i++ {
		res[i] = s.nextInt()
	}
	return res
}

func (s *Scanner) nextFloatSlice(n int) []float64 {
	res := make([]float64, n)
	for i := 0; i < n; i++ {
		res[i] = s.nextFloat()
	}
	return res
}

func run(input io.Reader, output io.Writer) int {
	sc := NewScanner()
	N := sc.nextInt()
	S := sc.nextStr()

	if N == 0 {
	}

	if N < 4 {
		fmt.Println(0)
		return 0
	}

	var nr, nb, ng int
	for _, c := range S {
		if c == 'R' {
			nr++
		}

		if c == 'B' {
			nb++
		}

		if c == 'G' {
			ng++
		}
	}

	same := 0
	// etot := 0
	for a := 1; a < N; a++ {
		i := 0
		j := 1 * a
		k := 2 * a
		if k >= N {
			break
		}
		for k < N {
			// etot++
			// fmt.Printf("(%4d) [%2d] (%3d, %3d, %3d)", etot, a, i, j, k)
			if S[i] != S[j] && S[i] != S[k] && S[j] != S[k] {
				same++
				// fmt.Printf(" (%4d)", same)
			}
			// fmt.Println()
			i += 1
			j += 1
			k += 1
		}
	}

	tot := nr * nb * ng

	// sum := 0
	// sum2 := 0
	// for k := 2; k < N; k++ {
	// 	for j := 1; j < k; j++ {
	// 		for i := 0; i < j; i++ {
	// 			if j-i == k-j {
	// 				if S[i] != S[j] && S[i] != S[k] && S[j] != S[k] {
	// 					sum2++
	// 				}
	// 				continue
	// 			}

	// 			if S[i] != S[j] && S[i] != S[k] && S[j] != S[k] {
	// 				sum++
	// 			}
	// 		}
	// 	}
	// }

	// fmt.Println(tot, same, sum, sum2)
	fmt.Println(tot - same)

	return 0
}

func main() {
	os.Exit(run(os.Stdin, os.Stdout))
}
