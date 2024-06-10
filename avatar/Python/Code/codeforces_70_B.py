import re
n = int ( input ( ) )
ans , sumL = 1 , 0
for s in re.split ( "[.?!]" , input ( ) ) :
    s = s.strip ( ) + '.'
    L = len ( s )
    if L > 1 :
        if L > n :
            print ( "Impossible" )
            exit ( )
        if sumL + L + ( sumL > 0 ) > n :
            ans += 1
            sumL = L
        else :
            sumL = sumL + L + ( sumL > 0 )
print ( ans )

