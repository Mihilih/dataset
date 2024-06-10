a , b , t = map ( int , input ( ).split ( ) )
cookie = 0
time = a
while time <= t + 0.5 :
    cookie += b
    time += a
print ( cookie )

