#include <cassert>
// #include <algorithm>
#include <iostream>
#include <vector>
#include <climits>

struct TSize
{
    int r;
    int c;
    TSize() : r(0), c(0) {}
    TSize(int Ar, int Ac)
     : r(Ar), c(Ac)
    {}
};

class TMcmSolver
{
    typedef std::vector<std::vector<int> > TMatrix;
    TMatrix FMemo;
    const std::vector<TSize>& FChain;

    static int Count(const TSize& Left, const TSize& Right)
    {
        return Left.r * Right.c * Left.c;
    }
    int Solve(int s, int l)
    {
        assert(s <= l);
        if(s == l) return 0;
        if(FMemo[s][l] != 0) return FMemo[s][l];
        if(s + 1 == l){
            FMemo[s][l] = Count(FChain[s], FChain[l]);
        }else{
            int min = INT_MAX;
            for(int i = s; i < l; ++i){
                int c = Solve(s, i) + Count(TSize(FChain[s].r, FChain[i].c), TSize(FChain[i+1].r, FChain[l].c)) + Solve(i+1, l);
                min = std::min(min, c);
            }
            FMemo[s][l] = min;
        }
        // std::cout << "Solve! [" << s << "], [" << l << "]" << std::endl; 
        return FMemo[s][l];
    }
public:
    TMcmSolver(const std::vector<TSize>& Chain)
     : FChain(Chain)
    {
        FMemo.resize(Chain.size());
        for(std::size_t i = 0; i < FMemo.size(); ++i){
            FMemo[i].resize(Chain.size(), 0);
        }
    }
    int Answer()
    {
        return Solve(0, FMemo.size()-1);
    }
    void Print()const
    {
        for(std::size_t s = 0; s < FMemo.size(); ++s){
            for(std::size_t l = 0; l < FMemo[0].size(); ++l){
                std::cout << FMemo[s][l] << '\t';
            }
            std::cout << '\n';
        }
    }
};

int main()
{
    int n;
    std::cin >> n;
    if(n == 1){
        std::cout << 0 << std::endl;
        return 0;
    }
    std::vector<TSize> Chain(n);
    for(int i = 0; i < n; ++i){
        std::cin >> Chain[i].r >> Chain[i].c;
    }
    TMcmSolver Solver(Chain);
    
    std::cout << Solver.Answer() << std::endl;
    // Solver.Print();
    return 0;
}