n = int ( input ( ) )
arr = list ( map ( int , input ( ).strip ( ).split ( ) ) ) [ : n ]
ans = [ 0 ] * n
mx = arr [ - 1 ]
for i in range ( n - 2 , - 1 , - 1 ) :
    ans [ i ] = max ( 0 , mx - arr [ i ] + 1 )
    if arr [ i ] > mx :
        mx = arr [ i ]
print ( * ans )

