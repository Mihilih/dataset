n = int ( input ( ) )
c = 0
for i in range ( n ) :
    l1 = list ( map ( int , input ( ).split ( ) ) )
    if sum ( l1 ) > 1 :
        c = c + 1
print ( c )

