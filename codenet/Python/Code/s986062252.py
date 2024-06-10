from sys import stdin
il = lambda func=int: list(map(func, stdin.readline().rstrip().split()))
ils = lambda n, s="int(input())": [eval(s) for _ in range(n)]
def gcd(a, b):
    if a < b: return gcd(b, a)
    if b == 0: return a
    return gcd(b, a%b)
def lcm(a, b):
    return a * b // gcd(a, b)

n, m = il()
s = input()
t = input()
aa = gcd(n, m)
bb = lcm(n, m)
cc = aa // bb
for i in range(aa):
    if s[n//aa*i] != t[m//aa*i]:
        print(-1)
        exit()
print(bb)
