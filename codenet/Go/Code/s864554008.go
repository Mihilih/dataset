package main

import "fmt"

type data struct {
	n, m       int
	nImg, mImg []string
}

func main() {
	d := newData()
	if d.exist() {
		fmt.Println("Yes")
	} else {
		fmt.Println("No")
	}
}

func newData() data {
	var n, m int
	fmt.Scanf("%d %d", &n, &m)
	nImg := load(n)
	mImg := load(m)

	return data{n: n, m: m, nImg: nImg, mImg: mImg}
}

func load(cnt int) []string {
	ret := make([]string, cnt)
	for i := 0; i < cnt; i++ {
		fmt.Scanf("%s", &ret[i])
	}

	return ret
}

func (d data) exist() bool {
	for i := 0; i <= d.n-d.m; i++ {
		for j := 0; j <= d.n-d.m; j++ {
			if d.match(i, j) {
				return true
			}
		}
	}

	return false
}

func (d data) match(x, y int) bool {
	for i := 0; i < d.m; i++ {
		for j := 0; j < d.m; j++ {
			if d.nImg[x+i][y+j] != d.mImg[i][j] {
				return false
			}
		}
	}

	return true
}