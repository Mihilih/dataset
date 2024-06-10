l = input ( )
l = l.split ( '.' )
s = list ( l [ 0 ] )
p = list ( l [ 1 ] )
i = int ( p [ 0 ] )
if s [ len ( s ) - 1 ] == '9' :
    print ( "GOTO Vasilisa." )
elif s [ len ( s ) - 1 ] != '9' and i < 5 :
    s = "".join ( s )
    print ( s )
else :
    s = "".join ( s )
    s = str ( int ( s ) + 1 )
    print ( s )

