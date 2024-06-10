t , s , q = map ( int , input ( ).split ( ) )
ans = 0
while ( s < t ) :
    s *= q
    ans += 1
print ( ans )

