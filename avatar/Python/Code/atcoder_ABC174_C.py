from sys import stdin , stdout , setrecursionlimit
from math import gcd , ceil , sqrt
from collections import Counter
from bisect import bisect_left , bisect_right
ii1 = lambda : int ( stdin.readline ( ).strip ( ) )
is1 = lambda : stdin.readline ( ).strip ( )
iia = lambda : list ( map ( int , stdin.readline ( ).strip ( ).split ( ) ) )
isa = lambda : stdin.readline ( ).strip ( ).split ( )
setrecursionlimit ( 100000 )
mod = 1000000007
k = ii1 ( )
t = 0
for i in range ( 1 , k + 1 ) :
    t = ( t % k ) * 10 + 7
    if t % k == 0 :
        print ( i )
        break
else :
    print ( - 1 )

