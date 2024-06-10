def resolve ( ) :
    n = int ( input ( ) )
    low = [ ]
    high = [ ]
    for i in range ( n ) :
        a , b = map ( int , input ( ).split ( ) )
        low.append ( a )
        high.append ( b )
    low.sort ( )
    high.sort ( )
    if n % 2 :
        print ( high [ ( n + 1 ) // 2 - 1 ] - low [ ( n + 1 ) // 2 - 1 ] + 1 )
    else :
        hh = ( high [ ( n ) // 2 - 1 ] + high [ ( n ) // 2 ] ) / 2
        ll = ( low [ ( n ) // 2 - 1 ] + low [ ( n ) // 2 ] ) / 2
        print ( int ( ( hh - ll ) * 2 ) + 1 )
if __name__ == "__main__" :
    resolve ( )

