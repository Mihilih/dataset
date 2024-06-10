import numpy as np
n = int(input())
A = np.zeros(n)

x, y, z = 1, 1, 1

while x**2 + y**2 + z**2 + x*y + y*z + z*x <= n:
    while x ** 2 + y ** 2 + z ** 2 + x * y + y * z + z * x <= n:
        while x ** 2 + y ** 2 + z ** 2 + x * y + y * z + z * x <= n:
            i = x ** 2 + y ** 2 + z ** 2 + x * y + y * z + z * x
            A[i - 1] += 1
            z += 1
        z = 1
        y += 1
    y, z = 1, 1
    x += 1
for i in range(n):
    print(int(A[i]))

