from math import prod
input ( )
a = input ( )
print ( 0 if a.count ( "1" ) == 0 else prod ( [ i.count ( "0" ) + 1 for i in a.strip ( "0 " ).split ( '1' ) ] ) )

