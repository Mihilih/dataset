n = int ( input ( ) )
x = list ( int ( i ) for i in input ( ).split ( ) )
a = [ ]
b = [ ]
for i in range ( 0 , n ) :
    if i % 2 == 0 :
        a.append ( x [ i ] )
    else :
        b.append ( x [ i ] )
cnta = [ 0 ] * ( 100002 + 1 )
cntb = [ 0 ] * ( 100002 + 1 )
vala = 0
vala1 = 0
maxCnta = 0
maxCnta1 = 0
for i in a :
    cnta [ i ] += 1
for i in a :
    if maxCnta < cnta [ i ] :
        vala = i
        maxCnta = cnta [ i ]
for i in a :
    if maxCnta1 < cnta [ i ] and vala != i :
        maxCnta1 = cnta [ i ]
        vala1 = i
valb = 0
valb1 = 0
maxCntb = 0
maxCntb1 = 0
for i in b :
    cntb [ i ] += 1
for i in b :
    if maxCntb < cntb [ i ] :
        valb = i
        maxCntb = cntb [ i ]
for i in b :
    if maxCntb1 < cntb [ i ] and valb != i :
        maxCntb1 = cntb [ i ]
        valb1 = i
if valb != vala :
    res = 0
    for i in a :
        if i != vala :
            res += 1
    for i in b :
        if i != valb :
            res += 1
    print ( res )
else :
    resa = 0
    resb = 0
    resa1 = 0
    resb1 = 0
    for i in a :
        if i != vala :
            resa += 1
        if i != vala1 :
            resa1 += 1
    for i in b :
        if i != valb :
            resb += 1
        if i != valb1 :
            resb1 += 1
    print ( min ( resa + resb1 , resa1 + resb ) )
    

