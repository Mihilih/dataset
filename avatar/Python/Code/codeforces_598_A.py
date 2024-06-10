t = int ( input ( ) )
def solve ( n ) :
    s = ( 1 + n ) * n // 2
    t = 1
    while t <= n :
        s -= 2 * t
        t *= 2
    return s
for _ in range ( t ) :
    n = int ( input ( ) )
    print ( solve ( n ) )

