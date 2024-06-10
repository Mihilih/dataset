def main ( ) :
    K = int ( input ( ) )
    S = input ( )
    if len ( S ) <= K :
        return S
    return S [ : K ] + '...'
if __name__ == '__main__' :
    print ( main ( ) )

