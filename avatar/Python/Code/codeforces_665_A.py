a , at = map ( int , input ( ).split ( ) )
b , bt = map ( int , input ( ).split ( ) )
t1 , t2 = map ( int , input ( ).split ( ':' ) )
st = t2 + ( t1 - 5 ) * 60
fin = st + at
now = 0
ans = 0
while now < fin and now < 1140 :
    if now + bt > st :
        ans += 1
    now += b
print ( ans )

