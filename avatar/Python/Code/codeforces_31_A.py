y = int ( input ( ) )
arr = [ int ( i ) for i in input ( ).split ( ) ]
for i in range ( len ( arr ) ) :
    for j in range ( len ( arr ) ) :
        if i == j :
            continue
        for k in range ( len ( arr ) ) :
            if arr [ k ] != arr [ j ] and arr [ k ] != arr [ i ] and arr [ k ] == arr [ i ] + arr [ j ] :
                print ( k + 1 , j + 1 , i + 1 )
                exit ( )
print ( - 1 )

