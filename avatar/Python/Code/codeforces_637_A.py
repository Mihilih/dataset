import sys
input = sys.stdin.readline
from collections import Counter
n = int ( input ( ) )
s = input ( ) [ : - 1 ].split ( )
w = Counter ( s )
s = s [ : : - 1 ]
c , a = - 1 , 0
for i in w :
    if w [ i ] == max ( w.values ( ) ) :
        if s.index ( i ) > c :
            a = i
            c = s.index ( i )
print ( a )

