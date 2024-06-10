N = int(input())
S = input()

ans = 1
tmp = S[0]
for s in S:
    if s != tmp:
        ans += 1
        tmp = s

print(ans)
