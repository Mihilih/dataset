package main

import (
  "bufio"
  "os"
  "strconv"
  "fmt"
)

var reader = bufio.NewReaderSize(os.Stdin, 1000000)
var writer = bufio.NewWriter(os.Stdout)
func NextLine() string {
  var line, buffer []byte
  var isPrefix bool = true
  var err error
  for isPrefix {
    line, isPrefix, err = reader.ReadLine()
    if err != nil { panic(err) }
    buffer = append(buffer, line...)
  }
  return string(buffer)
}
func NextInt() int {
  var n int
  n, _ = strconv.Atoi(NextLine())
  return n
}
func Write(s interface{}) {
  fmt.Fprintln(writer, s)
}
func Output() {
  _ = writer.Flush()
}

func Bipartite(S *[]string) bool {
  N := len((*S))
  D := make([]int, N)
  D[0] = 1
  Q := make([]int, N)
  ret := true
  pos := 1
  for i := 0; i < N; i++ {
    if !ret { break }
    q := Q[i]
    for j, s := range (*S)[q] {
      if s == '0' {
        continue
      }
      if D[j] == 0 {
        D[j] = D[q] + 1
        Q[pos] = j
        pos++
        continue
      }
      if D[j] % 2 == D[q] % 2 {
        ret = false
        break
      }
    }
  }
  return ret
}

func WarshallFloyd(S *[]string) int {
  N := len(*(S))
  G := make([][]int, N)
  for i := range G {
    G[i] = make([]int, N)
    for j := range G[i] {
      if i == j { continue }
      if (*S)[i][j] == '0' {
        G[i][j] = N
      } else {
        G[i][j] = 1
      }
    }
  }
  for k := 0; k < N; k++ {
    for i := 0; i < N; i++ {
      for j := 0; j < N; j++ {
        if G[i][k] + G[k][j] < G[i][j] {
          G[i][j] = G[i][k] + G[k][j]
        }
      }
    }
  }
  ans := 0
  for i := 0; i < N; i++ {
    for j := 0; j < N; j++ {
      if ans < G[i][j] { ans = G[i][j] }
    }
  }
  return ans + 1
}

func main() {
  N := NextInt()
  S := make([]string, N)
  for i := range S {
    S[i] = NextLine()
  }
  if !Bipartite(&S) {
    Write(-1)
  } else {
    Write(WarshallFloyd(&S))
  }
  Output()
}