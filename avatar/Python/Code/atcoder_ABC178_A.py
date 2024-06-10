import os
from sys import stdin , stdout
def solve ( tc ) :
    a = int ( stdin.readline ( ).strip ( ) )
    print ( 1 if a == 0 else 0 )
tcs = 1
tc = 1
while tc <= tcs :
    solve ( tc )
    tc += 1

