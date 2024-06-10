n = int ( input ( ) )
l = list ( map ( int , input ( ).split ( ) ) )
l.sort ( )
for i in l :
    if i + 1 in l and i + 2 in l :
        print ( 'YES' )
        break
else :
    print ( 'NO' )

