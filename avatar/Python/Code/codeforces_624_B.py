import sys
input = sys.stdin.readline
n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
pre = float ( 'inf' )
ans = 0
a.sort ( reverse = True )
for j in range ( n ) :
    ans += max ( 0 , min ( pre - 1 , a [ j ] ) )
    pre = max ( 0 , min ( pre - 1 , a [ j ] ) )
print ( ans )

