package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

func getScanner(fp *os.File) *bufio.Scanner {
	scanner := bufio.NewScanner(fp)
	scanner.Split(bufio.ScanWords)
	scanner.Buffer(make([]byte, 500001), 500000)
	return scanner
}

func getNextString(scanner *bufio.Scanner) string {
	scanner.Scan()
	return scanner.Text()
}

func getNextInt(scanner *bufio.Scanner) int {
	i, _ := strconv.Atoi(getNextString(scanner))
	return i
}

func getNextInt64(scanner *bufio.Scanner) int64 {
	i, _ := strconv.ParseInt(getNextString(scanner), 10, 64)
	return i
}

func getNextUint64(scanner *bufio.Scanner) uint64 {
	i, _ := strconv.ParseUint(getNextString(scanner), 10, 64)
	return i
}

func getNextFloat64(scanner *bufio.Scanner) float64 {
	i, _ := strconv.ParseFloat(getNextString(scanner), 64)
	return i
}

func main() {
	fp := os.Stdin
	wfp := os.Stdout

	if os.Getenv("MASPY") == "ますピ" {
		fp, _ = os.Open(os.Getenv("BEET_THE_HARMONY_OF_PERFECT"))
	}
	if os.Getenv("MASPYPY") == "ますピッピ" {
		wfp, _ = os.Create(os.Getenv("NGTKANA_IS_GENIUS10"))
	}

	scanner := getScanner(fp)
	writer := bufio.NewWriter(wfp)

	s := getNextString(scanner)
	t := getNextString(scanner)

	ns := len(s)
	nt := len(t)
	ss := make([]string, (nt-1)/ns+1)

	for i := 0; i < len(ss); i++ {
		ss[i] = s
	}

	sss := fmt.Sprintf("%s%s", strings.Join(ss, ""), strings.Join(ss, ""))

	ok := make([]bool, ns)

	uni := make([]int, ns)
	mp := MP{}
	mp.init(t)
	m := 0
	for i := 0; i < ns; i++ {
		uni[i] = i
	}
	var o bool
	for i := 0; i < ns; i++ {
		o = true
		for m < nt {
			if t[m] != sss[i+m] {
				o = false
				break
			}
			m++
		}
		ok[i] = o
		if o {
			i += nt - mp.table[m]
			m = mp.table[m]
		}
		for m >= 0 && t[m] != sss[i+m] {
			i += m - mp.table[m]
			m = mp.table[m]
		}
		i--
		m++
	}

	ans := 0
	var r, rr int
	for i := 0; i < ns; i++ {
		if ok[i] == false {
			continue
		}
		if ok[(i+nt)%ns] == false {
			continue
		}
		r = root(i, uni)
		rr = root((i+nt)%ns, uni)
		if rr == r {
			fmt.Println(-1)
			return
		}
		uni[rr] = r
	}

	counter := make([]int, ns)
	for i := 0; i < ns; i++ {
		r = root(i, uni)
		if ok[r] == false {
			continue
		}
		counter[r]++
	}
	for i := 0; i < ns; i++ {
		if ans < counter[i] {
			ans = counter[i]
		}
	}

	fmt.Println(ans)

	writer.Flush()
}

func root(i int, uni []int) int {
	if i == uni[i] {
		return i
	}

	uni[i] = root(uni[i], uni)
	return uni[i]
}

// MP ...
type MP struct {
	s     string
	table []int
}

func (mp *MP) init(s string) {
	mp.s = s
	n := len(s)
	table := make([]int, n+1)
	table[0] = -1
	j := -1
	for i := 0; i < n; i++ {
		for j >= 0 && s[i] != s[j] {
			j = table[j]
		}
		j++
		table[i+1] = j
	}
	mp.table = table
}
