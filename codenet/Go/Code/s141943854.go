package main

import (
	"bufio"
	"fmt"
	"log"
	"os"
	"strconv"
)

func check(e error) {
	if e != nil {
		log.Fatalf("error: %v", e)
	}
}

func main() {
	stdin := bufio.NewScanner(os.Stdin)
	stdin.Scan()
	sage := stdin.Text()

	switch sage {
	case "1":
		fmt.Println("Hello World")
	case "2":
		var sum int
		for i := 0; i < 2; i++ {
			stdin.Scan()
			num, err := strconv.Atoi(stdin.Text())
			check(err)
			sum += num
		}
		fmt.Println(sum)
	}
}