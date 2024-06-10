n , m = map ( int , input ( ).split ( ) )
sa = input ( ).count ( "-" )
sa = min ( [ n - sa , sa ] )
ss = [ ]
for _ in range ( m ) :
    a , b = map ( int , input ( ).split ( ) )
    b -= a
    ss.append ( ( b % 2 and b <= sa << 1 ) and "1\n" or "0\n" )
print ( "".join ( ss ) )

