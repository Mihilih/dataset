n = int ( input ( ) )
r = [ * map ( int , input ( ).split ( ) ) ]
ans = abs ( r [ 0 ] )
for i in range ( 1 , n ) :
    ans += abs ( r [ i ] - r [ i - 1 ] )
print ( ans )

