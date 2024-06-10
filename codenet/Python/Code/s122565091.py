a, v = map(int, input().split())
b, w = map(int, input().split())
t = int(input())
if a == b:
    print('YES')
elif v <= w:
    print('NO')
else:
    if t < abs(a - b) / (v - w):
        print('NO')
    else:
        print('YES')