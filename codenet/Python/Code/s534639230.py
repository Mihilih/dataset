from collections import Counter

def solve():
    N = int(input())
    D = list(map(int, input().split()))

    mod = 998244353

    if D[0] != 0:
        print(0)
        return

    cnt = Counter(D)

    if cnt[0] > 1:
        print(0)
        return

    res = 1

    for i in range(1, max(D)+1):
        if cnt[i-1] == 1:
            continue
        res *= cnt[i-1]**cnt[i] %mod
        res %= mod
    
    print(res)

solve()