s = input ( )
n = int ( input ( ) )
ans = 0
for i in range ( n ) :
    x = input ( )
    a , b = 0 , 0
    for j in s :
        if j == x [ 0 ] :
            a += 1
        elif j == x [ 1 ] :
            b += 1
        else :
            ans = ans + min ( a , b )
            a , b = 0 , 0
    ans = ans + min ( a , b )
print ( ans )

