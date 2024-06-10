# -*- coding: utf-8 -*-
import numpy as np

n, k = map(int, input().split())

if n > k:
    tmp = n % k
    if tmp >= k - tmp:
        ans = k - tmp
    else:
        ans = tmp
elif n < k:
    if n >= k - n:
        ans = k - n
    else:
        ans = n
else:
    ans = 0

print(ans)