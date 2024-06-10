s = input()
t = input()

def check(a,b):
    s = 0
    for i,j in zip(a,b):
        s += i!=j
    return s
ans = 10**6
for i in range(len(s)):
    a = s[i:]
    if len(a) >= len(t):
        ans = min(ans,check(t,a[:len(t)]))
print(ans)