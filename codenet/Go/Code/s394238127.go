package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func main() {
	scanner := bufio.NewScanner(os.Stdin)
	scanner.Split(bufio.ScanWords)
	var c [3][3]int
	var a, b [3]int
	for i := 0; i < 3; i++ {
		for j := 0; j < 3; j++ {
			scanner.Scan()
			c[i][j], _ = strconv.Atoi(scanner.Text())
		}
	}

	b[0] = c[0][0] - a[0]
	b[1] = c[0][1] - a[0]
	b[2] = c[0][2] - a[0]
	a[1] = c[1][0] - c[0][0]
	a[2] = c[2][0] - c[0][0]
	if a[1] == c[1][1] - c[0][1] && a[1] == c[1][2] - c[0][2] &&
		a[2] == c[2][1] - c[0][1] && a[2] == c[2][2] - c[0][2] {
		fmt.Println("Yes")
	} else {
		fmt.Println("No")
	}
}