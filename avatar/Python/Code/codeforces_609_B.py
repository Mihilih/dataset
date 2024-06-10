def _input ( ) : return map ( int , input ( ).split ( ) )
n , m = _input ( )
lst = list ( _input ( ) )
l = { }
for i in range ( n ) :
    if lst [ i ] not in l :
        l [ lst [ i ] ] = 1
    else : l [ lst [ i ] ] += 1
res = 0
for i in range ( n ) :
    if l [ lst [ i ] ] > 1 :
        res += n - i - l [ lst [ i ] ]
        l [ lst [ i ] ] -= 1
    else :
        res += n - i - 1
print ( res )

