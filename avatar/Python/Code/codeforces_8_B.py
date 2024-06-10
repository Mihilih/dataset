record_of_movements = input ( )
x , y = 0 , 0
d_movement = { 'L' : ( 0 , - 1 ) , 'R' : ( 0 , 1 ) , 'U' : ( 1 , 0 ) , 'D' : ( - 1 , 0 ) }
d = { ( x , y ) : '' }
bug = False
for move in record_of_movements :
    temp = ( x , y )
    x += d_movement [ move ] [ 0 ]
    y += d_movement [ move ] [ 1 ]
    if ( x , y ) not in d :
        for step in d_movement :
            if ( x + d_movement [ step ] [ 0 ] , y + d_movement [ step ] [ 1 ] ) != temp and ( x + d_movement [ step ] [ 0 ] , y + d_movement [ step ] [ 1 ] ) in d :
                bug = True
                break
    else :
        bug = True
    if bug :
        break
    d [ x , y ] = ''
if bug :
    print ( 'BUG' )
else :
    print ( 'OK' )

