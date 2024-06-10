package main

import (
	"bufio"
	"fmt"
	"os"
	"strconv"
	"strings"
)

type node struct {
	key int
	parent *node
	left *node
	right *node
}

type tree struct {
	root *node
}

func (tree *tree) insert(key int) {
	if tree.root == nil {
		tree.root = &node{key: key}
		return
	}

	var currentNode, prevNode *node
	currentNode = tree.root
	for currentNode != nil {
		prevNode = currentNode
		if currentNode.key < key {
			currentNode = currentNode.right
		} else {
			currentNode = currentNode.left
		}
	}

	newNode := &node{key: key}
	newNode.parent = prevNode
	if prevNode.key < key {
		prevNode.right = newNode
	} else {
		prevNode.left = newNode
	}
}

func (tree tree) print() {
	var acc []int
	if tree.root == nil {
		fmt.Println("")
		fmt.Println("")
	} else {
		fmt.Println(" " + strings.Join(isToAs(visitInorder(tree.root, acc)), " "))
		fmt.Println(" " + strings.Join(isToAs(visitPreorder(tree.root, acc)), " "))
	}
}

func visitPreorder(node *node, acc []int) []int {
	if node == nil {
		return acc
	}
	acc = append(acc, int(node.key))
	if node.left != nil {
		acc = visitPreorder(node.left, acc)
	}
	if node.right != nil {
		acc = visitPreorder(node.right, acc)
	}
	return acc
}

func visitInorder(node *node, acc []int) []int {
	if node == nil {
		return acc
	}
	if node.left != nil {
		acc = visitInorder(node.left, acc)
	}
	acc = append(acc, int(node.key))
	if node.right != nil {
		acc = visitInorder(node.right, acc)
	}
	return acc
}

func main() {
	sc := bufio.NewScanner(os.Stdin)
	sc.Split(bufio.ScanWords)

	n, err := nextInt(sc)
	if err != nil {
		panic(err)
	}

	tree := &tree{}
	for i := 0; i < n; i++ {
		command := nextText(sc)
		switch command {
		case "insert":
			key, err := nextInt(sc)
			if err != nil {
				panic(err)
			}
			tree.insert(key)
		case "print":
			tree.print()
		default:
			panic("unknown command: " + command)
		}
	}
}

func nextText(sc *bufio.Scanner) string {
	sc.Scan()
	return sc.Text()
}

func nextInt(sc *bufio.Scanner) (int, error) {
	return strconv.Atoi(nextText(sc))
}

func isToAs(is []int) []string {
	n := len(is)
	as := make([]string, n)
	for i := 0; i < n; i++ {
		as[i] = strconv.Itoa(is[i])
	}
	return as
}
