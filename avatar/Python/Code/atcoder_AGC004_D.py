import sys
sys.setrecursionlimit ( 10 ** 6 )
def dfs ( links , n , k , v , p ) :
    height_from_leaf = 0
    cut_count = 0
    for u in links [ v ] :
        if u == 0 :
            continue
        hgt , cut = dfs ( links , n , k , u , v )
        height_from_leaf = max ( height_from_leaf , hgt )
        cut_count += cut
    height_from_leaf += 1
    if p != 0 and height_from_leaf == k :
        height_from_leaf = 0
        cut_count += 1
    return height_from_leaf , cut_count
n , k , * aaa = map ( int , sys.stdin.buffer.read ( ).split ( ) )
links = [ set ( ) for _ in range ( n ) ]
for i , a in enumerate ( aaa ) :
    a -= 1
    links [ a ].add ( i )
_ , ans = dfs ( links , n , k , 0 , 0 )
if aaa [ 0 ] != 1 :
    ans += 1
print ( ans )

