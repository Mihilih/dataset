import sys
def rs ( ) : return sys.stdin.readline ( ).rstrip ( )
def ri ( ) : return int ( rs ( ) )
def rs_ ( ) : return [ _ for _ in rs ( ).split ( ) ]
def ri_ ( ) : return [ int ( _ ) for _ in rs ( ).split ( ) ]
N = ri ( )
ans = 0
for i in range ( 1 , N + 1 ) :
    ans += i * ( N // i ) * ( N // i + 1 ) // 2
print ( ans )

