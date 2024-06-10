H , W , N = map ( int , input ( ).split ( ) )
s_r , s_c = map ( int , input ( ).split ( ) )
S = input ( )
T = input ( )
Judge = False
S_L , S_R , S_U , S_D = 0 , 0 , 0 , 0
T_L , T_R , T_U , T_D = 0 , 0 , 0 , 0
for x in range ( N ) :
    if S [ x ] == 'L' :
        S_L += 1
        if S_L - T_R - s_c == 0 :
            Judge = True
    elif S [ x ] == 'R' :
        S_R += 1
        if s_c + ( S_R - T_L ) == W + 1 :
            Judge = True
    elif S [ x ] == 'U' :
        S_U += 1
        if S_U - T_D - s_r == 0 :
            Judge = True
    elif S [ x ] == 'D' :
        S_D += 1
        if s_r + ( S_D - T_U ) == H + 1 :
            Judge = True
    if T [ x ] == 'L' :
        if S_R - T_L + s_c != 1 :
            T_L += 1
    if T [ x ] == 'R' :
        if s_c + ( T_R - S_L ) != W :
            T_R += 1
    if T [ x ] == 'U' :
        if S_D - T_U + s_r != 1 :
            T_U += 1
    if T [ x ] == 'D' :
        if s_r + ( T_D - S_U ) != H :
            T_D += 1
if Judge :
    print ( 'NO' )
else :
    print ( 'YES' )

