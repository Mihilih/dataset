n = int(input())
s = str(input())

ans = 0

for i in range(n):
    x = set(s[:i+1])
    y = set(s[i+1:])

    z = 0
    for w in x:
        if w in y:
            z +=1
    if z > ans:
        ans = z
print(ans)