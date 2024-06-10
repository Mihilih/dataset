package main

import (
    "fmt"
)

func main() {
    var data int
    fmt.Scan(&data)
    var result = data * data * data
    fmt.Printf("%d\n", result)
}
