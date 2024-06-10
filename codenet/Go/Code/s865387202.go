package main

import (
	"fmt"
	"sort"
	"strings"
)

type city struct {
	prefecture int
	position   int
	year       int
}

type cities []*city

type cMap map[int]cities

func main() {
	var (
		n, m int
	)
	fmt.Scanf("%d %d\n", &n, &m)
	h := make(cMap)
	for i := 0; i < m; i++ {
		var x, y int
		fmt.Scanf("%d %d\n", &x, &y)
		_, exists := h[x]
		if !exists {
			h[x] = cities{{prefecture: x, year: y, position: i}}
		} else {
			h[x] = append(h[x], &city{prefecture: x, year: y, position: i})
		}
	}

	results := make([]string, m)

	for _, v := range h {
		sort.Sort(v)
		for idx, ci := range v {
			results[ci.position] = fmt.Sprintf("%06d%06d", ci.prefecture, idx+1)
		}
	}
	fmt.Println(strings.Join(results, "\n"))
}

func (c cities) Len() int {
	return len(c)
}

func (c cities) Swap(i, j int) {
	c[i], c[j] = c[j], c[i]
}

func (c cities) Less(i, j int) bool {
	return c[i].year < c[j].year
}
