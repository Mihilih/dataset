import math
N,K = (int(x) for x in input().split())
R = N - K
mod = 10**9 + 7

def fact(n, r):
    return math.factorial(n) // (math.factorial(n - r) * math.factorial(r))

for i in range(1,K+1):
  if N - K + 1 < i:
    ans = 0
  else:
    ans = fact(R+1, i)*fact(K-1,i-1)
  print(int(ans)%mod)

  
