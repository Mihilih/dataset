import sys
import math
from collections import defaultdict
sys.setrecursionlimit ( 10 ** 7 )
def input ( ) :
    return sys.stdin.readline ( ) [ : - 1 ]
mod = 10 ** 9 + 7
def I ( ) : return int ( input ( ) )
def II ( ) : return map ( int , input ( ).split ( ) )
def III ( ) : return list ( map ( int , input ( ).split ( ) ) )
def Line ( N ) :
    read_all = [ tuple ( map ( int , input ( ).split ( ) ) ) for _ in range ( N ) ]
    return map ( list , zip ( * read_all ) )
S = str ( input ( ) )
n = len ( S )
if n == 1 :
    if S == '5' or S == '?' :
        print ( 1 )
    else :
        print ( 0 )
    exit ( )
dp = [ [ 0 ] * 13 for i in range ( n ) ]
for i in range ( n ) :
    if i == 0 :
        if S [ i ] != '?' :
            dp [ i ] [ int ( S [ i ] ) ] += 1
        else :
            for j in range ( 10 ) :
                dp [ i ] [ j ] += 1
    else :
        if S [ i ] != '?' :
            for k in range ( 13 ) :
                dp [ i ] [ ( k * 10 + int ( S [ i ] ) ) % 13 ] += dp [ i - 1 ] [ k ]
        else :
            for j in range ( 10 ) :
                for k in range ( 13 ) :
                    dp [ i ] [ ( k * 10 + j ) % 13 ] += dp [ i - 1 ] [ k ]
        for k in range ( 13 ) :
            dp [ i ] [ k ] %= mod
print ( dp [ n - 1 ] [ 5 ] )

