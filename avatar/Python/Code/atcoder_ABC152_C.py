import numpy as np
N = int ( input ( ) )
n = [ int ( x ) for x in input ( ).split ( ) ]
n = np.array ( n )
a = 1
pos = 0
for i in range ( 1 , N ) :
    if n [ pos ] > n [ i ] :
        a += 1
        pos = i
print ( a )

