def main ( ) :
    n , k = list ( map ( int , input ( ).split ( ' ' ) ) )
    elems = list ( map ( int , input ( ).split ( ' ' ) ) )
    all_same = lambda arr : all ( [ x == arr [ 0 ] for x in arr ] )
    if all_same ( elems ) :
        print ( 0 )
        return
    if k == 1 :
        print ( - 1 )
        return
    if not all_same ( elems [ k - 1 : ] ) :
        print ( - 1 )
        return
    target = elems [ - 1 ]
    to_delete = elems [ 0 : k - 1 ]
    while to_delete and to_delete [ - 1 ] == target :
        to_delete.pop ( )
    print ( len ( to_delete ) )
if __name__ == "__main__" :
    main ( )

