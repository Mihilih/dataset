from math import floor
from heapq import heappush, heappop
n, m = map(int, input().split())
a = []
for i in map(int, input().split()):
    heappush(a, -i)
dis = lambda x,y: x // 2**y

for _ in range(m):
    heappush(a, -dis(-heappop(a), 1))
print(-sum(a))
