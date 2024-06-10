n = int ( input ( ) )
cake = [ ]
happiness = 0
chocCount = 0
nfat = 1
for i in range ( n ) :
    line = str ( input ( ) )
    cake.append ( line )
    for j in line :
        if ( j == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
posCount = 0
for j in range ( n ) :
    for i in range ( n ) :
        if ( cake [ i ] [ j ] == 'C' ) :
            chocCount += 1
    if ( chocCount > 1 ) :
        for i in range ( chocCount , chocCount - 2 , - 1 ) :
            nfat *= i
        happiness += nfat / 2
    nfat = 1
    chocCount = 0
print ( int ( happiness ) )

