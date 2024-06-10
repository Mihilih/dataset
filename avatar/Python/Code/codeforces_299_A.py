num_inp = lambda : int ( input ( ) )
arr_inp = lambda : list ( map ( int , input ( ).split ( ) ) )
sp_inp = lambda : map ( int , input ( ).split ( ) )
a = sorted ( map ( int , [ * open ( 0 ) ] [ 1 ].split ( ) ) )
print ( [ a [ 0 ] , - 1 ] [ any ( x % a [ 0 ] for x in a ) ] )

