from collections import deque
import sys
input = sys.stdin.readline
def bfs ( v , N , G , E ) :
    visited = [ 0 ] * N
    queue = deque ( )
    K = - 1
    node2color = [ - 1 for _ in range ( N ) ]
    queue.append ( v )
    visited [ v ] = 1
    while queue :
        q = queue.popleft ( )
        color = 0
        for nex in G [ q ] :
            if visited [ nex ] :
                continue
            visited [ nex ] = 1
            color += 1
            if color == node2color [ q ] :
                color += 1
            node2color [ nex ] = color
            E [ ( min ( q , nex ) , max ( q , nex ) ) ] = color
            queue.append ( nex )
        K = max ( K , color )
    return K
def main ( ) :
    N = int ( input ( ) )
    G = [ deque ( ) for _ in range ( N ) ]
    E = dict ( )
    for i in range ( N - 1 ) :
        a , b = map ( lambda x : int ( x ) - 1 , input ( ).split ( ) )
        G [ a ].append ( b )
        G [ b ].append ( a )
        E [ ( a , b ) ] = 0
    K = bfs ( 0 , N , G , E )
    print ( K )
    for value in E.values ( ) :
        print ( value )
main ( )

