u = input
n , k = map ( int , u ( ).split ( ) )
M = [ int ( i ) for i in u ( ).split ( ) ]
m = 0
for j in range ( n ) :
    for p in range ( n ) :
        if ( 0 == M [ p ] ) :
            print ( p + 1 , end = ' ' )
            break
    for l in range ( p + 1 - k ) : M [ l ] -= 1
    M [ p ] -= 1

