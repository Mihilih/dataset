strn = input()
n = int(strn)
shichigolist = ["3","5","7"]
shichigo = [[] for _ in range(len(strn))]
for i in range(len(strn)):
	if i == 0:
		for j in shichigolist:
			shichigo[i].append(j)
	else:
		for j in shichigo[i-1]:
			for k in shichigolist:
				shichigo[i].append(j+k)
target = len(strn)-1
for i in range(len(strn)):
	for j in shichigo[i][:]:
		if i == target:
			if int(j) > n:
				shichigo[target].remove(j)
			elif j.count("3")==0 or j.count("5")==0 or j.count("7")==0:
				shichigo[target].remove(j)
		else:
			if j.count("3")==0 or j.count("5")==0 or j.count("7")==0:
				shichigo[i].remove(j)

print(sum([len(shichigo[i]) for i in range(len(strn))]))