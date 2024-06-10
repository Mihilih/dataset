def substract ( a , b ) :
    if a > b :
        total = 0
        while a > 0 and b > 0 :
            total += int ( a / b )
            a = a % b
            if a > 0 :
                total += int ( b / a )
                b = b % a
        return total
    if a < b :
        total = 0
        while a > 0 and b > 0 :
            total += int ( b / a )
            b = b % a
            if b > 0 :
                total += int ( a / b )
                a = a % b
        return total
    if a == b :
        return 1
n = int ( input ( ) )
lst = [ ]
for i in range ( 0 , n ) :
    a , b = map ( int , input ( ).split ( ) )
    lst.append ( substract ( a , b ) )
for i in lst :
    print ( i )

