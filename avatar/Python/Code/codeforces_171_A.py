import sys
input = sys.stdin.readline
a , b = input ( ) [ : - 1 ].split ( )
x = max ( len ( a ) , len ( b ) )
a = a.rjust ( x , '0' )
b = b.ljust ( x , '0' )
s = ''
c = 0
for i in range ( x ) :
    d = int ( b [ i ] ) + int ( a [ x - i - 1 ] ) + c
    if d > 9 :
        s += str ( d ) [ 1 ]
        c = 1
    else :
        s += str ( d )
        c = 0
if c == 1 :
    s += '1'
print ( int ( s [ : : - 1 ] ) )

