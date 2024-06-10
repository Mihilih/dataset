N,K = map(int,input().split())
score = list(map(int,input().split()))
mae = 0
usiro = K
for i in range(N-K):
  if score[mae]<score[usiro]:
    print('Yes')
  else:
    print('No')
  mae += 1
  usiro += 1