package main

import (
	"bufio"
	"bytes"
	"fmt"
	"io"
	"os"

	"sort"
	"strconv"
	"strings"
)

//  長い入力を読む
func ReadLongLines(times int) ([]string, error) {
	result := make([]string, times)
	reader := bufio.NewReader(os.Stdin)
	buffer := bytes.NewBuffer(make([]byte, 0))
	readBytes := int64(2)
	for i := 0; i < times; i++ {
		for {
			readBuf, isPrefix, err := reader.ReadLine()
			// fmt.Printf("Reader.Read: %d\n", len(readBuf))
			readBytes += int64(len(readBuf) + 1)
			if err != nil {
				if err == io.EOF {
					fmt.Println("EOF")
					break
				} else {
					return result, err
				}
			}
			_, err = buffer.Write(readBuf)
			if err != nil {
				return result, err
			}
			// end of line
			if !isPrefix {
				result[i] = buffer.String()
				buffer.Reset()
				// reader = bufio.NewReader(os.Stdin)
				break
			}
		}
	}
	// 先読みしてしまうようなので、戻しておく
	os.Stdin.Seek(-int64(reader.Buffered()), os.SEEK_CUR)
	return result, nil
}

// 出力 for 競プロ
type Console struct {
	writer *bufio.Writer
}

func NewConsole() Console {
	return Console{bufio.NewWriter(os.Stdout)}
}
func (this *Console) Printf(format string, a ...interface{}) {
	fmt.Fprintf(this.writer, format, a...)
}
func (this *Console) Println(s string) {
	fmt.Fprintln(this.writer, s)
}
func (this *Console) Close() {
	this.Flush()
}
func (this Console) Flush() {
	this.writer.Flush()
}

func PrintList(list []int) {
	con := NewConsole()
	defer con.Flush()
	for i := range list {
		if i == 0 {
			con.Printf("%d", list[i])
		} else {
			con.Printf(" %d", list[i])
		}
	}
	con.Println("")
}

func main() {
	con := NewConsole()
	defer con.Flush()

	m := make(map[int]struct{})
	lines, _ := ReadLongLines(4)
	a := strings.Split(lines[1], " ")
	for i := range a {
		n, _ := strconv.Atoi(a[i])
		m[n] = struct{}{}
	}

	result := make([]int, 0, 200000)
	b := strings.Split(lines[3], " ")
	for i := range b {
		n, _ := strconv.Atoi(b[i])
		if _, ok := m[n]; ok {
			delete(m, n)
		} else {
			m[n] = struct{}{}
		}
	}
	for k, _ := range m {
		result = append(result, k)
	}
	sort.Slice(result, func(lhs, rhs int) bool {
		return result[lhs] < result[rhs]
	})
	for j := range result {
		con.Printf("%d\n", result[j])
	}
}

