n = int(input())
a = list(map(int,input().split()))
below = 0
for i in range(n):
    below += 1/a[i]
print(1/below)
