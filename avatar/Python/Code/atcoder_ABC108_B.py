p = input ( ).split ( " " )
x1 = int ( p [ 0 ] )
y1 = int ( p [ 1 ] )
x2 = int ( p [ 2 ] )
y2 = int ( p [ 3 ] )
DIF1 = x2 - x1
DIF2 = y2 - y1
x3 = x2 - DIF2
y3 = y2 + DIF1
x4 = x1 - DIF2
y4 = y1 + DIF1
print ( str ( x3 ) + " " + str ( y3 ) + " " + str ( x4 ) + " " + str ( y4 ) )

