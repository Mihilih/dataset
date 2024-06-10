import numpy as np
from collections import deque
import heapq
N , M = map ( int , input ( ).split ( ) )
edges = [ set ( ) for _ in range ( N ) ]
degs = [ 0 for i in range ( N ) ]
parity = [ 0 for _ in range ( N ) ]
flag = [ False for _ in range ( N ) ]
for _ in range ( M ) :
    a , b = map ( int , input ( ).split ( ) )
    edges [ a - 1 ].add ( b - 1 )
    edges [ b - 1 ].add ( a - 1 )
    degs [ a - 1 ] += 1
    degs [ b - 1 ] += 1
if M % 2 != 0 :
    print ( - 1 )
    exit ( )
Q = [ ]
for i , d in enumerate ( degs ) :
    Q.append ( ( d , i ) )
heapq.heapify ( Q )
while len ( Q ) > 0 :
    _ , u = Q [ 0 ]
    heapq.heappop ( Q )
    if flag [ u ] :
        continue
    flag [ u ] = True
    for i , v in enumerate ( edges [ u ] ) :
        edges [ v ].remove ( u )
        if parity [ u ] != 0 and i == 0 :
            print ( u + 1 , v + 1 )
            parity [ u ] = 1 - parity [ u ]
        else :
            print ( v + 1 , u + 1 )
            parity [ v ] = 1 - parity [ v ]
        degs [ v ] -= 1
        heapq.heappush ( Q , ( degs [ v ] , v ) )

