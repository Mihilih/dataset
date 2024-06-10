import re
candeleIntere , b = map ( int , input ( ).split ( ) )
s = 0
restoSciolte = 0
while candeleIntere > 0 or restoSciolte >= b :
    candeleIntere += restoSciolte // b
    restoSciolte %= b
    s += candeleIntere
    restoSciolte += candeleIntere % b
    candeleIntere //= b
print ( s )

