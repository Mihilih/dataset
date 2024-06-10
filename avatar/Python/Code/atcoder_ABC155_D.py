N , K = map ( int , input ( ).split ( ) )
A = list ( map ( int , input ( ).split ( ) ) )
A.sort ( )
ll = - 10 ** 18 - 1
rr = 10 ** 18 + 1
while ll + 1 < rr :
    x = ( ll + rr ) // 2
    tot = 0
    for i in range ( N ) :
        if A [ i ] < 0 :
            l = - 1
            r = N
            while l + 1 < r :
                c = ( l + r ) // 2
                if A [ i ] * A [ c ] < x :
                    r = c
                else :
                    l = c
            tot += N - r
        else :
            l = - 1
            r = N
            while l + 1 < r :
                c = ( l + r ) // 2
                if A [ i ] * A [ c ] < x :
                    l = c
                else :
                    r = c
            tot += r
        if A [ i ] * A [ i ] < x :
            tot -= 1
    tot //= 2
    if tot < K :
        ll = x
    else :
        rr = x
print ( ll )

