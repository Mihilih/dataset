def main ( ) :
    from sys import setrecursionlimit , stdin
    from os import environ
    from collections import defaultdict , deque , Counter
    from math import ceil , floor , gcd
    from itertools import accumulate , combinations , combinations_with_replacement
    setrecursionlimit ( 10 ** 6 )
    dbg = ( lambda * something : print ( * something ) ) if 'TERM_PROGRAM' in environ else lambda * x : 0
    input = lambda : stdin.readline ( ).rstrip ( )
    LMIIS = lambda : list ( map ( int , input ( ).split ( ) ) )
    II = lambda : int ( input ( ) )
    P = 10 ** 9 + 7
    INF = 10 ** 9 + 10
    sa , sb = input ( ).split ( )
    a = int ( sa )
    b = int ( float ( sb ) * 100 + 0.1 )
    print ( a * b // 100 )
main ( )

