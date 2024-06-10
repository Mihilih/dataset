def sum ( k ) :
    ret = 0
    pw = 10
    len = 1
    while 1 == 1 :
        cur = min ( pw - 1 , k )
        prev = pw // 10
        ret += ( cur - prev + 1 ) * len
        if ( pw - 1 >= k ) :
            break
        len += 1
        pw *= 10
    return ret
w , m , k = map ( int , input ( ).split ( ) )
lo = 0
hi = int ( 1e18 )
while hi - lo > 1 :
    md = ( lo + hi ) // 2
    c = sum ( m + md - 1 ) - sum ( m - 1 )
    if c * k <= w :
        lo = md
    else :
        hi = md
print ( lo )

