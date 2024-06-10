firstline = int ( input ( ) )
total = 0
memory = [ ]
for x in range ( firstline ) :
    A , G = list ( map ( int , input ( ).split ( ) ) )
    if total + A <= 500 :
        total += A
        memory.append ( "A" )
    else :
        total -= G
        memory.append ( "G" )
print ( "".join ( memory ) )

