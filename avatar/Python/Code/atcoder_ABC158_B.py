import sys
input = sys.stdin.readline
def I ( ) : return int ( input ( ) )
def MI ( ) : return map ( int , input ( ).split ( ) )
def LI ( ) : return list ( map ( int , input ( ).split ( ) ) )
def main ( ) :
    mod = 10 ** 9 + 7
    N , A , B = MI ( )
    ans = 0
    rep = N // ( A + B )
    ans += rep * A
    res = N - rep * ( A + B )
    ans += min ( res , A )
    print ( ans )
main ( )

