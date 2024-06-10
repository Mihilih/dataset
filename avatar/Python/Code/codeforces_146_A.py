n = int ( input ( ) )
number = list ( map ( int , list ( input ( ) ) ) )
h1 = 0
h2 = 0
x = 0
for i in range ( n ) :
    if number [ i ] != 4 and number [ i ] != 7 :
        print ( "NO" )
        x += 1
        break
    if i < n // 2 :
        h1 += number [ i ]
    else :
        h2 += number [ i ]
if not x :
    if h1 == h2 :
        print ( "YES" )
    else :
        print ( "NO" )

