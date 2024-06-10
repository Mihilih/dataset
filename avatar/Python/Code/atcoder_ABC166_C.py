( n , m ) = [ int ( x ) for x in input ( ).split ( ) ]
p = [ x for x in range ( 1 , n + 1 ) ]
h = [ int ( x ) for x in input ( ).split ( ) ]
hp = dict ( zip ( p , h ) )
path = { i : [ ] for i in range ( 1 , n + 1 ) }
for i in range ( m ) :
    ( a , b ) = [ int ( x ) for x in input ( ).split ( ) ]
    path [ a ].append ( b )
    path [ b ].append ( a )
c = 0
for i , v in path.items ( ) :
    f = 0
    for j in v :
        if hp [ i ] <= hp [ j ] :
            f = 1
            break
    if f == 0 :
        c += 1
print ( c )

