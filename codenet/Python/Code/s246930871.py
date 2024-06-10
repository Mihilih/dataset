N, A, B = map(int, input().split())
ans = A * (N//(A+B)) + min(A, N%(A+B))
print(ans)
