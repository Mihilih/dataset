N,M=map(int,input().split())
*A,=map(int,input().split())
A=sorted(A)

while M:
    A[-1]//=2
    M-=1
    i=-2
    while M and (-N<=i and A[i]>=A[-1]):
        A[i]//=2
        M-=1
        i-=1
    A.sort()

print(sum(A))