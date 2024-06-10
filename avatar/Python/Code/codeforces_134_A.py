import sys
input = sys.stdin.readline
n = int ( input ( ) )
w = list ( map ( int , input ( ).split ( ) ) )
x = sum ( w )
d = [ ]
for i in range ( n ) :
    if ( x - w [ i ] ) / ( n - 1 ) == w [ i ] :
        d.append ( i + 1 )
print ( len ( d ) )
print ( ' '.join ( map ( str , d ) ) )

