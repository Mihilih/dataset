n = int ( input ( ) )
a = list ( map ( int , input ( ).split ( ) ) )
b = list ( map ( int , input ( ).split ( ) ) )
c = list ( map ( int , input ( ).split ( ) ) )
x = 0
y = 0
z = 0
for i in a :
    x += i
for i in b :
    y += i
for i in c :
    z += i
print ( abs ( x - y ) )
print ( abs ( y - z ) )

