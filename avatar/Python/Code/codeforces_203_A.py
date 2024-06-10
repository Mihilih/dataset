xxs = input ( ).split ( " " )
x , t , a , b , da , db = int ( xxs [ 0 ] ) , int ( xxs [ 1 ] ) , int ( xxs [ 2 ] ) , int ( xxs [ 3 ] ) , int ( xxs [ 4 ] ) , int ( xxs [ 5 ] )
def main ( ) :
    if x == 0 :
        print ( "YES" )
        return "Result Found"
    a_time = min ( [ a // da , t - 1 ] )
    b_time = min ( [ b // db , t - 1 ] )
    for i in range ( a_time + 1 ) :
        for j in range ( b_time + 1 ) :
            if a - da * i == x or b - db * j == x :
                print ( "YES" )
                return "Result Found"
            if ( a - da * i ) + ( b - db * j ) == x :
                print ( "YES" )
                return "Result Found"
    return "Result Not Found"
ff = main ( )
if ff == "Result Not Found" :
    print ( "NO" )

