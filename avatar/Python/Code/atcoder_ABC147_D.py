import numpy as np
N = int ( input ( ) )
A = np.fromiter ( map ( int , input ( ).split ( ) ) , np.int64 )
result = 0
for b in range ( 60 ) :
    bs = int ( ( ( A >> b ) & 1 ).sum ( ) )
    result = ( result + bs * ( N - bs ) * ( 1 << b ) ) % 1000000007
print ( result )

