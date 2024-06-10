def main ( ) :
    input ( )
    pieces = tuple ( zip ( map ( int , input ( ).split ( ) ) , input ( ) ) )
    return Bob_sMaxStrength ( pieces )
def Bob_sMaxStrength ( pieces ) :
    pScore = sScore = pMaxScore = sMaxScore = sum ( piece [ 0 ] for piece in pieces if piece [ 1 ] == 'B' )
    for piece in pieces :
        if piece [ 1 ] == 'A' :
            pScore += piece [ 0 ]
            if pScore > pMaxScore :
                pMaxScore = pScore
        else :
            pScore -= piece [ 0 ]
    for i in range ( len ( pieces ) - 1 , - 1 , - 1 ) :
        if pieces [ i ] [ 1 ] == 'A' :
            sScore += pieces [ i ] [ 0 ]
            if sScore > sMaxScore :
                sMaxScore = sScore
        else :
            sScore -= pieces [ i ] [ 0 ]
    if pMaxScore > sMaxScore :
        return pMaxScore
    return sMaxScore
if __name__ == '__main__' :
    print ( main ( ) )

