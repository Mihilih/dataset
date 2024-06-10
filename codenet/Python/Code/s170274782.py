N = int(input())
A = []
for _ in range(2):
    s = list(map(int, input().split()))
    A.append(s)


#0で降りるか、1で降りるか、2で降りるか....どこで降りたとしてもそれまでは全習得

ans = []

count = 0
for i in range(N):
    baselis = A[0]
    groundlis = A[1]
    count = 0
    count = count + sum(baselis[0:i+1]) + sum(groundlis[i:N+1])
    ans.append(count)

print(max(ans))    