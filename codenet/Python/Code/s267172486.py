h, a = map(int, input().strip().split())

ans = h // a
ama = h % a

if ama != 0:
  ans += 1
print(ans)