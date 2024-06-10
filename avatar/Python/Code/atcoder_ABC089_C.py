import sys , re
from collections import deque , defaultdict , Counter
from math import ceil , sqrt , hypot , factorial , pi , sin , cos , radians
from itertools import accumulate , permutations , combinations , combinations_with_replacement , product , groupby
from operator import itemgetter , mul
from copy import deepcopy , copy
from string import ascii_lowercase , ascii_uppercase , digits
from bisect import bisect , bisect_left , insort , insort_left
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
import numpy as np
N = INT ( )
S = [ input ( ) for _ in range ( N ) ]
march = [ "M" , "A" , "R" , "C" , "H" ]
march_lis = [ 0 ] * 5
for s in S :
    if s [ 0 ].upper ( ) in march :
        march_lis [ march.index ( s [ 0 ].upper ( ) ) ] += 1
ans = 0
for x , y , z in combinations ( march_lis , 3 ) :
    ans += x * y * z
print ( ans )

