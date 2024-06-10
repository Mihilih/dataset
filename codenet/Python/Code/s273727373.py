N=int(input())
A=list(map(int,input().split()))
B = list(A)
count = 1
for i in A:
  B[i-1] = count
  count+=1
  
  
print(*B)