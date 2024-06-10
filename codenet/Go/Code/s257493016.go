package main

import (
  "fmt"
)

func min(n ...int) int {
  if len(n) == 0 {
    panic("len == 0")
  }
  r := n[0]
  for i := 1; i < len(n); i++ {
    if n[i] <= r {
      r = n[i]
    }
  }
  return r
}

func main() {
  var H, N, A, B int
  fmt.Scan(&H, &N)
  dp := make([]int, H+10001)
  for l := 1; l < H+10001; l++ {
    dp[l] = 2100000000
  }
  amax := 0
  for i := 0; i < N; i++ {
    fmt.Scan(&A, &B)
    if A >= amax {
      amax = A
    }
    dp[A] = min(dp[A], B)
    for j := A+1; j <= H+A+1; j++ {
      dp[j] = min(dp[j], dp[j-A] + B)
    }
  }
  fmt.Println(min(dp[H:H+amax+1]...))
}

