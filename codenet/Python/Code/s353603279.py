X = int(input())
h = X // 500
a = (X % 500) // 5
y = h * 1000 + a * 5
print(y)