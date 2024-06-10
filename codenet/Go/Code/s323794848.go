package main

import (
	"bufio"
	"fmt"
	"os"
)

type deque struct {
	front, back []byte
}

func (deq *deque) isEmptyFront() bool {
	return len(deq.front) == 0
}
func (deq *deque) isEmptyBack() bool {
	return len(deq.back) == 0
}

func (deq *deque) pushBack(v byte) {
	deq.back = append(deq.back, v)
}
func (deq *deque) pushFront(v byte) {
	deq.front = append(deq.front, v)
}
func (deq *deque) popBack(v *byte) bool {
	r := true
	if !deq.isEmptyBack() {
		*v = deq.back[len(deq.back)-1]
		deq.back = deq.back[:len(deq.back)-1]
	} else if !deq.isEmptyFront() {
		*v = deq.front[0]
		deq.front = deq.front[1:]
	} else {
		r = false
	}
	return r
}
func (deq *deque) popFront(v *byte) bool {
	r := true
	if !deq.isEmptyFront() {
		*v = deq.front[len(deq.front)-1]
		deq.front = deq.front[:len(deq.front)-1]
	} else if !deq.isEmptyBack() {
		*v = deq.back[0]
		deq.back = deq.back[1:]
	} else {
		r = false
	}
	return r
}

func (deq *deque) get(idx int) byte {
	tot := len(deq.front) + len(deq.back)
	var v byte
	if idx < tot {
		if idx < len(deq.front) {
			v = deq.front[len(deq.front)-1-idx]
		} else {
			v = deq.back[idx-len(deq.front)]
		}
	}
	return v
}

type op struct {
	rev, front bool
	c          byte
}

func rev(s string) string {
	r := make([]byte, len(s))
	i, j := len(s)-1, 0
	for i >= 0 {
		r[j] = s[i]
		j++
		i--
	}
	return string(r)
}

func main() {
	var S string
	fmt.Scan(&S)
	var Q int
	fmt.Scan(&Q)
	ops := make([]op, Q)
	for i := 0; i < Q; i++ {
		var q int
		fmt.Scan(&q)
		if q == 1 {
			ops[i].rev = true
		} else {
			var f int
			fmt.Scanf("%d %c", &f, &ops[i].c)
			if f == 1 {
				ops[i].front = true
			}
		}
	}
	sum := make([]int, Q+1)
	for i := Q - 1; i >= 1; i-- {
		if ops[i].rev {
			sum[i-1] = sum[i] + 1
		} else {
			sum[i-1] = sum[i]
		}
	}
	// fmt.Println("S", S, "Q", Q, "ops", ops, "sum", sum)
	if sum[0]%2 == 1 {
		S = rev(S)
	}
	var deq deque
	for i := 0; i < Q; i++ {
		if !ops[i].rev { // 反転ではない(文字列追加)
			if ops[i].front {
				if sum[i]%2 == 1 {
					deq.pushBack(ops[i].c)
				} else {
					deq.pushFront(ops[i].c)
				}
			} else {
				if sum[i]%2 == 1 {
					deq.pushFront(ops[i].c)
				} else {
					deq.pushBack(ops[i].c)
				}
			}
		}
	}
	wtr := bufio.NewWriter(os.Stdout)
	// fmt.Printf("%q %q %q\n", string(deq.front), S, string(deq.back))
	for i := len(deq.front) - 1; i >= 0; i-- {
		fmt.Fprint(wtr, string(deq.front[i]))
	}
	for i := 0; i < len(S); i++ {
		fmt.Fprint(wtr, string(S[i]))
	}
	for i := 0; i < len(deq.back); i++ {
		fmt.Fprint(wtr, string(deq.back[i]))
	}
	fmt.Fprintln(wtr)
	wtr.Flush()
}
