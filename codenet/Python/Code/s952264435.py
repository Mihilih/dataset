N, M = map(int, input().split())
A = map(int, input().split())
A_sum = sum(A)

print(N - A_sum if N - A_sum >= 0 else "-1")