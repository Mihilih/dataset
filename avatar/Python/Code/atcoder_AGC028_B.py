import sys
input = sys.stdin.readline
import numpy as np
MOD = 10 ** 9 + 7
N = int ( input ( ) )
M = 10 ** 6
A = np.array ( input ( ).split ( ) , dtype = np.int64 )
Nsq = 10 ** 3
fact = np.arange ( M , dtype = np.int64 ).reshape ( Nsq , Nsq )
fact [ 0 , 0 ] = 1
for n in range ( 1 , Nsq ) :
    fact [ : , n ] *= fact [ : , n - 1 ] ; fact [ : , n ] %= MOD
for n in range ( 1 , Nsq ) :
    fact [ n ] *= fact [ n - 1 , - 1 ] ; fact [ n ] %= MOD
fact = fact.ravel ( )
j = np.arange ( N )
inv = np.array ( [ pow ( i + 1 , MOD - 2 , MOD ) for i in range ( N ) ] )
inv = np.cumsum ( inv ) % MOD
temp = inv [ j ] + inv [ N - 1 - j ] - 1
ans = ( A * temp % MOD ).sum ( )
ans %= MOD
ans *= fact [ N ]
ans %= MOD
print ( ans )

