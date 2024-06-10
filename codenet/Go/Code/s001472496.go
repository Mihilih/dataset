package main

import (
	"fmt"
)

func main() {
	var s string
	fmt.Scan(&s)

	max_tmp := 0
	max := 0
	for i := 0; i < len(s); i++ {
		flag := false
		switch string(s[i]) {
		case "A", "C", "T", "G":
			max_tmp++
		default:
			flag = true
		}

		if i == len(s)-1 {
			flag = true
		}
		if flag == true {
			if max < max_tmp {
				max = max_tmp
			}
			max_tmp = 0
		}
	}
	fmt.Println(max)
}