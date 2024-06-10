n = int(input())
a = []
for i in range(2):
    a.append(list(map(int, input().split())))
a[1] = a[1][::-1]
import numpy
res_0 = numpy.cumsum(a[0])
res_1 = numpy.cumsum(a[1])
ans = 0
for i in range(n):
    check = res_0[i] + res_1[n-1-i]
    ans = max(ans,check)
print(ans)