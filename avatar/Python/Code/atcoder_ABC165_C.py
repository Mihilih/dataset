import sys
def solve ( N : int , M : int , Q : int , a : "List[int]" , b : "List[int]" , c : "List[int]" , d : "List[int]" ) :
    res = 0
    def rec ( A ) :
        nonlocal res
        if len ( A ) == N :
            ans = 0
            for i in range ( Q ) :
                if A [ b [ i ] - 1 ] - A [ a [ i ] - 1 ] == c [ i ] :
                    ans += d [ i ]
            res = max ( res , ans )
            return
        last_max = 1 if len ( A ) == 0 else A [ - 1 ]
        for i in range ( last_max , M + 1 ) :
            rec ( A + [ i ] )
    rec ( [ ] )
    print ( res )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys.stdin :
            for word in line.split ( ) :
                yield word
    tokens = iterate_tokens ( )
    N = int ( next ( tokens ) )
    M = int ( next ( tokens ) )
    Q = int ( next ( tokens ) )
    a = [ int ( ) ] * ( Q )
    b = [ int ( ) ] * ( Q )
    c = [ int ( ) ] * ( Q )
    d = [ int ( ) ] * ( Q )
    for i in range ( Q ) :
        a [ i ] = int ( next ( tokens ) )
        b [ i ] = int ( next ( tokens ) )
        c [ i ] = int ( next ( tokens ) )
        d [ i ] = int ( next ( tokens ) )
    solve ( N , M , Q , a , b , c , d )
if __name__ == '__main__' :
    main ( )

