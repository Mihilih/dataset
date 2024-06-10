def G ( a , b ) :
    while a % b != 0 :
        a , b = b , a % b
    return b
def L ( a , b ) :
    return a * b // G ( a , b )
l = input ( ).split ( ' ' )
x , y , a , b = int ( l [ 0 ] ) , int ( l [ 1 ] ) , int ( l [ 2 ] ) , int ( l [ 3 ] )
lcm = L ( x , y )
print ( b // lcm - ( a - 1 ) // lcm )

