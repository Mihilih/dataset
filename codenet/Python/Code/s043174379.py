H, W = map(int, input().split())
h, w = map(int, input().split())
ans = H * W - (h * W + w * H - h * w) 
print(ans)