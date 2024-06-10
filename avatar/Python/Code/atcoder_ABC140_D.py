from _collections import deque
def parser ( ) :
    while 1 :
        data = list ( input ( ).split ( ' ' ) )
        for number in data :
            if len ( number ) > 0 :
                yield ( number )
input_parser = parser ( )
def gw ( ) :
    global input_parser
    return next ( input_parser )
def gi ( ) :
    data = gw ( )
    return int ( data )
MOD = int ( 1e9 + 7 )
import numpy
import scipy
from collections import deque
N = gi ( )
K = gi ( )
S = gw ( )
seg_cnt = 0
for i in range ( 0 , N - 1 ) :
    if S [ i ] != S [ i + 1 ] :
        seg_cnt += 1
cur_happy = N - 1 - seg_cnt
if 2 * K >= seg_cnt :
    ans = N - 1
else :
    ans = cur_happy + 2 * K
print ( ans )

