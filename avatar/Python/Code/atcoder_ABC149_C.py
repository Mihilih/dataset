X = int ( input ( ) )
prime = [ True ] * ( 100010 )
prime [ 0 ] = False ;
prime [ 1 ] = False ;
for i in range ( 4 , 100010 , 2 ) :
    prime [ i ] = False
i = 3
while ( i * i <= 100008 ) :
    if prime [ i ] :
        for j in range ( i + i , 100008 , i ) :
            prime [ j ] = False
    i += 2
for i in range ( X , 100008 ) :
    if prime [ i ] :
        print ( i )
        break

