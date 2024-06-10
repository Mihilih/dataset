import sys
input = sys.stdin.readline
N = 368
m = [ 0 ] * N
f = [ 0 ] * N
for i in range ( int ( input ( ) ) ) :
    x , a , b = input ( ) [ : - 1 ].split ( )
    a = int ( a )
    b = int ( b ) + 1
    if x == 'M' :
        m [ a ] += 2
        m [ b ] -= 2
    else :
        f [ a ] += 2
        f [ b ] -= 2
a , b , c = 0 , 0 , 0
for i in range ( N ) :
    a += m [ i ]
    b += f [ i ]
    if min ( a , b ) > c :
        c = min ( a , b )
print ( c )

