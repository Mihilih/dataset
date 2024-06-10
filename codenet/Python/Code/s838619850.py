S = input()
T = input()

N = len(S)
M = len(T)
ans = M
for i in range(N-M+1):
    S_2 = S[i:i+M]
    cnt = 0
    for j in range(M):
        if T[j] != S_2[j]:
            cnt += 1
    ans = min(ans, cnt)

print(ans)
