import sys
def solve ( S : str , T : str , A : int , B : int , U : str ) :
    if S == U :
        A -= 1
    if T == U :
        B -= 1
    print ( A , B )
    return
def main ( ) :
    def iterate_tokens ( ) :
        for line in sys.stdin :
            for word in line.split ( ) :
                yield word
    tokens = iterate_tokens ( )
    S = next ( tokens )
    T = next ( tokens )
    A = int ( next ( tokens ) )
    B = int ( next ( tokens ) )
    U = next ( tokens )
    solve ( S , T , A , B , U )
if __name__ == '__main__' :
    main ( )

