N = int(input())
m=[]
line = ''
m = [[[0 for k in range(10)] for j in range(3)] for i in range(10)]
for i in range(N):
    n = input().split()
    b = int(n[0])
    f = int(n[1])
    r = int(n[2])
    v = int(n[3])
    m[b-1][f-1][r-1] += v

for i in range(4):
    for j in range(3):
        for k in range(10):
            line += ' {0}'.format(m[i][j][k])
        print(line)
        line = ''
    if i < 3:
        print('#'*20)