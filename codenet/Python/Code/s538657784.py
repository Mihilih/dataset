import math
N = int(input())
sqN = int(math.sqrt(N))
for i in range(sqN):
  if N % (sqN-i) == 0:
    print(int(N/(sqN-i)+sqN-i)-2)
    break