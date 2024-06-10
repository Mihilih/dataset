s , t = input ( ) , input ( )
freqs = dict ( )
freqt = dict ( )
yay , whoops = 0 , 0
for letra in s :
    if letra in freqs :
        freqs [ letra ] += 1
    else :
        freqs [ letra ] = 1
for letra in t :
    if letra in freqt :
        freqt [ letra ] += 1
    else :
        freqt [ letra ] = 1
for letra in freqs.keys ( ) :
    while ( freqs [ letra ] > 0 and letra in freqt and freqt [ letra ] > 0 ) :
        yay += 1
        freqs [ letra ] -= 1
        freqt [ letra ] -= 1
for letra in freqs.keys ( ) :
    while ( freqs [ letra ] > 0 ) :
        if letra.islower ( ) and letra.upper ( ) in freqt.keys ( ) and freqt [ letra.upper ( ) ] > 0 :
            whoops += 1
            freqs [ letra ] -= 1
            freqt [ letra.upper ( ) ] -= 1
        elif letra.isupper ( ) and letra.lower ( ) in freqt.keys ( ) and freqt [ letra.lower ( ) ] > 0 :
            whoops += 1
            freqs [ letra ] -= 1
            freqt [ letra.lower ( ) ] -= 1
        else :
            break ;
print ( yay , whoops )

