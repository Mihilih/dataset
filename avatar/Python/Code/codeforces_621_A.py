n = int ( input ( ) )
lst = list ( map ( int , input ( ).split ( ) ) )
lst.sort ( )
lst.reverse ( )
od = 0
for i in lst :
    if ( i & 1 ) :
        od += 1
sum = 0
ok = 0
for i in range ( n ) :
    if ( lst [ i ] % 2 == 0 ) :
        sum += lst [ i ]
    else :
        if ( ok or od > 1 ) :
            sum += lst [ i ]
            od -= 1
            ok = not ok
print ( sum )

