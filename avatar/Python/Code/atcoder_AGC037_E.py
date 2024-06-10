N , K = map ( int , input ( ).split ( ) )
S = input ( )
aaaa = False
if K >= 15 :
    aaaa = True
elif 2 ** K >= N :
    aaaa = True
if aaaa :
    print ( min ( S ) * N )
    exit ( )
def get_last_dict ( s_str ) :
    U = s_str + s_str [ : : - 1 ]
    c = min ( s_str )
    p = U.index ( c )
    minindex = p
    p += 1
    while p <= N :
        if U [ p ] == c :
            if check_normal_dict ( U , minindex , p ) :
                minindex = p
        p += 1
    return U [ minindex : minindex + N ]
def check_normal_dict ( u , pointer1 , pointer2 ) :
    for i in range ( N ) :
        if u [ pointer1 + i ] > u [ pointer2 + i ] :
            return True
        elif u [ pointer1 + i ] < u [ pointer2 + i ] :
            return False
    return False
S = get_last_dict ( S )
if K == 1 :
    print ( S )
else :
    count = 0
    for c in S :
        if c == S [ 0 ] :
            count += 1
        else :
            break
    if count * ( 2 ** ( K - 1 ) ) >= N :
        print ( S [ 0 ] * N )
    else :
        S = S [ 0 ] * ( count * ( ( 2 ** ( K - 1 ) ) - 1 ) ) + S
        print ( S [ 0 : N ] )

