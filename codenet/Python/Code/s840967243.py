import math
MOD = 10**9+7
f = math.factorial
n, m = sorted(map(int, input().split()))
print(max(2 - m + n, 0)*f(n)*f(m) % MOD)