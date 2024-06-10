N, K = map(int, input().split())
A = []

for i in range(N):
    A.append(0)

for i in range(K):
    d = int(input())
    AA = list(map(int, input().split()))
    for j in range(d):
        A[AA[j] - 1] = 1

n = 0
for i in range(N):
    if A[i] == 0:
        n += 1
print(n)