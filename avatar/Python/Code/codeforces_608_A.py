import sys
input = sys.stdin.readline
n , s = map ( int , input ( ).split ( ) )
c = 0
for _ in range ( n ) :
    f , t = map ( int , input ( ).split ( ) )
    x = t - ( s - f )
    if x > c :
        c = x
print ( s + c )

