x,y,a,b,c=map(int,input().split())
p=sorted([int(i) for i in input().split()],reverse=True)[:x]
q=sorted([int(i) for i in input().split()],reverse=True)[:y]
r=sorted([int(i) for i in input().split()],reverse=True)
pq=sorted(p+q)
for i in range(min(x+y,a+b,c)):
    if pq[i]<r[i]:
        pq[i]=r[i]
print(sum(pq))