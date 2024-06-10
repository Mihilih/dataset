n,m=list(map(int,input().split()))
a=[]
b=[]
for i in range(m):
    a1,b1=list(map(int,input().split()))
    a.append(a1)
    b.append(b1)

for i in range(1,n+1):
    print(a.count(i)+b.count(i))