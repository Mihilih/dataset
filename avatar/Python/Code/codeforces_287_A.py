t = [ ]
for i in range ( 4 ) :
    l = list ( map ( str , input ( ) ) )
    t.append ( l )
black = 0
white = 0
correct = 0
for i in range ( 3 ) :
    for j in range ( 3 ) :
        if t [ i ] [ j ] == '#' :
            black += 1
        else :
            white += 1
        if t [ i ] [ j + 1 ] == '#' :
            black += 1
        else :
            white += 1
        if t [ i + 1 ] [ j ] == '#' :
            black += 1
        else :
            white += 1
        if t [ i + 1 ] [ j + 1 ] == '#' :
            black += 1
        else :
            white += 1
        if ( black == 0 or black == 3 or white == 0 or white == 3 or white == 4 or black == 4 ) :
            correct = 1
            break
        black = 0
        white = 0
if correct == 1 :
    print ( 'YES' )
else :
    print ( 'NO' )

