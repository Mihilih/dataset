n , m = map ( int , input ( ).split ( ) )
l = list ( map ( int , input ( ).split ( ) ) )
l2 = [ ]
for i in l :
    if i % m == 0 :
        l2.append ( i // m )
    else :
        l2.append ( i // m + 1 )
mx = max ( l2 )
for i in range ( n ) :
    if l2 [ i ] == mx :
        ind = i
print ( ind + 1 )

