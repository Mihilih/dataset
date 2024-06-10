n,k = map(int,input().split())
li = list(map(int,input().split()))
li.sort()
tmp = li[:k]
print(sum(tmp))