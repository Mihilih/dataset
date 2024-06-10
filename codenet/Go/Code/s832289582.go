package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
)

// N: [1, 2e5]
// len(S) = N
// P: [2, 10000], prime
func main() {
	sc := newInputScanner(true, 256)
	N, P, S := sc.nextInt(), sc.nextInt(), sc.nextStr()
	answer := checkSubNumbers(N, P, S)
	fmt.Println(answer)
}

func checkSubNumbers(N int, P int, S string) int {
	switch P {
	case 2, 5:
		return checkTwoOrFive(N, P, S)
	default:
		return checkNotTwoNorFive(N, P, S)
	}
}

func checkTwoOrFive(N int, P int, S string) int {
	answer := 0
	var n int
	for i := N - 1; i >= 0; i-- {
		n, _ = strconv.Atoi(S[i : i+1])
		if n%P == 0 {
			answer += i + 1
		}
	}
	return answer
}

func checkNotTwoNorFive(N int, P int, S string) int {
	multiplier := 1 // 10^i % P
	answer := 0
	remainderLookup := make([]int, P)
	prevRemaider := -1
	var digit, remainder, count int
	for i := N - 1; i >= 0; i-- {
		digit = int(S[i] - '0')
		if prevRemaider == -1 { // first digit
			remainder = digit % P
		} else {
			remainder = (((multiplier * digit) % P) + prevRemaider) % P
		}
		if remainder == 0 {
			answer++
		}
		count = remainderLookup[remainder]
		answer += count
		count++
		remainderLookup[remainder] = count
		prevRemaider = remainder
		multiplier = (multiplier * 10) % P
	}
	return answer
}

type inputScanner struct {
	*bufio.Scanner
}

func newInputScanner(enabledScanWords bool, sizeInKB int) *inputScanner {
	scanner := bufio.NewScanner(os.Stdin)
	if enabledScanWords {
		scanner.Split(bufio.ScanWords)
	}
	capacity := sizeInKB * 1024
	buf := make([]byte, capacity)
	scanner.Buffer(buf, capacity)
	return &inputScanner{
		Scanner: scanner,
	}
}

func (inputSc *inputScanner) nextInt() int {
	i, e := strconv.Atoi(inputSc.nextStr())
	if e != nil {
		panic(e)
	}
	return i
}

func (inputSc *inputScanner) nextUInt64() uint64 {
	i, e := strconv.ParseUint(inputSc.nextStr(), 10, 64)
	if e != nil {
		panic(e)
	}
	return i
}

func (inputSc *inputScanner) nextStr() string {
	inputSc.Scan()
	return inputSc.Text()
}
