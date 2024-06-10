package main

import (
	"fmt"
)
func main() {
	var N,M int
	fmt.Scan(&N,&M)
	Inf := 1 << 62
	//　+-ある数は先頭が変わるので - 1,でシフトする前の段階で1ビット使ってるので -1より 62が最大
	// vertex := make([]int,N)
	a := make([]int,M)
	b := make([]int,M)
	c := make([]int,M)
	for i:= 0; i<M; i++ {
		fmt.Scan(&a[i],&b[i],&c[i])
		c[i] = -c[i]
	}
	// fmt.Println(Inf)
	dist := make([]int,N) //ここにコストをいれる　その地点にいくまでのこすとを考える
	for i:= 0; i<N; i++ {
		dist[i] = Inf//考えうる最大値を考える
	}
	dist[0] = 0 //最初は0にいるので
	for loop := 0; loop < N; loop++ {
		for i:= 0; i<M; i++ {
			if dist[a[i]-1] == Inf {
				continue
			}
			if (dist[b[i]-1] > dist[a[i]-1] + c[i]) {
				//dist[b[i]-1]の行くまでがdist[a[i]-1] + cos　よりもかかるなら最小のほうにする
				dist[b[i]-1] = dist[a[i]-1] + c[i]
			}
		}
	}
	ans := dist[N-1] //最小値が存在する場合はansが答え
	navigate := make([]bool,N)
	for loop := 0; loop < N; loop++ {
		for i:= 0; i<M; i++ {
			if dist[a[i]-1] == Inf {
				continue
			}
			if dist[b[i]-1] > dist[a[i]-1] + c[i] {
				dist[b[i]-1] = dist[a[i]-1] + c[i]
				navigate[b[i]-1] = true
			}
			if navigate[a[i]-1] == true {
				navigate[b[i]-1] = true
			}
		}
	}

	if navigate[N-1]{
		fmt.Println("inf")
	} else {
		fmt.Println(-ans)
	}

}
