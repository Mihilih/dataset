N = int ( input ( ) )
x = [ eval ( input ( ).replace ( 'JPY' , '* 1.0' ).replace ( 'BTC' , '* 380000.0' ) ) for i in range ( N ) ]
print ( sum ( x ) )

