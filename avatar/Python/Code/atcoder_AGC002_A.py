import bisect , collections , copy , heapq , itertools , math , numpy , string
import sys
def S ( ) : return sys.stdin.readline ( ).rstrip ( )
def I ( ) : return int ( sys.stdin.readline ( ).rstrip ( ) )
def LI ( ) : return list ( map ( int , sys.stdin.readline ( ).rstrip ( ).split ( ) ) )
def LS ( ) : return list ( sys.stdin.readline ( ).rstrip ( ).split ( ) )
a , b = LI ( )
if a > 0 :
    print ( 'Positive' )
elif a <= 0 and b >= 0 :
    print ( 'Zero' )
else :
    if ( a + b ) % 2 == 0 :
        print ( 'Negative' )
    else :
        print ( 'Positive' )

