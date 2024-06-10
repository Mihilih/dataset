def main ( ) :
    input ( )
    return nPairsWithCommonFX ( map ( int , input ( ).split ( ) ) )
def nPairsWithCommonFX ( sequence ) :
    storage = { }
    FXs = [ ]
    for value in sequence :
        y = f ( value )
        if y not in storage :
            storage [ y ] = [ value ]
            FXs.append ( y )
        else :
            storage [ y ].append ( value )
    return ( sum ( len ( storage [ y ] ) * len ( storage [ y ] ) for y in FXs ) - sum ( len ( storage [ y ] ) for y in FXs ) ) // 2
def f ( n ) :
    y = 1
    while n != 1 :
        if n % 2 :
            y += 1
        n //= 2
    return y
if __name__ == '__main__' :
    print ( main ( ) )

