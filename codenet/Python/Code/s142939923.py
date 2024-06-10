a, b = map(int, input().split())

# A + B
x = [a + b]
# A - B
x.append(a - b)
# A * B
x.append(a * b)
print(max(x))
