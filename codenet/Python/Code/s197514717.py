
ABC = list(map(int,input().split()))

A = ABC[0]
B = ABC[1]
C = ABC[2]

print (max([ 10*A+B+C , 10*B+C+A , 10*C+A+B ]))