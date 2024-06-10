n = input()
l = list(map(int, input().split()))

b = max(l)
s = sum(l)

if b < s - b:
    print('Yes')
else:
    print('No')