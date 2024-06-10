N = int(input())
L = list(map(int, input().split()))

ans = 0
for i in range(N-2):
    for j in range(i+1, N-1):
        for k in range(j+1, N):
            a = L[i]
            b = L[j]
            c = L[k]
            if a == b or b == c or c == a:
                continue
            if a+b>c and b+c>a and c+a>b:
                ans += 1
                # print("i:j:k:{},{},{}".format(i+1,j+1,k+1))
print(ans)
