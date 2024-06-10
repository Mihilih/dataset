import numpy as np
h , w = map ( int , input ( ).split ( ) )
graph = [ [ 0 if i == '#' else float ( 'inf' ) for i in list ( input ( ) ) ] for _ in range ( h ) ]
graph = np.array ( graph )
for x in range ( w - 1 ) :
    graph [ : , x + 1 ] = np.minimum ( graph [ : , x ] + 1 , graph [ : , x + 1 ] )
for x in range ( w - 1 , 0 , - 1 ) :
    graph [ : , x - 1 ] = np.minimum ( graph [ : , x ] + 1 , graph [ : , x - 1 ] )
for y in range ( h - 1 ) :
    graph [ y + 1 , : ] = np.minimum ( graph [ y , : ] + 1 , graph [ y + 1 , : ] )
for y in range ( h - 1 , 0 , - 1 ) :
    graph [ y - 1 , : ] = np.minimum ( graph [ y , : ] + 1 , graph [ y - 1 , : ] )
print ( int ( np.max ( graph ) ) )

