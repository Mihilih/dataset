package main

import (
	"bufio"
	"bytes"
	"fmt"
	"os"
	"strconv"
	"strings"
)

type node struct {
	key  int32
	prev *node
	next *node
}

func (n *node) rPrint(buf *bytes.Buffer) {
	buf.WriteString(fmt.Sprint(n.key))
	if n.next != nil {
		buf.WriteString(" ")
		n.next.rPrint(buf)
	}
	return
}

func (n *node) Delete(first, last *node) (*node, *node) {
	if n.prev != nil && n.next != nil {
		//swap
		n.prev.next = n.next
		n.next.prev = n.prev
		return first, last
	}

	if n.next == nil && n.prev == nil {
		return nil, nil
	}

	if n.prev == nil {
		first = n.next
		n.next.prev = nil
	}

	if n.next == nil {
		last = n.prev
		n.prev.next = nil
	}

	return first, last
}

func initNode(key int32) *node {
	return &node{
		key: key,
	}
}

func main() {
	stdin := bufio.NewScanner(os.Stdin)
	var first, last *node
	stdin.Scan()

	for stdin.Scan() {
		cmd := stdin.Text()
		switch cmd {
		case "deleteFirst":
			first, last = first.Delete(first, last)
		case "deleteLast":
			first, last = last.Delete(first, last)
		default:
			xcmd := strings.Split(cmd, " ")
			k, _ := strconv.Atoi(xcmd[1])
			k32 := int32(k)
			switch xcmd[0] {
			case "delete":
				for a := first; a != nil; a = a.next {
					if a.key == k32 {
						first, last = a.Delete(first, last)
						break
					}
				}
			case "insert":
				n := initNode(k32)
				n.next = first
				if first != nil {
					first.prev = n
				}

				first = n
				if last == nil {
					last = n
				}
			}
		}
	}
	var buf bytes.Buffer
	first.rPrint(&buf)
	fmt.Println(buf.String())
}

