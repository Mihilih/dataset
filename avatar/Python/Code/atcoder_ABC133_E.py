from collections import defaultdict
import sys
sys.setrecursionlimit ( 10 ** 7 )
graph = defaultdict ( list )
N , K = map ( int , input ( ).split ( ) )
for i in range ( N - 1 ) :
    a , b = map ( int , input ( ).split ( ) )
    graph [ a - 1 ].append ( b - 1 )
    graph [ b - 1 ].append ( a - 1 )
mod = 10 ** 9 + 7
def dfs ( fro , to , f ) :
    caseNum = f
    colorNum = K - 1 if f == K else K - 2
    for u in graph [ fro ] :
        if u == to :
            continue
        pat = dfs ( u , fro , colorNum )
        if pat == 0 :
            caseNum = 0
            break
        caseNum = caseNum * pat % mod
        colorNum -= 1
    return caseNum
ans = dfs ( 0 , - 1 , K )
print ( ans )

