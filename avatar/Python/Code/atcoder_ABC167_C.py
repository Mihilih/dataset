import numpy as np
import itertools
n , m , x = list ( map ( int , input ( ).split ( ) ) )
c = np.array ( [ list ( map ( int , input ( ).split ( ) ) ) for _ in range ( n ) ] )
pre = np.arange ( n )
l = [ ]
rem = [ ]
ans = 0
for i in pre + 1 :
    for j in itertools.combinations ( pre , i ) :
        l.append ( list ( j ) )
for i in range ( 1 , m + 1 ) :
    for j , k in enumerate ( l ) :
        ca = 0
        for ii in k :
            ca += c [ ii , i ]
        if ca < x :
            rem.insert ( 0 , j )
        else :
            pass
    if len ( rem ) > 0 :
        for j in rem :
            l.pop ( j )
        rem = [ ]
    if len ( l ) == 0 :
        print ( - 1 )
        break
else :
    for i in l :
        ca = 0
        for j in i :
            ca += c [ j , 0 ]
        if ans == 0 :
            ans = ca
        else :
            ans = min ( ans , ca )
    print ( ans )

