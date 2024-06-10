N,L= map(int,input().split())
aji = []
for i in range(1,N+1):
    aji.append(L+i-1)
if min(aji) >= 0:
    aji.pop(aji.index(min(aji)))
elif max(aji) <=0:
    aji.pop(aji.index(max(aji)))
else:
    aji.pop(aji.index(min(aji,key=abs)))
print(sum(aji))
