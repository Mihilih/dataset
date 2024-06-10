import os , sys , io , math
from array import array
from math import *
I = lambda : [ * map ( int , sys.stdin.readline ( ).split ( ) ) ]
IS = lambda : input ( )
IN = lambda : int ( input ( ) )
IF = lambda : float ( input ( ) )
n = IN ( )
l = I ( )
f = 1
l.sort ( )
c = 0
for i in l :
    if i > c : c += 1
print ( c + 1 )

