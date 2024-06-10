max_level = int ( input ( ) )
x = list ( map ( int , input ( ).split ( ) ) )
y = list ( map ( int , input ( ).split ( ) ) )
x.pop ( 0 )
y.pop ( 0 )
x = set ( x )
y = set ( y )
if 0 in x :
    x.discard ( 0 )
elif 0 in y :
    y.discard ( 0 )
z = x.union ( y )
if len ( z ) != max_level :
    print ( "Oh, my keyboard!" )
else :
    print ( "I become the guy." )

