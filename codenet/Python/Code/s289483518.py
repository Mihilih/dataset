n, m = map(int, input().split())
a = list(map(int, input().split()))
a.sort()
ope = [list(map(int, input().split())) for _ in range(m)]
ope = sorted(ope, key=lambda x: x[1], reverse=True)
j = 0
for i in range(n):
    if a[i] < ope[j][1]:
        a[i] = ope[j][1]
        ope[j][0] -= 1
        if ope[j][0] == 0:
            j += 1
            if j == len(ope):
                break
    else:
        break
print(sum(a))
