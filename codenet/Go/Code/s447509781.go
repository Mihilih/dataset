package main

import (
  "bufio"
  "fmt"
  "os"
  "strconv"
  "strings"
)

func main() {
  input := Input{bufio.NewReaderSize(os.Stdin,1000000)}
  n := input.NextInt()
  s := input.NextIntArray()
  u := make([]bool,n)
  var m,f int64
  for c:=1;c<n-1;c++ {
    f = 0
    for k:=0;c<n-1-k*c;k++ {
      u[k*c] = true
      if u[n-1-k*c] { break }
      f += s[n-1-k*c]+s[k*c]
      if m < f { m = f }
    }
    for k:=0;k*c<n-1;k++ { u[k*c] = false }
  }
  fmt.Println(m)
}

type Input struct {
  reader *bufio.Reader
}
func(i *Input) NextLine() string {
  var buffer []byte
  for {
    line,isPrefix,err := i.reader.ReadLine()
    if err != nil { panic(err) }
    buffer = append(buffer,line...)
    if !isPrefix { break }
  }
  return string(buffer)
}
func(i *Input) NextInt() int {
  n,_ := strconv.Atoi(i.NextLine())
  return n
}
func(i *Input) NextIntArray() []int64 {
  s := strings.Split(i.NextLine()," ")
  a := make([]int64,len(s))
  for i:=0;i<len(s);i++ { a[i],_ = strconv.ParseInt(s[i],10,64) }
  return a
}