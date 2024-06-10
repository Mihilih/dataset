A, B = map(int, input().split())

min = B * 10
max = (B+1) * 10 -1

ans = -1
for i in range(min, max+1):
  if int(i * 0.08) == A:
    ans = i
    break

print(ans)