import sys
from collections import deque
input = sys.stdin.buffer.readline
N = int ( input ( ) )
adj = [ [ ] for _ in range ( N + 1 ) ]
for _ in range ( N - 1 ) :
    a , b = map ( int , input ( ).split ( ) )
    adj [ a ].append ( b )
    adj [ b ].append ( a )
que = deque ( )
que.append ( 1 )
seen = [ 0 ] * ( N + 1 )
seen [ 1 ] = 1
par = [ 0 ] * ( N + 1 )
child_num = [ 0 ] * ( N + 1 )
while que :
    v = que.popleft ( )
    for u in adj [ v ] :
        if seen [ u ] == 0 :
            seen [ u ] = 1
            par [ u ] = v
            child_num [ v ] += 1
            que.append ( u )
seq = deque ( )
for i in range ( 1 , N + 1 ) :
    if child_num [ i ] == 0 :
        seq.append ( i )
while seq :
    c = seq.pop ( )
    seen [ c ] = 0
    if seen [ par [ c ] ] == 0 :
        print ( 'First' )
        exit ( )
    seen [ par [ c ] ] = 0
    child_num [ par [ par [ c ] ] ] -= 1
    if child_num [ par [ par [ c ] ] ] == 0 :
        seq.append ( par [ par [ c ] ] )
print ( 'Second' )

