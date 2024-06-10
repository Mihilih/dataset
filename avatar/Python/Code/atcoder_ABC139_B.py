a , b = map ( int , input ( ).split ( ) )
hole = 1
i = 0
check = True
while check :
    if hole >= b :
        check = False
    else :
        hole = a * ( i + 1 ) - i
        i += 1
print ( i )

