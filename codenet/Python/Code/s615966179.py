n, a, b = map(int, input().split())
ans=n//(a+b)*a
r=min(n%(a+b), a)
ans+=r
print(ans)