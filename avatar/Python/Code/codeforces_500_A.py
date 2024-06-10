import sys
n , t = map ( int , input ( ).split ( ) )
s = list ( [ int ( x ) for x in input ( ).split ( ) ] )
current_cell = 0
while current_cell <= t :
    current_cell += s [ current_cell - 1 ]
    if current_cell == t :
        print ( "YES" )
        sys.exit ( )
    else :
        continue
print ( "NO" )

