n , m = map ( int , input ( ).split ( ) )
l = [ ]
for i in range ( n ) :
    s = input ( )
    s = list ( s )
    for j in range ( m ) :
        if s [ j ] == '.' :
            if ( i + j ) & 1 : s [ j ] = 'W'
            else : s [ j ] = 'B'
    l.append ( s )
for c in l : print ( "".join ( c ) )

