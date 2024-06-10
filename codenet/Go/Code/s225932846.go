package main

import "fmt"

func main() {
	var S string
	fmt.Scan(&S)
	for i := 2; i <= len(S); i = i + 2 {
		if S[0:(len(S)-i)/2] == S[(len(S)-i)/2:len(S)-i] {
			fmt.Println((len(S) - i))
			break
		}
	}
}
