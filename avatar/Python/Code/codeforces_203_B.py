def solve_case ( ) :
    n , m = map ( int , input ( ).split ( ) )
    count = [ None ] * n
    for i in range ( n ) :
        count [ i ] = [ 0 ] * n
    ans = - 1
    for k in range ( m ) :
        x , y = map ( int , input ( ).split ( ) )
        x -= 1
        y -= 1
        found = False
        for i in range ( x - 2 , x + 1 ) :
            for j in range ( y - 2 , y + 1 ) :
                if i >= 0 and i < n and j >= 0 and j < n :
                    count [ i ] [ j ] += 1
                    if count [ i ] [ j ] == 9 :
                        found = True
        if found :
            ans = k + 1
            break
    print ( ans )
solve_case ( )

