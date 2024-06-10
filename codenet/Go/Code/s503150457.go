package main

import (
	"fmt"
	"strings"
)

func main() {
	var s1,s2,s3 string
	fmt.Scan(&s1,&s2,&s3)

	s1s := strings.Split(s1,"")
	s2s := strings.Split(s2,"")
	s3s := strings.Split(s3,"")

	fmt.Println(strings.ToUpper(s1s[0])+strings.ToUpper(s2s[0])+strings.ToUpper(s3s[0]))
}
