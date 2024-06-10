input = list(map(str,input().split()))
num = ''.join(input)

if(int(num) % 4 == 0):
    print('YES')
else:
    print('NO')