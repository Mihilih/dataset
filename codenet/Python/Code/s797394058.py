from itertools import *

N = int(input())
x = 1

N_list = [x+1 for x in range(N)]

n = list(product(N_list, repeat=3))

m = len(n)

print(m)