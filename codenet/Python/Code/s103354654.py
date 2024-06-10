W, H, x, y, r = map(int, input().split())

if x >= r and (W - r) >= x:
    if y >= r and (H - r) >= y:
        print('Yes')
    else:
        print('No')
else:
    print('No')
