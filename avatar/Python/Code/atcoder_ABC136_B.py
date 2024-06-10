def main ( ) :
    N = int ( input ( ) )
    i = 1
    ans = 0
    while 10 ** i <= N :
        ans += ( ( 10 ** i ) - ( 10 ** ( i - 1 ) ) )
        i += 2
    ans += max ( 0 , N - 10 ** ( i - 1 ) + 1 )
    print ( ans )
if __name__ == "__main__" :
    main ( )

