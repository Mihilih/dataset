n, m, x = (int(i) for i in input().split())
a = [int(i) for i in input().split()]
ans = 0
from bisect import bisect
i = bisect(a,x)
print(min(len(a[:i]),len(a[i:])))