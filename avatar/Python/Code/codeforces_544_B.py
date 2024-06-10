n , k = map ( int , input ( ).split ( ) )
x = 0
if k <= max ( n ** 2 // 2 , n ** 2 - ( n ** 2 // 2 ) ) :
    print ( 'YES' )
    for i in range ( n ) :
        for j in range ( n ) :
            if i % 2 == j % 2 and x < k :
                print ( 'L' , end = '' )
                x += 1
            else : print ( 'S' , end = '' )
        print ( )
else : print ( 'NO' )

