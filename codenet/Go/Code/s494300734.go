package main
 
import (
  "fmt"
  "strings"
)
 
func main() {
  var s string
  fmt.Scanf("%s", &s)
  
  ans := "No"
  if strings.Index(s, "C") < strings.LastIndex(s, "F") {
    ans = "Yes"
  }
  if strings.Index(s, "C") < 0 {
    ans = "No"
  }
  
  fmt.Printf("%s\n", ans)
}