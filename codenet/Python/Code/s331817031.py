h,w = map(int,input().split())
l = []
for _ in range(h):
    a = list(map(str,input()))
    l.append(a)

tmp = 0

for i in range(h):
    for j in range(w):
        if l[i][j] == "#":
            if j < tmp:
                print("Impossible")
                exit()
            else:
                tmp = j


print("Possible")