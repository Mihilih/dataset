D , G = map ( int , input ( ).split ( ) )
PC = [ tuple ( map ( int , input ( ).split ( ) ) ) for _ in range ( D ) ]
ans = 10 ** 9
for i in range ( 2 ** D ) :
    score = 0
    problem = 0
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            score += 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ]
            problem += PC [ j ] [ 0 ]
    if score > G :
        continue
    left = G - score
    for j in range ( D ) :
        if ( i >> j ) & 1 :
            continue
        if left > 100 * ( j + 1 ) * PC [ j ] [ 0 ] + PC [ j ] [ 1 ] :
            pass
        else :
            tmp = ( left + ( 100 * ( j + 1 ) ) - 1 ) // ( 100 * ( j + 1 ) )
            ans = min ( ans , problem + min ( tmp , PC [ j ] [ 0 ] ) )
print ( ans )

