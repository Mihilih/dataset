package main

import (
	"bufio"
	"fmt"
	"os"
	"sort"
	"strconv"
	"strings"
)

//scanで一行づつ読み込む
var sc = bufio.NewScanner(os.Stdin)
var wtr = bufio.NewWriter(os.Stdout)
var N, ss, ans, A, B, C int

//sort
// array := []int{5, 1, 4, 2, 3}
// sort.Sort(sort.IntSlice(array))

func main() {
	// A := strings.Split(nextLine(), " ")

	X := strings.Split(nextLine(), " ")

	// Z := strings.Split(nextLine(), " ")
	// n, _ := strconv.Atoi(input[0])

	N, _ = strconv.Atoi(X[0])
	A, _ = strconv.Atoi(X[1])
	B, _ = strconv.Atoi(X[2])
	C, _ = strconv.Atoi(X[3])

	// K, _ := strconv.Atoi(X[2]) //strconv.ParseInt(X[2], 10, 64)

	// Y := strings.Split(nextLine(), " ")

	arr := make([]int, N)
	dp := make([]int, N)
	ans = 10000
	ss = A + B + C
	// sort.Sort(sort.Reverse(sort.IntSlice(arr)))
	for i := 0; i < N; i++ {
		Y := strings.Split(nextLine(), " ")

		a, _ := strconv.Atoi(Y[0])
		arr[i] = a

	}
	dfs(dp, 0, arr)

	/*文字列連結高速化
	初期化:buf := make([]byte, 0,N+1)
	連結:buf=append(buf,str)
	出力:string(buf)
	*/
	// sort.Sort(sort.Reverse(dp[M][N]))

	fmt.Fprintln(wtr, ans)

	_ = wtr.Flush()
}

func dfs(dp []int, times int, arr []int) {
	if times >= N {
		ans = min(ans, calc(dp, arr))
		return
	}

	for i := 0; i < 4; i++ {
		dp[times] = i
		dfs(dp, times+1, arr)
	}
}

func calc(dp, arr []int) int {
	var cost, AA, BB, CC int

	memo := make([]int, 4)
	for i := 0; i < len(dp); i++ {
		memo[dp[i]]++
		if dp[i] == 1 {
			AA += arr[i]
		} else if dp[i] == 2 {
			BB += arr[i]
		} else if dp[i] == 3 {
			CC += arr[i]
		}
	}
	cost += abs(A-AA) + abs(B-BB) + abs(C-CC)

	for i := 1; i < 4; i++ {
		a := memo[i]
		if a < 1 {
			cost += 10000
		} else {
			cost += (a - 1) * 10
		}
	}

	return cost
}

type otosidama struct {
	x float64
	v string
}

// func culc(a, b, c, d int64) (ret int64) {
// 	ret = abs(a-c) + abs(b-d)
// 	return
// }

func chmax(a *string, b string) {
	if len(*a) < len(b) {
		*a = b
	} else if len(*a) == len(b) && *a < b {
		*a = b
	}
}

func gcd(a, b int) int {
	if b == 0 {
		return a
	}
	return gcd(b, a%b)
}

func nextLine() string {
	sc.Scan()
	return sc.Text()
}

func min(a, b int) int {
	if a < b {
		return a
	}
	return b
}
func max(a, b int64) int64 {
	if a > b {
		return a
	}
	return b
}
func com(a, b int) int {

	if a > b {
		return 0
	}
	return 0 //abs(a - b)
}

func abs(a int) int {
	if a < 0 {
		return a * -1
	}
	return a
}
func sum(a []int) (sum int) {
	for _, num := range a {
		sum += num
	}
	return
}

type item struct {
	x int
	// y     int
	// point int
}

type que []item

func (p que) Len() int {
	return len(p)
}

func (p que) Swap(i, j int) {
	p[i], p[j] = p[j], p[i]
}

func (p que) Less(i, j int) bool {

	// return p[i].point > p[j].point //p[i].x+p[i].y > p[j].x+p[j].y
	return p[i].x < p[j].x
}

func (p que) Push(in int) {
	p = append(p, item{x: in})
	sort.Sort(p)
}

func (p que) Pop() int {
	res := p[0].x
	p = p[1:]
	return res
}

func (p que) Peek() int {
	return p[0].x
}
