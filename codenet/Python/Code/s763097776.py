n = int(input())
p = [int(x) for x in input().split()]
p_copy = p[:]

p.sort()

count = 0
for i in range(n):
    if p[i] != p_copy[i]:
        count += 1

if count == 0 or count == 2:
    print("YES")
else:
    print("NO")