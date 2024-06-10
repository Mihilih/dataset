n = int ( input ( ) )
m = input ( ).split ( )
possible = True
for i in set ( m ) :
    if m.count ( i ) >= n / 2 + 1 :
        possible = False
        break
print ( 'YES' if possible else 'NO' )

