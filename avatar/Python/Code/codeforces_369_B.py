def get_nums ( num , t ) :
    return [ t // num + 1 if i in range ( t % num ) else t // num for i in range ( num ) ]
n , k , l , r , sa , sk = map ( int , input ( ).split ( ) )
ans = get_nums ( k , sk ) + get_nums ( n - k , sa - sk )
print ( ' '.join ( map ( str , ans ) ) )

