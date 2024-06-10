N , X = [ int ( _ ) for _ in input ( ).split ( ) ]
from itertools import permutations
def calc ( x ) :
    def sub ( y , debug = 0 ) :
        if debug :
            print ( "D" , y )
        while len ( y ) > 1 :
            y = [ sorted ( y [ i : i + 3 ] ) [ 1 ] for i in range ( len ( y ) - 2 ) ]
            if debug :
                print ( "D" , y )
        return y
    y = sub ( x )
    if y [ 0 ] == 2 :
        pass
        sub ( x , 1 )
        print ( "=" , x )
    return y [ 0 ]
if X == 1 or X == N * 2 - 1 :
    print ( "No" )
else :
    print ( "Yes" )
    if X == N * 2 - 2 :
        xs = list ( range ( N - 1 , X + 2 ) ) + list ( range ( 1 , N - 1 ) )
    else :
        ys = list ( range ( 1 , X - 1 ) ) + list ( range ( X + 3 , N * 2 ) )
        xs = ys [ : N - 3 ] + [ X + 2 , X - 1 , X , X + 1 ] + ys [ N - 3 : ]
    for x in xs :
        print ( x )

