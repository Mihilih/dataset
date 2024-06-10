n = int(input())
s = input()

left = 0
for i in s:
    if i == ")":
        left += 1
    else:
        break

left1 = 0
right1 = 0

for i in range(left, n):
    if s[i] == "(":
        right1 += 1
    elif right1 > 0:
        right1 -= 1
    else:
        left1 += 1

left1 += left
for i in range(right1):
    s += ")"
for i in range(left1):
    s = "(" + s

print(s)