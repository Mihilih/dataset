x , y = map ( int , input ( ).split ( ) )
print ( max ( x + y - 3 + ( ( y - x ) % 3 > 0 ) , 0 ) )
num_inp = lambda : int ( input ( ) )
arr_inp = lambda : list ( map ( int , input ( ).split ( ) ) )
sp_inp = lambda : map ( int , input ( ).split ( ) )
str_inp = lambda : input ( )

