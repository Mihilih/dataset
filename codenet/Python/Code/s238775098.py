n=int(input())
res = 0
for _ in range(n):
    x,u =list(input().split())
    if u == "BTC": 
        res += float(x) * 380000
    else:
        res += int(x)
print(res)
