from sys import stdin
from collections import Counter
import numpy as np
N , M = [ int ( x ) for x in stdin.readline ( ).split ( ) ]
A = np.array ( [ int ( a ) for a in stdin.readline ( ).split ( ) ] , dtype = np.int64 )
cum_remainders = ( np.hstack ( [ 0 , A ] ) % M ).cumsum ( ) % M
remainder_counts = Counter ( cum_remainders )
combinations = 0
for count in remainder_counts.values ( ) :
    combinations += count * ( count - 1 ) // 2
print ( combinations )

