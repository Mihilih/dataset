n , k = map ( int , input ( ).split ( ) )
s = input ( )
count = [ 0 ] * 26
for c in s :
    count [ ord ( c ) - ord ( "A" ) ] += 1
count.sort ( reverse = True )
res = 0
for i in range ( 26 ) :
    if count [ i ] >= k :
        res += k * k
        print ( res )
        exit ( )
    k -= count [ i ]
    res += count [ i ] ** 2
print ( res )

