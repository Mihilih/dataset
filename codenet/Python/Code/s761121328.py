N=int(input())
A=list(map(int,input().split()))
s=A[0]^A[1]
for i in range(2,N):
    s=s^A[i]

B=[0]*N
for i in range(N):
    B[i]=s^A[i]

L=[str(a) for a in B]
L=" ".join(L)
print(L)
