package main

import "fmt"

var e [][]int
var n, m int

func printEdge(e [][]int) {
	for i := 1; i < n+1; i++ {
		fmt.Printf("%d: ", i)
		for _, v := range e[i] {
			fmt.Printf("%d ", v)
		}
		fmt.Println()
	}
}

func dfs(v int, visited []bool) int {
	// visited[v] = true
	// fmt.Println(v, visited)

	comp := true
	for i := 1; i < n+1; i++ {
		if !visited[i] {
			comp = false
		}
	}

	if comp {
		return 1
	}

	count := 0
	for _, ne := range e[v] {
		// fmt.Printf("ne=%d\n", ne)
		if visited[ne] {
			continue
		}
		visited[ne] = true
		// if cmp, _ := dfs(ne, visited, count); cmp {
		// 	count++
		// }
		rst := dfs(ne, visited)
		// fmt.Println(rst)
		// count += dfs(ne, visited)
		count += rst
		visited[ne] = false
	}
	return count
}

func main() {
	fmt.Scan(&n, &m)

	e = make([][]int, n+1)
	for i := 1; i < n+1; i++ {
		e[i] = make([]int, 0)
	}
	for i := 0; i < m; i++ {
		var a, b int
		fmt.Scan(&a, &b)
		e[a] = append(e[a], b)
		e[b] = append(e[b], a)
	}
	// printEdge(e)

	visited := make([]bool, n+1)
	visited[1] = true
	count := dfs(1, visited)
	fmt.Println(count)
}
