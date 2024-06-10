N=int(input())
A=[int(x) for x in input().split()]
ans=abs(A[-1])
A=[0]+A+[0]
diff=[0 for x in range(N)]
for i in range(1,N+1):
  dif=abs(A[i]-A[i-1])+abs(A[i]-A[i+1])-abs(A[i-1]-A[i+1])
  ans+=abs(A[i]-A[i-1])
  diff[i-1]=dif

for i in range(N):
  print(ans-diff[i])
