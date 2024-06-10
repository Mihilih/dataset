from bisect import bisect_right , bisect_left
n , * l = map ( int , open ( 0 ).read ( ).split ( ) )
l.sort ( )
ans = 0
for i in range ( n ) :
    for j in range ( i + 1 , n ) :
        a = l [ i ]
        b = l [ j ]
        right = bisect_left ( l , a + b )
        left = bisect_right ( l , max ( a - b , b - a ) )
        tmp = max ( 0 , right - left )
        if left <= i < right :
            tmp -= 1
        if left <= j < right :
            tmp -= 1
        ans += tmp
print ( ans // 3 )

