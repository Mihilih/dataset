num , k = [ int ( x ) for x in input ( ).split ( ) ]
arr = [ int ( x ) for x in input ( ).split ( ) ]
different = set ( )
temp = 0
arr.sort ( )
for x in arr :
    if ( x % k != 0 or not x // k in different ) :
        different.add ( x )
    temp = max ( len ( different ) , temp )
print ( temp )

