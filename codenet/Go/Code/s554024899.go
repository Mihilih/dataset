package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strconv"
)

func main() {
	log.SetFlags(log.Lshortfile)
	sc := newScanner()
	x := sc.nextInt()
	y := sc.nextInt()
	var xt, yt int
	a := [3][]int{{1, 3, 5, 7, 8, 10, 12}, {4, 6, 9, 11}, {2}}
	for i, t := range a {
		for _, n := range t {
			// log.Println(n)
			if x == n {
				xt = i
			}
			if y == n {
				yt = i
			}
		}
	}
	if xt == yt {
		fmt.Println("Yes")
	} else {
		fmt.Println("No")
	}
}

func max(a, b int) int {
	if a > b {
		return a
	}
	return b
}

type scanner struct {
	r   *bufio.Reader
	buf []byte
	p   int
}

func newScanner() *scanner {
	rdr := bufio.NewReaderSize(os.Stdin, 1000)
	return &scanner{r: rdr}
}
func (s *scanner) next() string {
	s.pre()
	start := s.p
	for ; s.p < len(s.buf); s.p++ {
		if s.buf[s.p] == ' ' {
			break
		}
	}
	result := string(s.buf[start:s.p])
	s.p++
	return result
}
func (s *scanner) nextLine() string {
	s.pre()
	start := s.p
	s.p = len(s.buf)
	return string(s.buf[start:])
}
func (s *scanner) nextInt() int {
	v, _ := strconv.Atoi(s.next())
	return v
}

func (s *scanner) pre() {
	if s.p >= len(s.buf) {
		s.readLine()
		s.p = 0
	}
}
func (s *scanner) readLine() {
	s.buf = make([]byte, 0)
	for {
		l, p, e := s.r.ReadLine()
		if e != nil {
			panic(e)
		}
		s.buf = append(s.buf, l...)
		if !p {
			break
		}
	}
}
