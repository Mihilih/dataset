N = int ( input ( ) )
V = input ( ).split ( " " )
V = [ int ( i ) for i in V ]
C = input ( ).split ( " " )
C = [ int ( i ) for i in C ]
list = [ 0 ]
ans = 0
X = 0
Y = 0
for i in range ( N ) :
    if V [ i ] - C [ i ] > 0 :
        X = V [ i ]
        Y = C [ i ]
        list.append ( X - Y )
print ( sum ( list ) )

