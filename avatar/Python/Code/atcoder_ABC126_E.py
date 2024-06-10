import sys
from collections import deque
sys.setrecursionlimit ( 10 ** 9 )
INF = 10 ** 18
def input ( ) :
    return sys.stdin.readline ( ).rstrip ( )
def main ( ) :
    N , M = map ( int , input ( ).split ( ) )
    edge = [ [ ] for _ in range ( N ) ]
    for i in range ( M ) :
        X , Y , Z = map ( lambda x : int ( x ) - 1 , input ( ).split ( ) )
        edge [ X ].append ( Y )
        edge [ Y ].append ( X )
    used = [ False ] * N
    ans = 0
    for i in range ( N ) :
        if not used [ i ] :
            ans += 1
            queue = deque ( )
            queue.append ( i )
            while queue :
                node = queue.popleft ( )
                used [ node ] = True
                for nextnode in edge [ node ] :
                    if not used [ nextnode ] :
                        queue.append ( nextnode )
    print ( ans )
if __name__ == '__main__' :
    main ( )

