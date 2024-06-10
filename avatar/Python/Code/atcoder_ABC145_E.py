import sys
from operator import itemgetter
input = sys.stdin.readline
TIME = 0
VAL = 1
N , T = [ int ( a ) for a in input ( ).split ( ) ]
time_value = [ ( - 1 , - 1 ) ] + [ None ] * ( N )
for i in range ( 1 , N + 1 ) :
    time_value [ i ] = tuple ( int ( a ) for a in input ( ).split ( ) )
time_value.sort ( key = itemgetter ( VAL ) )
dp = [ [ - 1 ] * T for _ in range ( N + 1 ) ]
for t in range ( 0 , T ) :
    dp [ 0 ] [ t ] = 0
for n in range ( 1 , N + 1 ) :
    dp [ n ] [ 0 ] = 0
    for t in range ( 1 , T ) :
        if time_value [ n ] [ TIME ] > t :
            dp [ n ] [ t ] = dp [ n - 1 ] [ t ]
        else :
            dp [ n ] [ t ] = max ( dp [ n - 1 ] [ t ] , time_value [ n ] [ VAL ] + dp [ n - 1 ] [ t - time_value [ n ] [ TIME ] ] )
val_acum = time_value [ N ] [ VAL ]
t = T - 1
max_val = val_acum + dp [ N - 1 ] [ t ]
for n in range ( N - 1 , 0 , - 1 ) :
    val_acum += time_value [ n ] [ VAL ]
    t -= time_value [ n + 1 ] [ TIME ]
    if t < 0 :
        break
    else :
        max_val = max ( max_val , val_acum + dp [ n - 1 ] [ t ] )
print ( max_val )

