from collections import defaultdict
N , K = map ( int , input ( ).split ( ) )
L = list ( map ( int , input ( ).split ( ) ) )
L.insert ( 0 , - 1 )
path = [ 1 ]
ind = 0
count = 0
x = 1
t = - 1
flag = False
Hash = defaultdict ( lambda : 0 )
for i in range ( N + 1 ) :
    ne = L [ x ]
    if Hash [ ne ] :
        flag = True
        t = Hash [ ne ]
        break
    path.append ( ne )
    ind += 1
    Hash [ ne ] = ind
    x = ne
if flag == True :
    loop = path [ t : : ]
    if K < ( len ( path ) ) :
        print ( path [ K ] )
    else :
        K = K - len ( path )
        K = K % len ( loop )
        print ( loop [ K ] )
else :
    print ( path [ K - 1 ] )

