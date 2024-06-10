import fractions
import math
n , num = map ( int , input ( ).split ( ) )
num_set = set ( map ( lambda x : int ( x ) , input ( ).split ( ) ) )
two_times_set = set ( )
for i in num_set :
    for j in range ( 1 , 30 ) :
        i //= 2
        if i % 2 != 0 :
            two_times_set.add ( j )
            break
    if len ( two_times_set ) != 1 :
        print ( 0 )
        break
else :
    num_list = list ( num_set )
    lcm = num_list [ 0 ]
    for i in range ( 1 , len ( num_list ) ) :
        lcm = lcm * num_list [ i ] // fractions.gcd ( lcm , num_list [ i ] )
    print ( ( num - lcm // 2 ) // ( lcm ) + 1 )

