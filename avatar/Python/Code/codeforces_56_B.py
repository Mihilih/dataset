N = int ( input ( ) )
A = list ( map ( int , input ( ).split ( ) ) )
mn , mx = N + 1 , - 1
for i in range ( N ) :
    if ( i + 1 != A [ i ] ) :
        mn = min ( mn , i )
        mx = max ( mx , i )
if ( mx == - 1 ) :
    print ( '0 0' )
else :
    A = A [ : mn ] + A [ mn : ( mx + 1 ) ] [ : : - 1 ] + A [ ( mx + 1 ) : ]
    if ( sorted ( A ) == A ) :
        print ( mn + 1 , mx + 1 )
    else :
        print ( '0 0' )

