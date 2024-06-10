n = int(input())
S = list(map(int, input().split()))
q = int(input())
T = list(map(int, input().split()))

ans = 0
for i in T:
    if i == S[-1] or i == S[0]:
        ans += 1
    else:
        left = 0
        right = n-1
        while right-left > 1:
            mid = (left+right)//2
            if S[mid] == i:
                ans += 1
                break
            elif S[mid] < i:
                left = mid
            else:
                right = mid

print(ans)
