n = int ( input ( ) )
l1 = list ( map ( int , input ( ).split ( ) ) )
l1.sort ( )
a = l1 [ - 1 ]
b = l1 [ 0 ]
if a == b :
    print ( a - b , ( n ) * ( n - 1 ) // 2 )
else :
    ac = l1.count ( a )
    bc = l1.count ( b )
    print ( a - b , ac * bc )

