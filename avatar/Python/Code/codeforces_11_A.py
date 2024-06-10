n , d = map ( int , input ( ).split ( ) )
x = [ ]
m = 0
q = 0
x = input ( ).split ( )
for i in range ( len ( x ) ) :
    x [ i ] = int ( x [ i ] )
for a in range ( len ( x ) - 1 ) :
    if x [ a ] >= x [ a + 1 ] :
        q = int ( ( x [ a ] - x [ a + 1 ] ) / d + 1 )
        m = m + q
        x [ a + 1 ] = x [ a + 1 ] + q * d
print ( m )

