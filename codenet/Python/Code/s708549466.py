N, x = map(int, input().split())
a = list(map(int, input().split()))
cnt = 0
for i in range(1, N):
    tmp = a[i - 1] + a[i]
    if tmp > x:
        if tmp - x > a[i]:
            a[i - 1] = tmp - a[i] - x
            a[i] = 0
        else:
            a[i] = a[i] - (tmp - x)
        cnt += tmp - x

print(cnt)