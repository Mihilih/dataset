import os , sys , io , math
from tokenize import Triple
from math import *
I = lambda : [ * map ( int , sys.stdin.readline ( ).split ( ) ) ]
IS = lambda : input ( )
IN = lambda : int ( input ( ) )
IF = lambda : float ( input ( ) )
n = IN ( )
id = 0
l , r = map ( int , input ( ).split ( ) )
for i in range ( 1 , n ) :
    li , ri = map ( int , input ( ).split ( ) )
    if li <= l and r <= ri : id = i
    elif li < l or r < ri : id = n
    l = min ( l , li )
    r = max ( r , ri )
print ( - 1 if id == n else id + 1 )

