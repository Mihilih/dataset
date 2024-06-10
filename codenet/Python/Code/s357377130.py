A,B,K = map(int,input().split())
if A+K-1>=B-K+1:
    while A<=B:
        print(A)
        A+=1
else:
    i=0
    while i<=K-1:
        print(A+i)
        i+=1
    while B-K+1<=B:
        print(B-K+1)
        K-=1
