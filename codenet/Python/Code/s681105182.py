import sys
sys.setrecursionlimit(10**7)
def LI(): return [int(x) for x in sys.stdin.readline().split()]
def LI_(): return [int(x) - 1 for x in sys.stdin.readline().split()]
def LF(): return [float(x) for x in sys.stdin.readline().split()]
def LS(): return sys.stdin.readline().split()
def II(): return int(sys.stdin.readline())
def SI(): return sys.stdin.readline().strip()
INF = 10 ** 18
MOD = 10 ** 9 + 7

def main(): 
    N = II()
    a_li = LI()

    a_li.sort()

    n = a_li[-1]
    
    dif = INF
    prev_dif = dif
    for a in a_li[:-1]:
        dif = min(abs(n/2 - a), dif)
        if dif != prev_dif:
            r = a
            prev_dif = dif

    print(n, r)


main()