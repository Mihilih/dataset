n = int(input())
for i in range(1,10 ** 5):
    if i * i > n:
        print((i-1) * (i-1))
        exit()