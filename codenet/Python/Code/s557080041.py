N = input()
if N == 0:
  print('Yes')
else:
  N = str(N)
  L = list(N)
  L = [int(s) for s in L]
  X = sum(L)
  if X % 9 == 0:
    print('Yes')
  else:
    print('No')