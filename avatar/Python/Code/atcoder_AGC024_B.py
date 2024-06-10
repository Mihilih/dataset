def main ( ) :
    N = int ( input ( ) )
    P = [ int ( input ( ) ) for _ in range ( N ) ]
    editorial ( N , P )
def editorial ( N , P ) :
    if N == 1 :
        print ( 0 )
        return
    a = [ 0 ] * ( N + 1 )
    for i , p in enumerate ( P ) :
        a [ p ] = i
    tmp = 1
    max_len = 1
    for i in range ( 1 , N ) :
        if a [ i ] < a [ i + 1 ] :
            tmp += 1
            max_len = max ( max_len , tmp )
        else :
            tmp = 1
    ans = N - max_len
    print ( ans )
def WA ( N , P ) :
    tmp = 0
    ans = 0
    for i , p in enumerate ( P ) :
        if i == 0 or P [ i - 1 ] + 1 == p :
            tmp += 1
        else :
            ans = max ( ans , tmp )
            tmp = 1
    print ( N - ans )
if __name__ == '__main__' :
    main ( )

