n = int ( input ( ) )
s = [ ]
for i in range ( n ) :
    k = input ( )
    s.append ( k )
flag = 0
d1 = [ ]
d2 = [ ]
rem = set ( )
for i in range ( n ) :
    for j in range ( n ) :
        if ( i == j ) :
            d1.append ( s [ i ] [ j ] )
        if ( i == n - j - 1 ) :
            d2.append ( s [ i ] [ j ] )
        if ( i != j and i != n - j - 1 ) :
            rem.add ( s [ i ] [ j ] )
if ( len ( rem ) != 1 ) :
    print ( 'NO' )
elif ( d1 != d2 ) :
    print ( 'NO' )
elif ( len ( set ( d1 ) ) != 1 ) :
    print ( 'NO' )
elif ( set ( d1 ) == rem ) :
    print ( 'NO' )
else :
    print ( 'YES' )

