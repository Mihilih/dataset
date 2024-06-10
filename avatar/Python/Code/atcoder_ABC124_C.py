import collections
s = list ( input ( ) )
even = collections.Counter ( s [ 0 : : 2 ] )
odd = collections.Counter ( s [ 1 : : 2 ] )
print ( min ( len ( s ) - ( even [ "0" ] + odd [ "1" ] ) , len ( s ) - ( even [ "1" ] + odd [ "0" ] ) ) )

