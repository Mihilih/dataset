n , k = map ( int , input ( ).split ( ) )
v = input ( )
d = [ "LEFT" , "RIGHT" ]
f = k - 1 < n - k
m = min ( k - 1 , n - k )
a = [ ]
for i in range ( 0 , m ) :
    a.append ( d [ not f ] )
for i in v [ : : - 1 + 2 * f ] :
    a.append ( "PRINT " + i )
    a.append ( d [ f ] )
print ( * a [ : - 1 ] , sep = "\n" )

