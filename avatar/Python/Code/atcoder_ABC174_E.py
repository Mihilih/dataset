def check ( lis , k , mid ) :
    for i in lis :
        if ( i % mid == 0 ) :
            k += 1
        k -= ( i // mid )
    return k >= 0
n , k = map ( int , input ( ).split ( ) )
lis = list ( map ( int , input ( ).split ( ) ) )
a , b = 1 , max ( lis )
ans = b
while ( a <= b ) :
    mid = ( a + b ) // 2
    if ( check ( lis , k , mid ) ) :
        ans = mid
        b = mid - 1
    else :
        a = mid + 1
print ( ans )

