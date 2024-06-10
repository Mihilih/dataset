package main

import (
  "bufio"
  "fmt"
  "os"
  "strconv"
  "strings"
)

const size = 1000000
var reader = bufio.NewReaderSize(os.Stdin,size)
func NextLine() string {
  var line,buffer []byte
  var isPrefix bool = true
  var err error
  for ;isPrefix; {
    line,isPrefix,err = reader.ReadLine()
    if err != nil { panic(err) }
    buffer = append(buffer,line...)
  }
  return string(buffer)
}
func NextInts() (int,int) {
  var x,y int
  var s []string = strings.Split(NextLine()," ")
  x,_ = strconv.Atoi(s[0])
  y,_ = strconv.Atoi(s[1])
  return x,y
}
func NextIntArray() []int {
  var s []string = strings.Split(NextLine()," ")
  var a []int = make([]int,len(s))
  for i:=0;i<len(s);i++ {
    a[i],_ = strconv.Atoi(s[i])
    a[i]--
  }
  return a
}

var par,rank []int
func main() {
  var n,m int = NextInts()
  var p []int = NextIntArray()
  var x,y int
  initialize(n)
  for i:=0;i<m;i++ {
    x,y = NextInts()
    unite(x-1,y-1)
  }
  var s int
  for i:=0;i<n;i++ {
    if same(i,p[i]) { s++ }
  }
  fmt.Println(s)
}
func initialize(n int) {
  par = make([]int,n)
  rank = make([]int,n)
  for i:=0;i<n;i++ {
    par[i] = i
  }
}
func root(i int) int {
  if par[i] == i { return i }
  par[i] = root(par[i])
  return par[i]
}
func same(i,j int) bool {
  return root(i) == root(j)
}
func unite(i,j int) {
  i = root(i)
  j = root(j)
  if i == j { return }
  if rank[i] < rank[j] {
    par[i] = j
  } else {
    par[j] = i
    if rank[i] == rank[j] { rank[i]++ }
  }
}