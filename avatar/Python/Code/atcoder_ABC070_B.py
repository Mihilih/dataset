A = list ( map ( int , input ( ).split ( ) ) )
if A [ 1 ] <= A [ 2 ] or A [ 3 ] <= A [ 0 ] :
    print ( 0 )
else :
    A.sort ( )
    print ( A [ 2 ] - A [ 1 ] )

