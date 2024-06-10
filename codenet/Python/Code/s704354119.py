n = int(input())
l = input().split()
max = -1e9;min = 1e9;sum = 0
for i in range(n):
    sum+=int(l[i])
    if max<int(l[i]):
        max = int(l[i])
    if min>int(l[i]):
        min = int(l[i])
print(min,max,sum)

