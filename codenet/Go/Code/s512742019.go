package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

// I/O
type Scanner struct {
	sc *bufio.Scanner
}

func NewScanner() *Scanner {
	sc := bufio.NewScanner(os.Stdin)
	sc.Split(bufio.ScanWords)
	sc.Buffer(make([]byte, 1024), int(1e+9))
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

func (s *Scanner) nextRuneSlice() []rune {
	return []rune(s.nextStr())
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

// Arithmetic
func max(nums ...int) int {
	m := nums[0]
	for _, i := range nums {
		if m < i {
			m = i
		}
	}
	return m
}

func min(nums ...int) int {
	m := nums[0]
	for _, i := range nums {
		if m > i {
			m = i
		}
	}
	return m
}

func abs(x int) int {
	if x > 0 {
		return x
	}
	return -x
}

func pow(x, y int) int {
	res := 1
	for i := 0; i < y; i++ {
		res *= x
	}
	return res
}

func ceil(a, b int) int {
	if a%b == 0 {
		return a / b
	} else {
		return a/b + 1
	}
}

// Sort
type RuneSlice []rune

func (a RuneSlice) Len() int           { return len(a) }
func (a RuneSlice) Less(i, j int) bool { return a[i] < a[j] }
func (a RuneSlice) Swap(i, j int)      { a[i], a[j] = a[j], a[i] }

// Main
const MOD = int(1e+9) + 7
const INF = 1 << 60

type Mon struct {
	x, h int
}

type Mons []Mon

func (a Mons) Len() int           { return len(a) }
func (a Mons) Less(i, j int) bool { return a[i].x < a[j].x }
func (a Mons) Swap(i, j int)      { a[i], a[j] = a[j], a[i] }

type Node struct {
	x, h int
}

type Queue struct {
	arr []Node
}

func (q *Queue) push(v Node) {
	q.arr = append(q.arr, v)
}

func (q *Queue) first() Node {
	return q.arr[0]
}

func (q *Queue) pop() Node {
	res := q.arr[0]
	q.arr = q.arr[1:]
	return res
}

func (q *Queue) isEmpty() bool {
	return len(q.arr) == 0
}

func main() {
	sc := NewScanner()
	wtr := bufio.NewWriter(os.Stdout)
	N, D, A := sc.nextInt(), sc.nextInt(), sc.nextInt()
	M := make([]Mon, N)
	for i := 0; i < N; i++ {
		M[i] = Mon{sc.nextInt(), sc.nextInt()}
	}
	sort.Sort(Mons(M))
	var q Queue
	ans := 0
	total := 0
	for i := 0; i < N; i++ {
		m := M[i]
		for !q.isEmpty() && q.first().x < m.x {
			total -= q.pop().h
		}
		if total < m.h {
			m.h -= total
			count := ceil(m.h, A)
			ans += count
			damage := count * A
			q.push(Node{m.x + 2*D, damage})
			total += damage
		}
	}

	fmt.Fprintln(wtr, ans)
	wtr.Flush()
}