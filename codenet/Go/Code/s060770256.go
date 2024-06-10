package main

import (
        "fmt"
)

func solution(n, m int) int {
        n = n - 2
        m = m - 2
        if n < 0 {
                n = 1
        }
        if m < 0 {
                m = 1
        }
        return n * m
}

func main() {
        var n, m int
        fmt.Scan(&n, &m)
        fmt.Println(solution(n, m))
}