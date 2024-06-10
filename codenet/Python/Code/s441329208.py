import sys
read = sys.stdin.read
readline = sys.stdin.readline
readlines = sys.stdin.readlines
sys.setrecursionlimit(10 ** 7)
s = sorted(readline().rstrip())
t = sorted(readline().rstrip())[::-1]
print("Yes" if s < t else "No")