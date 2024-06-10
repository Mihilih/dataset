x , y , z , k = [ int ( _ ) for _ in input ( ).split ( ) ]
a = [ int ( _ ) for _ in input ( ).split ( ) ]
b = [ int ( _ ) for _ in input ( ).split ( ) ]
c = [ int ( _ ) for _ in input ( ).split ( ) ]
ab = [ ]
for i in range ( x ) :
    for j in range ( y ) :
        ab.append ( a [ i ] + b [ j ] )
ab.sort ( reverse = True )
abc = [ ]
for i in range ( min ( k , x * y ) ) :
    for j in range ( z ) :
        abc.append ( ab [ i ] + c [ j ] )
abc.sort ( reverse = True )
for i in range ( k ) :
    print ( abc [ i ] )

