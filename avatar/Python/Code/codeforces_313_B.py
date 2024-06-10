soz = input ( )
a = [ 0 ] * ( len ( soz ) + 1 )
for i in range ( 1 , len ( soz ) ) :
    a [ i ] = a [ i - 1 ]
    if soz [ i - 1 ] == soz [ i ] :
        a [ i ] += 1
n = int ( input ( ) )
arr = [ ]
for i in range ( n ) :
    m , l = input ( ).split ( )
    arr.append ( a [ int ( l ) - 1 ] - a [ int ( m ) - 1 ] )
for i in arr :
    print ( i )

