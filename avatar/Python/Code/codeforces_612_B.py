n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
b = [ 0 ] * n
for i in range ( n ) :
    b [ a [ i ] - 1 ] = i
res = 0
for i in range ( 1 , n ) :
    res += abs ( b [ i ] - b [ i - 1 ] )
print ( res )

