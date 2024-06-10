n = int(input())
F = [tuple(map(int, input().split())) for _ in range(n)]
P = [tuple(map(int, input().split())) for _ in range(n)]
ans = -10 ** 18

for i in range(1,2**10):
  tmp = 0
  lst = [0]*n
  for j in range(10): #時間帯
        if (i >> j) & 1: #開けるとした時
            for k in range(n):
                lst[k] += F[k][j]
  for k in range(n):
      tmp += P[k][lst[k]]
  ans = max(ans, tmp)
 
 
print (ans)