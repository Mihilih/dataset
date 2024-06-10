package main

import (
	"fmt"
)

func main() {
	var N, K, R, S, P int
	var T string
	fmt.Scan(&N, &K, &R, &S, &P)
	fmt.Scan(&T)

	dict := map[string]int{"r": 0, "s": 0, "p": 0}
	char := ""
	s := make([]bool, N)
	for i := 0; i < N; i++ {
		s[i] = true
	}
	r := make([]bool, N)
	p := make([]bool, N)
	copy(r, s)
	copy(p, s)
	for i := 0; i < len(T); i++ {
		char = T[i : i+1]
		if i >= K {
			if char == T[i-K:i+1-K] {

				switch char {
				case "s":
					if s[i%K] {
						s[i%K] = false
						continue
					} else {
						s[i%K] = true
					}

				case "r":
					if r[i%K] {
						r[i%K] = false
						continue
					} else {
						r[i%K] = true

					}

				case "p":
					if p[i%K] {
						p[i%K] = false
						continue
					} else {
						p[i%K] = true

					}
				}
			} else {
				switch char {
				case "s":
					s[i%K] = true
				case "r":
					r[i%K] = true
				case "p":
					p[i%K] = true
				}

			}
		}
		switch char {
		case "s":
			dict["s"] = dict["s"] + 1
		case "r":
			dict["r"] = dict["r"] + 1
		case "p":
			dict["p"] = dict["p"] + 1
		}
	}

	res := P*dict["r"] + S*dict["p"] + R*dict["s"]
	fmt.Println(res)

}
