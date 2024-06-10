n = int ( input ( ) )
arr = list ( map ( int , input ( ).split ( ) ) )
if arr [ 0 ] > 15 : print ( 15 )
else :
    for i in range ( 1 , len ( arr ) ) :
        if arr [ i ] - arr [ i - 1 ] > 15 :
            print ( arr [ i - 1 ] + 15 )
            break
    else :
        if arr [ - 1 ] == 90 or arr [ - 1 ] + 15 >= 90 : print ( 90 )
        else : print ( arr [ - 1 ] + 15 )

