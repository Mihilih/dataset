n, m = map(int, input().split())

gate_cond = [[int(x) for x in input().split()] for _ in range(m)]
max_under_th = max([l[0] for l in gate_cond])
min_upper_th = min([l[1] for l in gate_cond])
if min_upper_th - max_under_th >= 0:
    print(min_upper_th - max_under_th + 1)
else:
    print(0)