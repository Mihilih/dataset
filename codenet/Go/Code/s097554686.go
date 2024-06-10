package main

import "fmt"

const size = 100001

func main() {
    var n, t int
    var l, r int
    var mem [size]int
    fmt.Scan(&n)
    fmt.Scan(&t)
    for i := 0; i < n; i++ {
        fmt.Scan(&l)
        fmt.Scan(&r)
        mem[l] += 1
        mem[r] -= 1
    }
    ans := mem[0]
    for i := 1; i < t + 1; i++ {
        mem[i] += mem[i - 1]
        if ans < mem[i] {
            ans = mem[i]
        }
    }
    fmt.Println(ans)
}

