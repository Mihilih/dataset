n = int ( input ( ) )
s = list ( input ( ) )
t = list ( input ( ) )
if s == t :
    print ( n )
else :
    cnt = 0
    for i in range ( n ) :
        for j in range ( n - i ) :
            if s [ i + j ] != t [ j ] :
                break
            if j == n - i - 1 :
                cnt = n - i
    print ( 2 * n - cnt )

