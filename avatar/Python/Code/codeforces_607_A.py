n = int ( input ( ) )
l = [ 0 for _ in range ( 1000010 ) ]
dp = [ 0 for _ in range ( 1000010 ) ]
for i in range ( n ) :
    a , b = map ( int , input ( ).split ( ) )
    l [ a ] = b
if l [ 0 ] > 0 :
    dp [ 0 ] = 1
mx = 0
for i in range ( 1 , 1000010 ) :
    if ( l [ i ] == 0 ) :
        dp [ i ] = dp [ i - 1 ]
    else :
        if ( l [ i ] >= i ) :
            dp [ i ] = 1 ;
        else :
            dp [ i ] = dp [ i - l [ i ] - 1 ] + 1 ;
    if ( dp [ i ] > mx ) :
        mx = dp [ i ]
print ( n - mx )
