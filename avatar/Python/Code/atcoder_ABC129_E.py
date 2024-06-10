mod = 10 ** 9 + 7
l = input ( )
n = len ( l )
dp = [ [ 0 ] * 2 for _ in range ( n + 1 ) ]
dp [ 0 ] [ 0 ] = 1
for i , c in enumerate ( l ) :
    if c == '0' :
        dp [ i + 1 ] [ 0 ] += dp [ i ] [ 0 ]
        dp [ i + 1 ] [ 1 ] += dp [ i ] [ 1 ] * 3
    else :
        dp [ i + 1 ] [ 0 ] += dp [ i ] [ 0 ] * 2
        dp [ i + 1 ] [ 1 ] += dp [ i ] [ 0 ]
        dp [ i + 1 ] [ 1 ] += dp [ i ] [ 1 ] * 3
    dp [ i + 1 ] [ 0 ] %= mod
    dp [ i + 1 ] [ 1 ] %= mod
print ( ( dp [ n ] [ 0 ] + dp [ n ] [ 1 ] ) % mod )

