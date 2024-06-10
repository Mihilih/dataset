r , D , x = map ( int , input ( ).split ( ) )
for i in range ( 2 , 12 ) :
    print ( int ( ( r ** ( i - 1 ) ) * ( x + D / ( 1 - r ) ) - D / ( 1 - r ) ) )

