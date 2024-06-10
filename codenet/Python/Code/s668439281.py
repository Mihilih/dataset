import collections

n = int(input())
ls = [input() for i in range(n)]    
c = collections.Counter(ls)

count = c.most_common()[0][1]
ans = []
p = c.most_common()
for i in range(len(c)):
    if p[i][1] == count:
        ans.append(p[i][0])
    else:
        break   
ans = sorted(ans)
for i in ans:
    print(i)