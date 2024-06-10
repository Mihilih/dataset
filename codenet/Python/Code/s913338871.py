N = int(input())
a = list(map(int, input().split()))
a.sort()

s = [ai for ai in a[N::2]]
print(sum(s))