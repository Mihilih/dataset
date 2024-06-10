N = int(input())
A = [int(x) for x in input().split()]
B = [int(x) for x in input().split()]
 
ans = 0
for i in range(N):
    d = min(A[i], B[i])
    ans += d
    A[i] -= d
    B[i] -= d
    d = min(A[i + 1], B[i])
    ans += d
    A[i + 1] -= d
    B[i] -= d
    
print(ans)
