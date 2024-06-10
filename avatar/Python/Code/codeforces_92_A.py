n , m = map ( int , input ( ).split ( ) )
i = 1
while m >= i :
    m -= i
    i = ( i % n ) + 1
print ( m )

