n = int ( input ( ) )
m = [ [ int ( x ) for x in input ( ).split ( ) ] for i in range ( n ) ]
m.sort ( reverse = True )
a = m [ 0 ]
for i in m [ 1 : ] :
    if i [ 1 ] > a [ 1 ] :
        print ( 'Happy Alex' )
        break
    a = i
else :
    print ( 'Poor Alex' )

