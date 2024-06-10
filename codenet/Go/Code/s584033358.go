package main

import "fmt"

func main() {
	var n, k int
	fmt.Scanf("%d %d\n", &n, &k)

	if k <= (n+n%2)/2 {
		fmt.Println("YES")
	} else {
		fmt.Println("NO")
	}
}
