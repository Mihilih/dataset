n=int(input())
t=list(map(int,input().split()))
m=int(input())
for i in range(m):
    p,x=map(int,input().split())
    s=0
    for j in range(len(t)):
        if j==p-1:
            s+=x
        else:
            s+=t[j]
    print(s)  
        
    

