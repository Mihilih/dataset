princess = int ( input ( ) )
dragon = int ( input ( ) )
t = int ( input ( ) )
f = int ( input ( ) )
c = int ( input ( ) )
if dragon <= princess :
    print ( 0 )
    exit ( 0 )
result = 0
position = t * princess
position += princess * position / ( dragon - princess )
while position < c :
    result += 1
    position += princess * position / dragon
    position += princess * f
    position += princess * position / ( dragon - princess )
print ( result )

