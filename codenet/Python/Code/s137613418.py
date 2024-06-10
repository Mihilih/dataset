import sys
import math

from collections import defaultdict
from collections import deque
def load(vtype=int):
    return vtype(input().strip())
def load_list(seplator=" ", vtype=int):
    return [vtype(v) for v in input().strip().split(seplator)]
def exit():
    import sys
    sys.exit(0)
def perm_sub(li, used):
    if len(li) == len(used):
        return [deque()]
    k = []
    for i in range(len(li)):
        if i in used:
            continue
        used.add(i)
        sub_list = perm_sub(li, used)
        for sub in sub_list:
            sub.appendleft(li[i])
        k.extend(sub_list)
        used.discard(i)
    return k
def perm_li(li):
    return perm_sub(li, set())
def perm_n(n):
    return perm_sub(list(range(n)), set())
def join_i(li, sep=""):
    return sep.join([str(e) for e in li])
def li2n(li):
    n, base = 0, 1
    for i in range(len(li)-1, -1, -1):
        n += li[i] * base
        base *= 10
    return n
def sli2ili(li):
    return [int(s) for s in li] 
def prime_list(n):
    li = [i for i in range(2, n+1)]
    for i in range(len(li)):
        if li[i] >= int(math.sqrt(n)):
            break
        if li[i] == -1:
            continue
        for j in range(i+1, len(li)):
            if li[j] % li[i] == 0:
                li[j] = -1
    return [n for n in li if n != -1]
def gcd(a, b):
    a, b = max(a, b), min(a, b)
    while True:
        r = a % b
        if r == 0: return b
        a, b = b, r
def lcm(a, b):
    return int(a * b / gcd(a,b))
def all_subset(li):
    s = []
    n = len(li)
    for bit in range(0, (1<<(n+1))):
        ss = set()
        for i in range(0, n):
            if (bit & (1 << i)):
                ss.add(li[i])
        s.append(ss)
    return s
def factorial(n):
    if n == 1:
        return 1
    return n * factorial(n-1)
def mCn(m, n):
    def factorial_ntimes(m, n):
        r = 1
        while n:
            r *= m
            m -= 1
            n -= 1
        return r
    return int(factorial_ntimes(m, n) / factorial(n))

n = load()
A = load_list()

if n == len(set(A)):
    print('YES')
else:
    print('NO')