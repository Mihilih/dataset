from collections import Counter , defaultdict , deque
from heapq import heappop , heappush , heapify
import sys , bisect , math , itertools , pprint , fractions
sys.setrecursionlimit ( 10 ** 8 )
mod = 10 ** 9 + 7
INF = float ( 'inf' )
def inp ( ) : return int ( sys.stdin.readline ( ) )
def inpl ( ) : return list ( map ( int , sys.stdin.readline ( ).split ( ) ) )
n , ta , ao = inpl ( )
ta -= 1 ; ao -= 1
g = [ [ ] for i in range ( n ) ]
for i in range ( n - 1 ) :
    a , b = inpl ( )
    g [ a - 1 ].append ( b - 1 )
    g [ b - 1 ].append ( a - 1 )
ta_dist = [ None ] * n
ta_dist [ ta ] = 0
ao_dist = [ None ] * n
ao_dist [ ao ] = 0
def ta_dfs ( node ) :
    for v in g [ node ] :
        if ta_dist [ v ] != None : continue
        ta_dist [ v ] = ta_dist [ node ] + 1
        ta_dfs ( v )
def ao_dfs ( node ) :
    for v in g [ node ] :
        if ao_dist [ v ] != None : continue
        ao_dist [ v ] = ao_dist [ node ] + 1
        ao_dfs ( v )
ao_dfs ( ao )
ta_dfs ( ta )
res = 0
for i in range ( n ) :
    if ta_dist [ i ] > ao_dist [ i ] : continue
    res = max ( res , ao_dist [ i ] )
print ( res - 1 )

