s , l = ( input ( ) , 2019 )
m , a , r = ( [ 1 ] + [ 0 ] * l , 0 , 0 )
for i , e in enumerate ( s [ : : - 1 ] ) :
    a += int ( e ) * pow ( 10 , i , l )
    r += m [ a % l ]
    m [ a % l ] += 1
print ( r )

