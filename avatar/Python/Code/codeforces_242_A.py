x , y , a , b = map ( int , input ( ).split ( ) )
games = [ ]
for i in range ( a , x + 1 ) :
    if ( i <= b ) : continue
    else :
        for j in range ( b , y + 1 ) :
            if i > j :
                games.append ( ( i , j ) )
print ( len ( games ) )
for i in games :
    print ( f"{i[0]} {i[1]}" )

