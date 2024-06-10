a = input ( )
vo = [ 'a' , 'e' , 'i' , 'o' , 'u' , 'y' , 'A' , 'E' , 'I' , 'O' , 'U' , 'Y' ]
for i in range ( len ( a ) - 1 , - 1 , - 1 ) :
    if ( a [ i ] == ' ' or a [ i ] == '?' ) :
        continue
    else :
        if ( a [ i ] in vo ) :
            print ( "YES" )
        else :
            print ( "NO" )
        break

