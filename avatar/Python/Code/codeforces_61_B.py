import collections
import heapq
import sys
import math
import itertools
import bisect
from io import BytesIO , IOBase
import os
def valid ( i , j , n , m ) :
    if i < n and i >= 0 and j >= 0 and j < m : return True
    return False
def sumn ( i , n ) :
    return ( n - i ) * ( i + n ) / 2
def sqfun ( a , b , c ) :
    return ( - b + math.sqrt ( b * b - 4 * a * c ) ) / 2 * a
def value ( ) : return tuple ( map ( int , input ( ).split ( ) ) )
def values ( ) : return tuple ( map ( int , sys.stdin.readline ( ).split ( ) ) )
def inlst ( ) : return [ int ( i ) for i in input ( ).split ( ) ]
def inlsts ( ) : return [ int ( i ) for i in sys.stdin.readline ( ).split ( ) ]
def inp ( ) : return int ( input ( ) )
def inps ( ) : return int ( sys.stdin.readline ( ) )
def instr ( ) : return input ( )
def stlst ( ) : return [ i for i in input ( ).split ( ) ]
def f ( s ) :
    r = ''
    for i in s :
        if i not in [ '-' , ';' , '_' ] : r += i.lower ( )
    return r
def solve ( ) :
    l = [ ]
    for i in range ( 3 ) :
        l.append ( f ( input ( ) ) )
    t = itertools.permutations ( l , len ( l ) )
    l = [ ]
    for i in t : l.append ( "".join ( i ) )
    for i in range ( inp ( ) ) :
        if f ( instr ( ) ) in l : print ( 'ACC' )
        else : print ( 'WA' )
if __name__ == "__main__" :
    solve ( )

