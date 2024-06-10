package main
import(
    "fmt"
    "sort"
)
func main(){
    // Your code here!
    var n int
    fmt.Scan(&n)
    var ws works = make([]work, n)
    for i := 0; i < n; i++{
        var a, n int
        fmt.Scan(&a, &n)
        ws[i] = work{a,n}
    }
    sort.Sort(ws)

    sum := int64(0)
    for _, w := range ws {
        sum += int64(w.time)
        if sum > int64(w.limit){
            fmt.Println("No")
            return
        }
    }
    fmt.Println("Yes")
}

type work struct{ time, limit int }
type works []work
 
func (w works) Len() int           { return len(w) }
func (w works) Swap(i, j int)      { w[i], w[j] = w[j], w[i] }
func (w works) Less(i, j int) bool { return w[i].limit < w[j].limit }
