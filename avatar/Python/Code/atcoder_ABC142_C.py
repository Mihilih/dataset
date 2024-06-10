from operator import itemgetter
N = int ( input ( ) )
A = [ ( i + 1 , int ( x ) ) for i , x in enumerate ( input ( ).split ( ) ) ]
A_ = sorted ( A , key = itemgetter ( 1 ) )
A__ = [ a [ 0 ] for a in A_ ]
for i in A__ [ : - 1 ] :
    print ( i , end = ' ' )
print ( A__ [ - 1 ] )

