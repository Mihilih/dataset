n,k=map(int,input().split())
a=[i for i in input()]
c=[0]*n
for i in range(1,n):
    if a[i]=="C" and a[i-1]=="A":
        c[i]=c[i-1]+1
    else:
        c[i]=c[i-1]
for w in range(k):
    l,r=map(int,input().split())
    print(c[r-1]-c[l-1])