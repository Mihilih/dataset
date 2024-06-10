import sys
def I ( ) : return ( int ( sys.stdin.readline ( ) ) )
def LI ( ) : return ( [ int ( x ) for x in sys.stdin.readline ( ).split ( ) ] )
def main ( ) :
    N = I ( )
    S = sorted ( LI ( ) , reverse = True )
    flag = [ True ] * len ( S )
    cur = [ ]
    cur.append ( S [ 0 ] )
    flag [ 0 ] = False
    for i in range ( N ) :
        j = 0
        jM = len ( cur )
        for k in range ( len ( S ) ) :
            if flag [ k ] and S [ k ] < cur [ j ] :
                cur.append ( S [ k ] )
                j += 1
                flag [ k ] = False
                if j == jM :
                    break
        else :
            return ( "No" )
        cur.sort ( reverse = True )
    return ( "Yes" )
if __name__ == "__main__" :
    print ( main ( ) )

