x , y = list ( map ( int , input ( ).split ( ) ) )
a = 0
while x >= 0 and y >= 22 or x >= 1 and y >= 12 or x >= 2 and y >= 2 :
    if a :
        if y >= 22 :
            y -= 22
        elif x >= 1 and y >= 12 :
            x -= 1
            y -= 12
        else :
            x -= 2
            y -= 2
    else :
        if x >= 2 and y >= 2 :
            x -= 2
            y -= 2
        elif x >= 1 and y >= 12 :
            x -= 1
            y -= 12
        else :
            y -= 22
    a = 1 - a
print ( [ 'Ciel' , 'Hanako' ] [ 1 - a ] )

