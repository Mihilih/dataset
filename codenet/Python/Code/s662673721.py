import sys
input = sys.stdin.readline

n = int(input())

ans = 10 ** 18

for i in range(1, int(n ** (1 / 2)) + 2):
    if n % i != 0:
        continue
    j = n // i
    ans = min(ans, i + j - 2)

print(ans)