from itertools import accumulate
N , X , * A = map ( int , open ( 0 ).read ( ).split ( ) )
S = list ( accumulate ( A ) )
ans = float ( "inf" )
for k , s in enumerate ( S , 1 ) :
    E = k * X + 2 * sum ( S [ j ] for j in range ( N - 2 * k - 1 , - 1 , - k ) )
    ans = min ( ans , E )
print ( ans + N * X + 5 * S [ - 1 ] )

