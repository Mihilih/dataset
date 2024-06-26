// 深さ優先探索
package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func genid(a, b int) int {
	if b < a {
		a, b = b, a
	}
	return a*100000 + b
}

func main() {
	N := readInt()

	ab := make([][2]int, N-1)
	edges := make([][]int, N)
	for i := 0; i < N-1; i++ {
		a := readInt() - 1
		b := readInt() - 1
		ab[i][0], ab[i][1] = a, b
		edges[a] = append(edges[a], b)
		edges[b] = append(edges[b], a)
	}

	colors := make(map[int]int)
	q := make([][3]int, 0)
	q = append(q, [3]int{0, -1, -1})
	for len(q) != 0 {
		currentNode, usedColor, parentNode := q[len(q)-1][0], q[len(q)-1][1], q[len(q)-1][2]
		q = q[:len(q)-1]
		color := 1
		for _, childNode := range edges[currentNode] {
			if childNode == parentNode {
				continue
			}
			if color == usedColor {
				color++
			}
			colors[genid(currentNode, childNode)] = color
			q = append(q, [3]int{childNode, color, currentNode})
			color++
		}
	}

	K := -1
	for i := 0; i < N; i++ {
		t := len(edges[i])
		if t > K {
			K = t
		}
	}
	fmt.Println(K)

	for i := 0; i < N-1; i++ {
		fmt.Println(colors[genid(ab[i][0], ab[i][1])])
	}
}

const (
	ioBufferSize = 1 * 1024 * 1024 // 1 MB
)

var stdinScanner = func() *bufio.Scanner {
	result := bufio.NewScanner(os.Stdin)
	result.Buffer(make([]byte, ioBufferSize), ioBufferSize)
	result.Split(bufio.ScanWords)
	return result
}()

func readString() string {
	stdinScanner.Scan()
	return stdinScanner.Text()
}

func readInt() int {
	result, err := strconv.Atoi(readString())
	if err != nil {
		panic(err)
	}
	return result
}
