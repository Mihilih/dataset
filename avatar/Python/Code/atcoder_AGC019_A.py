import sys , re
from collections import deque , defaultdict , Counter
from math import sqrt , hypot , factorial , pi , sin , cos , radians
if sys.version_info.minor >= 5 : from math import gcd
else : from fractions import gcd
from heapq import heappop , heappush , heapify , heappushpop
from bisect import bisect_left , bisect_right
from itertools import permutations , combinations , product
from operator import itemgetter , mul
from copy import deepcopy
from functools import reduce , partial
from fractions import Fraction
from string import ascii_lowercase , ascii_uppercase , digits
def input ( ) : return sys.stdin.readline ( ).strip ( )
def ceil ( a , b = 1 ) : return int ( - ( - a // b ) )
def round ( x ) : return int ( ( x * 2 + 1 ) // 2 )
def fermat ( x , y , MOD ) : return x * pow ( y , MOD - 2 , MOD ) % MOD
def lcm ( x , y ) : return ( x * y ) // gcd ( x , y )
def lcm_list ( nums ) : return reduce ( lcm , nums , initial = 1 )
def INT ( ) : return int ( input ( ) )
def MAP ( ) : return map ( int , input ( ).split ( ) )
def LIST ( ) : return list ( map ( int , input ( ).split ( ) ) )
sys.setrecursionlimit ( 10 ** 9 )
INF = float ( 'inf' )
MOD = 10 ** 9 + 7
q , h , s , d = MAP ( )
n = INT ( )
best1L = min ( q * 4 , h * 2 , s )
best2L = min ( d , best1L * 2 )
if n % 2 == 0 :
    print ( best2L * ( n // 2 ) )
else :
    print ( best2L * ( n // 2 ) + best1L )

