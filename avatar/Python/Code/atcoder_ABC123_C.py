import math
import numpy as np
from fractions import gcd
import fractions
import statistics
import collections
from functools import reduce
import itertools
N = int ( input ( ) )
A = [ int ( input ( ) ) for i in range ( 5 ) ]
print ( math.ceil ( N / min ( A ) ) + 4 )

