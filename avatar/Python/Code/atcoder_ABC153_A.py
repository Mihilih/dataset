h , a = map ( int , input ( ).split ( " " ) )
sho = int ( h / a )
am = int ( h % a )
if am != 0 :
    sho += 1
else :
    pass
print ( sho )

