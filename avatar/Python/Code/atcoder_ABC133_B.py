import math
n , d = map ( int , input ( ).split ( ) )
points = [ list ( map ( int , input ( ).split ( ) ) ) for _ in range ( n ) ]
def dist ( x , y ) :
    tmp = 0.0
    for i in range ( d ) :
        tmp += ( x [ i ] - y [ i ] ) ** 2
    return math.sqrt ( tmp )
count = 0
for i , elm in enumerate ( points ) :
    for j in range ( i + 1 , n ) :
        if dist ( elm , points [ j ] ).is_integer ( ) :
            count += 1
print ( count )

