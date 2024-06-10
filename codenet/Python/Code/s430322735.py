n = int(input())
lst = []
pair = 0
for i in range(n):
	st = ''.join(sorted(list(input())))
	lst.append(st)
lst = sorted(lst)
lst += ['end']
pre = ''
tmp_cnt = 0
cnt = 0
for i in lst:
	if i == pre:
		tmp_cnt += 1
	else:
		cnt += sum([j for j in range(tmp_cnt + 1)])
		tmp_cnt = 0
	pre = i
print (cnt)