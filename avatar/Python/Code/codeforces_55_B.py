def rememberTheNumber ( nums , i , operations , ans ) :
    if i >= 3 :
        return
    for j in range ( 4 ) :
        for k in range ( j + 1 , 4 ) :
            if ( nums [ j ] != - 1 and nums [ k ] != - 1 ) :
                s = nums [ j ]
                nums [ j ] = - 1
                t = nums [ k ]
                if ( operations [ i ] == '+' ) :
                    nums [ k ] = s + t
                elif ( operations [ i ] == '*' ) :
                    nums [ k ] = s * t
                if ( i == 2 and nums [ k ] < ans [ 0 ] ) :
                    ans [ 0 ] = nums [ k ]
                rememberTheNumber ( nums , i + 1 , operations , ans )
                nums [ j ] = s
                nums [ k ] = t
nums = list ( map ( int , input ( ).split ( ) ) )
operations = list ( map ( str , input ( ).split ( ) ) )
ans = [ 10000000000000000000000000 ]
rememberTheNumber ( nums , 0 , operations , ans )
print ( ans [ 0 ] )

