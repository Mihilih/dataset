A, B, C = map(int, input().split())
if B < C:
  print(0)
elif A * C < B:
  print(C)
else:
  print(B//A)