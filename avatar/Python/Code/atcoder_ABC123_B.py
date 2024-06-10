import math
menu = [ ]
for _ in range ( 5 ) :
    m = input ( )
    e = int ( m [ - 1 ] )
    if e == 0 :
        e = 10
    menu.append ( [ int ( m ) , e ] )
menu.sort ( key = lambda x : x [ 1 ] )
ans = 0
for m in menu [ 1 : ] :
    ans += math.ceil ( m [ 0 ] / 10 ) * 10
print ( ans + menu [ 0 ] [ 0 ] )

