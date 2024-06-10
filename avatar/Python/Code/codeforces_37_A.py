n = int ( input ( ) )
l = list ( map ( int , input ( ).split ( ) ) )
high = 1
tower = n
maximum = 1
l.sort ( )
for i in range ( 1 , n ) :
    if l [ i ] == l [ i - 1 ] :
        tower -= 1
        high += 1
    else :
        if high > maximum :
            maximum = high
        high = 1
if high > maximum :
    maximum = high
print ( maximum , tower )

