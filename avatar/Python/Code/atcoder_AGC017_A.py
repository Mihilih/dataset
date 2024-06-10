N , P = map ( int , input ( ).split ( ) )
def combi ( N , K ) :
    a = 1
    for i in range ( K ) :
        a *= N - i
    for j in range ( K ) :
        a /= j + 1
    return a
ans = 0
lis = list ( map ( int , input ( ).split ( ) ) )
ls = [ ]
for a in lis :
    ls.append ( a % 2 )
one = ls.count ( 1 )
zero = ls.count ( 0 )
pattern_a = 0
pattern_b = 0
for j in range ( zero + 1 ) :
    pattern_b += combi ( zero , j )
time = 0
while time <= one :
    if time % 2 == P :
        pattern_a += combi ( one , time )
    time += 1
print ( int ( pattern_a * pattern_b ) )

