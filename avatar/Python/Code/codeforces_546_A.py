k , n , w = input ( ).split ( )
if 1 <= int ( k ) and int ( w ) <= 1000 :
    total = 0
    for i in range ( 1 , int ( w ) + 1 ) :
        total += i * int ( k )
    if total > int ( n ) :
        print ( total - int ( n ) )
    else :
        print ( 0 )

