cookies = [ int ( x ) for x in input ( ).split ( ) ]
leftOver = cookies [ 0 ] - cookies [ 2 ]
takahashi = max ( 0 , leftOver )
print ( str ( takahashi ) + ' ' + ( str ( cookies [ 1 ] ) if takahashi > 0 else str ( max ( 0 , cookies [ 1 ] - abs ( leftOver ) ) ) ) )

