N, K = [int(_) for _ in input().split()]
S = set()
for i in range(K):
    d = int(input())
    A = [int(_) for _ in input().split()]
    S = S | set(A)
print(N - len(S))
