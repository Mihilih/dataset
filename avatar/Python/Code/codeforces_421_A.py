n , a , b = [ int ( x ) for x in input ( ).split ( " " ) ]
lista = [ int ( x ) for x in input ( ).split ( " " ) ]
listb = [ int ( x ) for x in input ( ).split ( " " ) ]
for k in range ( n ) :
    if k + 1 in lista :
        print ( 1 , end = " " )
    else :
        print ( 2 , end = " " )

