def main ( ) :
    import itertools
    n , m = map ( int , input ( ).split ( ) )
    li = [ list ( map ( int , input ( ).split ( ) ) ) [ 1 : ] for _ in range ( m ) ]
    p = tuple ( map ( int , input ( ).split ( ) ) )
    q = set ( sum ( li , [ ] ) )
    r = set ( range ( 1 , n + 1 ) )
    v = r - q
    ans = 0
    for i in range ( 0 , len ( q ) + 1 ) :
        for s in itertools.combinations ( q , i ) :
            for u , w in zip ( li , p ) :
                s = set ( s )
                if len ( s & set ( u ) ) % 2 != w :
                    break
            else :
                ans += 2 ** ( len ( v ) )
    print ( ans )
if __name__ == "__main__" :
    main ( )

