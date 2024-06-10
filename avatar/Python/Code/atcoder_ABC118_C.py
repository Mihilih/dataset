N = int ( input ( ) )
A = list ( map ( int , input ( ).split ( ) ) )
import functools
import fractions
gcd = functools.reduce ( fractions.gcd , A )
print ( gcd )

