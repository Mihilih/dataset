from statistics import median
from fractions import gcd
from itertools import combinations
from collections import deque
from collections import defaultdict
import bisect
import sys
sys.setrecursionlimit ( 10000000 )
mod = 10 ** 9 + 7
def readInts ( ) :
    return list ( map ( int , input ( ).split ( ) ) )
def main ( ) :
    n = int ( input ( ) )
    A = readInts ( )
    A = sorted ( A )
    ans = 0
    for i in range ( len ( A ) - 2 , len ( A ) - 2 * n - 1 , - 2 ) :
        ans += A [ i ]
    print ( ans )
if __name__ == '__main__' :
    main ( )

