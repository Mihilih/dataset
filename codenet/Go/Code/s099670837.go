package main

import "fmt"

var n, ans int

const arraySize = 101

var a = [arraySize][arraySize]int{}

func findAns(i, j, sum int) {
	if i == 1 && j == n-1 && sum+a[i][j] > ans {
		ans = sum + a[i][j]
		return
	}
	if i == 0 {
		findAns(i+1, j, sum+a[i][j])
	}
	if j+1 < n {
		findAns(i, j+1, sum+a[i][j])
	}
}
func main() {

	fmt.Scanf("%d", &n)

	for i := 0; i < 2; i++ {
		for j := 0; j < n; j++ {
			fmt.Scanf("%d", &a[i][j])
		}
	}
	findAns(0, 0, 0)
	fmt.Println(ans)
}
