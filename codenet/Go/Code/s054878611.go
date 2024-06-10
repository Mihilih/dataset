package main

import (
        "fmt"
)

func solution(n int, a []int) int {
        var memo [1e5 + 2]int
        for _, num := range a {
                memo[num]++
                memo[num+1]++
                memo[num+2]++
        }
        out := 0
        for _, num := range memo {
                if num > 0 {
                        out = max(out, num)
                }
        }
        return out
}

func max(x, y int) int {
        if x > y {
                return x
        }
        return y
}

func main() {
        var n int
        fmt.Scan(&n)
        a := make([]int, n)
        for i := range a {
                fmt.Scan(&a[i])
        }
        fmt.Println(solution(n, a))
}