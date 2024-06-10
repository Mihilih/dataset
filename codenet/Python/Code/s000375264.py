X,t = map(int,input().split())
 
if X > t:
	answer = X - t
elif X <= t:
	answer = 0
  
print(answer)