from collections import deque
from collections import Counter
from itertools import product , permutations , combinations
from operator import itemgetter
from heapq import heappop , heappush
from bisect import bisect_left , bisect_right , bisect
from fractions import gcd
from math import ceil , floor , sqrt , cos , sin , pi , factorial
import sys
read = sys.stdin.buffer.read
readline = sys.stdin.buffer.readline
readlines = sys.stdin.buffer.readlines
sys.setrecursionlimit ( 10 ** 8 )
INF = float ( 'inf' )
MOD = 10 ** 9 + 7
def main ( ) :
    s = input ( )
    if len ( set ( s ) ) == 1 :
        print ( 0 )
        sys.exit ( )
    a = Counter ( s )
    ans = min ( a.values ( ) ) * 2
    print ( ans )
if __name__ == '__main__' :
    main ( )

