n = int(input())
h = int(n / 3600)
n %= 3600
m = int(n / 60)
n %= 60
s = int(n)
print(str(h) + ":" + str(m) + ":" + str(s))