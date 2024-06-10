import sys
N , K = map ( int , input ( ).split ( ) )
lst = list ( map ( int , input ( ).split ( ) ) )
lst_p = [ ]
lst_m = [ ]
for i in range ( N ) :
    if lst [ i ] == 0 :
        K -= 1
    if lst [ i ] > 0 :
        lst_p += [ lst [ i ] ]
    elif lst [ i ] < 0 :
        lst_m += [ lst [ i ] ]
p = 0
m = 0
x , y = 0 , len ( lst_m ) - 1
lastx = len ( lst_p )
lasty = len ( lst_m )
def check ( k ) :
    ans = 10 ** 9
    for j in range ( 0 , k + 1 ) :
        if j > lastx or k - j > lasty :
            pass
        else :
            if j == 0 :
                p = 0
            else :
                p = lst_p [ j - 1 ]
            if k - j == 0 :
                m = 0
            else :
                m = lst_m [ lasty - ( k - j ) ]
            ans = min ( ans , 2 * p + abs ( m ) , p + 2 * abs ( m ) )
    return ans
print ( check ( K ) )

