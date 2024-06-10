s = input()
q = int(input())
qs = [input().split() for i in range(q)]
n = False
left= right = ""
for operation in qs:
    if operation[0] == '1':
        n = not n
    if operation[0] == '2':
        t , f, c = operation
        f = int(f)
        if n:
            f = 1 if f != 1 else 2
        if f == 1:
            left=c+left
        elif f == 2:
            right+=c
s = left+s+right
print(s[::-1] if n else s)