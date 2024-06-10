package main

import "fmt"

func main() {
  for i:=0;i<5;i++{
    var a int
    fmt.Scan(&a)
    if a == 0 {
      fmt.Println(i+1)
    }
  }
}