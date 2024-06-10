n = int ( input ( ) )
import itertools
orig = list ( itertools.permutations ( list ( range ( 1 , n + 1 ) ) ) )
p = tuple ( map ( int , input ( ).split ( ) ) )
q = tuple ( map ( int , input ( ).split ( ) ) )
pn = orig.index ( p )
qn = orig.index ( q )
print ( abs ( pn - qn ) )

