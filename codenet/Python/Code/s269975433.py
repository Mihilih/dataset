from itertools import combinations_with_replacement
import sys

def LI(): return map(int, sys.stdin.readline().rstrip().split())

N, M, Q = LI()

Q_groups = []
for _ in range(Q):
    Q_groups.append([*LI()])

max_score = 0
for p in combinations_with_replacement(range(1, M + 1), r=N):
    temp_score = 0
    for q in Q_groups:
        if p[q[1] - 1] - p[q[0] - 1] == q[2]:
            temp_score += q[3]
    max_score = max(max_score, temp_score)

print(max_score)