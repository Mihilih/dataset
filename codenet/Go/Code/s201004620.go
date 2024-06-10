package main 
import "fmt"

func main(){
  var S string
  fmt.Scan(&S)
  switch S {
  case "Sunny" : fmt.Println("Cloudy")
  case "Cloudy" : fmt.Println("Rainy")
  case "Rainy" : fmt.Println("Sunny")
       
  }
}


