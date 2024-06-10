import collections
N = int(input())
a = list(map(int,input().split()))
B = collections.Counter(a)
k = list(B.keys())
v = list(B.values())

if len(B) == 3 and k[0]^k[1]^k[2] == 0 and v[0] == v[1] == v[2]:
    print("Yes")
elif len(B) == 2 and 0 in k and (v[0] == 2*v[1] or v[1] == 2*v[0]):
    print("Yes")
elif len(B) == 1 and 0 in k:
    print("Yes")
else: print("No")