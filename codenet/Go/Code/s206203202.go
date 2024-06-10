package main

import "fmt"

func Abs(x int) int {
	if x < 0 {
		return -x
	}
	return x
}
func min(a,b int)int{
	if(a>b){
		return b
	}
	return a
}

func main(){
	var N,K int;
	fmt.Scan(&N,&K);
// 	hm := make(map[int]bool)
// 	for{
// 		if(!hm[N]){
// 			hm[N]=true;
// 			N = Abs(N-K)
// 		}else{
// 			break;
// 		}
// 	}
// 	var mini int;
// 	mini=999999999
// 	for k:= range hm{
// 		mini=min(mini,k)
// 	}
// 	fmt.Println(mini)
// }
	var x int;
	x=N%K;
	x=min(Abs(x-K),x);
	fmt.Println(x)
}