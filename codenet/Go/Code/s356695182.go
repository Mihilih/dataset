package main

import (
	"bufio"
	"fmt"
	"math"
	"os"
	"strconv"
)

var sc = bufio.NewScanner(os.Stdin)

func nextInt() int {
	sc.Scan()
	t, err := strconv.Atoi(sc.Text())
	if err != nil {
		panic(err)
	}
	return t
}

func scanNums(len int) (nums []int) {
	var num int
	for i := 0; i < len; i++ {
		fmt.Scan(&num)
		nums = append(nums, num)
	}
	return
}

func pattern1(l []int) int {
	n := (l[0]*l[3])+(l[1]*l[4])
	return n
}
func pattern2(l []int) int {
	n :=2*l[2]*max(l[3],l[4])
	return n
}
func pattern3(l []int) int {
	n := 2*l[2]*min(l[3],l[4])+(doch(l))
	return n
}


func min(nums ...int) int {
	if len(nums) == 0 {
		panic("funciton min() requires at least one argument.")
	}
	res := nums[0]
	for i := 0; i < len(nums); i++ {
		res = int(math.Min(float64(res), float64(nums[i])))
	}
	return res
}

func max(nums ...int) int {
	if len(nums) == 0 {
		panic("funciton max() requires at least one argument.")
	}
	res := nums[0]
	for i := 0; i < len(nums); i++ {
		res = int(math.Max(float64(res), float64(nums[i])))
	}
	return res
}

func doch(l[] int) int {
	if l[3]>l[4] {
		return l[0] * (l[3]-l[4])
	}else{
		return l[1] * (l[4]-l[3])
	}
}


func main() {
	len := 5
	l := scanNums(len)
	fmt.Println(min(pattern1(l),pattern2(l), pattern3(l)))

}