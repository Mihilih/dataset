import sys
input = sys.stdin.readline
from collections import Counter
n = int ( input ( ) )
w = Counter ( map ( int , input ( ).split ( ) ) )
c = 0
for i in w :
    if i == 0 :
        c += w [ i ] * ( w [ i ] - 1 )
    else :
        if - i in w :
            c += w [ i ] * w [ - i ]
print ( c // 2 )

