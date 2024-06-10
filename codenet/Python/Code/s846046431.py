#ABC161B
import sys
N, M = map(int, sys.stdin.readline().split())
A = list(map(int, sys.stdin.readline().split()))
A.sort(reverse=True)
S = sum(A)
for a in A[:M]:
    if a/S - 1/(4*M) <0:
        print('No')
        break
else:
    print('Yes')
