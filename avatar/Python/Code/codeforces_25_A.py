n = int ( input ( ) )
list = [ int ( x ) % 2 for x in input ( ).split ( ) ]
if sum ( list ) == 1 :
    print ( list.index ( 1 ) + 1 )
else :
    print ( list.index ( 0 ) + 1 )

