X, N = list(map(int, input().split()))
p = list(map(int, input().split()))

p.sort()

candidates = {}
for i in range(-1, 102):

    if i in p:
        continue

    if not (abs(X-i) in candidates.keys()):
        candidates[abs(X-i)] = [i]
    else:
        candidates[abs(X-i)].append(i)

smallest = min(candidates.keys())

minNum = min(candidates[smallest])

print(minNum)
