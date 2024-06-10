N,D=map(int,input().split())
mat=[]
for d in range(N):
     mat.append([int(x) for x in input().split()])

import math
c=0
for i in range(len(mat)-1):
    for j in range(i+1,len(mat)):
        dist=math.sqrt(sum([(x-y)**2 for x,y in zip(mat[i],mat[j])]))
        if int(dist)==dist:
                c+=1
print(c)