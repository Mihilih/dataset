def main ( ) :
    n , m = [ int ( i ) for i in input ( ).split ( ) ]
    round_complexity = [ int ( i ) for i in input ( ).split ( ) ]
    george_complexity = [ int ( i ) for i in input ( ).split ( ) ]
    i = j = 0
    while ( i < n and j < m ) :
        i += 1 * ( round_complexity [ i ] <= george_complexity [ j ] ) ;
        j += 1
    print ( n - i )
if __name__ == '__main__' :
    main ( )

