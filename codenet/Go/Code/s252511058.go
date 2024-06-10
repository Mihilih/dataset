package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
)

func nextInt(sc *bufio.Scanner) int {
	sc.Scan()
	t, _ := strconv.Atoi(sc.Text())
	return t
}

type point struct {
	x, l, r int
}

type ps []point

func (p ps) Len() int {
	return len(p)
}
func (p ps) Swap(i, j int) {
	p[i], p[j] = p[j], p[i]
}
func (p ps) Less(i, j int) bool {
	return p[i].r < p[j].r
}

func main() {
	sc := bufio.NewScanner(os.Stdin)
	sc.Split(bufio.ScanWords)
	N := nextInt(sc)
	points := make([]point, N)
	for i := 0; i < N; i++ {
		points[i].x = nextInt(sc)
		L := nextInt(sc)
		points[i].l = points[i].x - L
		points[i].r = points[i].x + L
	}
	sort.Sort(ps(points))
	// 区間スケジューリング問題に帰着する
	start := points[0].r
	ans := 1
	for i := 0; i < len(points); i++ {
		if points[i].l < start {
			continue
		}
		start = points[i].r
		ans++
	}
	fmt.Println(ans)
}
