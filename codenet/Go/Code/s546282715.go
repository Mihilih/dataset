package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

func getNextWord(scanner *bufio.Scanner) string {
	scanner.Scan()
	return scanner.Text()
}

func getNextInt(scanner *bufio.Scanner) int {
	i, _ := strconv.Atoi(getNextWord(scanner))
	return i
}

func main() {
	fp := os.Stdin
	if len(os.Args) > 1 {
		fp, _ = os.Open(os.Args[1])
	}

	scanner := bufio.NewScanner(fp)
	scanner.Split(bufio.ScanWords)
	writer := bufio.NewWriter(os.Stdout)

	n := getNextInt(scanner)
	m := getNextInt(scanner)
	aa := make(map[int]int, 0)
	for i := 0; i < m; i++ {
		aa[getNextInt(scanner)] = 1
	}

	dp := make([]int, n+1)
	dp[0] = 1
	for i := 0; i < n; i++ {
		for ii := 1; ii <= 2 && i+ii <= n; ii++ {
			_, ok := aa[i+ii]
			if ok {
				continue
			}
			dp[i+ii] += dp[i]
			dp[i+ii] %= 1000000007
		}
	}
	fmt.Fprintln(writer, dp[n])

	writer.Flush()
}
