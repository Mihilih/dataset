package main

import "fmt"

func main() {
	var a [3]int

	fmt.Scan(&a[0], &a[1], &a[2])

	five := 0
	seven := 0

	for i := 0; i < 3; i++ {
		if a[i] == 5 {
			five++
		}
		if a[i] == 7 {
			seven++
		}

	}

	if five == 2 && seven == 1 {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}

}
