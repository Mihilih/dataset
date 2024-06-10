def main_function ( ) :
    n = int ( input ( ) )
    a = [ int ( i ) for i in input ( ).split ( " " ) ]
    current_level = 0
    counter = 0
    counter_turns = - 1
    while counter < len ( a ) :
        counter_turns += 1
        for i in range ( len ( a ) ) :
            if a [ i ] != - 1 and a [ i ] <= counter :
                counter += 1
                a [ i ] = - 1
        a.reverse ( )
    print ( counter_turns )
main_function ( )

