import math
N = int ( input ( ) )
S = input ( )
def calculate ( n , s ) :
    arr = list ( s )
    rNum = arr.count ( "R" )
    gNum = arr.count ( "G" )
    bNum = arr.count ( "B" )
    sum = 0
    for step in range ( 1 , math.ceil ( n / 2 ) + 1 ) :
        for i in range ( n - 2 * step ) :
            s = "".join ( [ arr [ i ] , arr [ i + step ] , arr [ i + step * 2 ] ] )
            if s == "RGB" or s == "RBG" or s == "BGR" or s == "BRG" or s == "GBR" or s == "GRB" :
                sum = sum + 1
    print ( rNum * gNum * bNum - sum )
calculate ( N , S )

