from functools import *
from operator import *
N = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
total = reduce ( xor , a , 0 )
print ( " ".join ( list ( map ( lambda ai : str ( ai ^ total ) , a ) ) ) )

