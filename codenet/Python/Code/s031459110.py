N = int(input())
c = input()

num_w = c.count("W")
num_r = N - num_w

comp = "R"*num_r + "W"*num_w
ans = 0
for i in range(num_r):
    if c[i] != comp[i]:
        ans += 1

ans = min(num_w, num_r, ans)
print(ans)