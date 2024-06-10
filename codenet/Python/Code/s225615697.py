n = int(input())
a = list(map(int, input().split()))

m1 = int(sum([a[i] * ((-1)**i) for i in range(n)]) / 2)

result = str(m1)

m = [None] * n
m[0] = m1
for i in range(1, n):
  m[i] = a[i-1] - m[i-1]

print(' '.join([str(x*2) for x in m]))