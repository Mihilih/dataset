na = lambda : list ( map ( int , input ( ).split ( ) ) )
n , x = na ( )
a = sorted ( na ( ) )
ans = 0
if a [ 0 ] > x :
    print ( 0 )
    exit ( )
for i in a :
    if i > x :
        x = 0
        break
    x -= i
    ans += 1
if x != 0 :
    ans -= 1
print ( ans )

