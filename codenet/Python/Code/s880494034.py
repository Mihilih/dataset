import math

N = input()
XS = [int(i) for i in input().split()]

m = 9999999999
for i in range(1, 101):
	c = sum([(x - i) ** 2 for x in XS])
	if m > c:
		m = c

print(m)
