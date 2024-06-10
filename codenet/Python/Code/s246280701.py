n = int(input())
x = list(map(int, input().split()))
ans = 10**10
for i in range(101):
    tmp = [abs(i - x[j])**2 for j in range(n)]
    if sum(tmp) < ans:
        ans = sum(tmp)

print(ans)
