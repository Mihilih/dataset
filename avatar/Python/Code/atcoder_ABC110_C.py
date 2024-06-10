import collections
def run ( s , t ) :
    ss = sorted ( list ( collections.Counter ( s ).values ( ) ) )
    tt = sorted ( list ( collections.Counter ( t ).values ( ) ) )
    if ss == tt :
        return 'Yes'
    else :
        return 'No'
def main ( ) :
    s = input ( )
    t = input ( )
    print ( run ( s , t ) )
if __name__ == '__main__' :
    main ( )

