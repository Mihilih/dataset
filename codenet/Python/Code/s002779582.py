N = int(input())
Hs = list(map(int, input().split()))

ans = 0
maxH = 0
for H in Hs:
    if maxH <= H:
        ans += 1
        maxH = H

print(ans)
