n, m = map(int, input().split())
a = list(map(int, input().split()))
a.sort(reverse=True)
s = sum(a)/(4*m)
if a[m-1]>=s:
    print('Yes')
else:
    print('No')