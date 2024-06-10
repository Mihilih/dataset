v1 , v2 = input ( ).split ( )
t , d = input ( ).split ( )
v1 = int ( v1 )
v2 = int ( v2 )
t = int ( t )
d = int ( d )
a = 1
v = v1
distance = 0
for i in range ( t ) :
    if v - v2 > ( t - i - 1 ) * d :
        a *= - 1
        v = ( t - i - 1 ) * d + v2
    distance += v
    v += a * d
print ( distance )

