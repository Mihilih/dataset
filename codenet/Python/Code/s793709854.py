N,T = map(int, input().split())
L = [[int(l) for l in input().split()] for _ in range(N)]

dp = [[0]*T for _ in range(N+1)]

for i in range(N):
    for j in range(T):
        if j < L[i][0]:
            dp[i+1][j] = dp[i][j]
        else:
            dp[i+1][j] = max(dp[i][j], dp[i][j-L[i][0]]+L[i][1])
            
used = []
B = dp[N][T-1]
j = T-1
for i in range(N-1, -1, -1):
    if B == dp[i][j]:
        continue
    B -= L[i][1]
    used.append(i)
    j -= L[i][0]
        
ans = dp[N][T-1]
c = 0
for i in range(N):
    if i in used:
        continue
    c = max(c, L[i][1])
    
print(ans+c)