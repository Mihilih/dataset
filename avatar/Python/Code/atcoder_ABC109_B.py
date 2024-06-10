from collections import defaultdict
n = int ( input ( ) )
s = defaultdict ( lambda : 0 )
l = list ( [ input ( ) for i in range ( n ) ] )
f = 'Yes'
i = - 1
for v in l :
    s [ v ] += 1
    if s [ v ] >= 2 :
        f = 'No'
    if i != - 1 and l [ i ] [ - 1 ] != v [ 0 ] :
        f = 'No'
    i += 1
print ( f )

