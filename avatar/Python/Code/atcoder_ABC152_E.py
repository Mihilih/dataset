from fractions import gcd
def lcm ( a , b ) :
    return a * b / gcd ( a , b )
MOD = 10 ** 9 + 7
N = int ( input ( ) )
A = list ( map ( int , input ( ).split ( ) ) )
_lcm = 1
for a in A :
    _lcm = _lcm * a // gcd ( _lcm , a )
ans = _lcm * sum ( [ pow ( s , MOD - 2 , MOD ) for s in A ] ) % MOD
print ( int ( ans % MOD ) )

