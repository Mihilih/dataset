n = int ( input ( ) )
q = [ ]
count = 0
for i in range ( n ) :
    a = input ( ).split ( )
    q.append ( a )
for j in q :
    for k in q :
        if k == j :
            continue
        elif j [ 0 ] == k [ len ( k ) - 1 ] :
            count += 1
        else :
            continue
print ( count )

