import sys , re
from collections import deque , defaultdict , Counter
from math import ceil , sqrt , hypot , factorial , pi , sin , cos , radians
from itertools import accumulate , permutations , combinations , product
from operator import itemgetter , mul
from copy import deepcopy
from string import ascii_lowercase , ascii_uppercase , digits
from bisect import bisect , bisect_left
from fractions import gcd
from heapq import heappush , heappop
from functools import reduce
def input ( ) : return sys.stdin.readline ( ).strip ( )
def INT ( ) : return int ( input ( ) )
def MAP ( ) : return map ( int , input ( ).split ( ) )
def LIST ( ) : return list ( map ( int , input ( ).split ( ) ) )
def ZIP ( n ) : return zip ( * ( MAP ( ) for _ in range ( n ) ) )
sys.setrecursionlimit ( 10 ** 9 )
INF = float ( 'inf' )
mod = 10 ** 9 + 7
N , M = MAP ( )
balls = [ [ 1 , 0 ] for _ in range ( N ) ]
balls [ 0 ] = [ 0 , 1 ]
for _ in range ( M ) :
    x , y = MAP ( )
    w_x , r_x = balls [ x - 1 ]
    w_y , r_y = balls [ y - 1 ]
    if w_x >= 1 and r_x >= 1 :
        balls [ x - 1 ] [ 0 ] -= 1
        balls [ y - 1 ] [ 1 ] += 1
    elif w_x == 0 :
        balls [ x - 1 ] [ 1 ] -= 1
        balls [ y - 1 ] [ 1 ] += 1
    else :
        balls [ x - 1 ] [ 0 ] -= 1
        balls [ y - 1 ] [ 0 ] += 1
ans = 0
for i in range ( N ) :
    if balls [ i ] [ 1 ] :
        ans += 1
print ( ans )

