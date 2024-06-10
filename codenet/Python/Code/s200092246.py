N = int(input())
ans = []

for i in range(1,N+1):
    if sum(range(1, i + 1)) < N:
        continue
    else:
        ans = [i - 1,sum(range(1, i + 1)) - N]
        break
for i in range(ans[0]+1):
    if i + 1 != ans[1]:
        print(i + 1)
