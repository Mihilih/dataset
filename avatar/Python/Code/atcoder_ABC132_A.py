S = input ( )
from collections import Counter
c = Counter ( S )
Sa = set ( list ( S ) )
if len ( Sa ) != 2 :
    print ( "No" )
    exit ( )
for i in Sa :
    if c [ i ] != 2 :
        print ( "No" )
        exit ( )
print ( "Yes" )

