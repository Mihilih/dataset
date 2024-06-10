# B - AtCoder Beginner Contest 111

import bisect

N = int(input())
arr = [111, 222, 333, 444, 555, 666, 777, 888, 999]
ans_idx = bisect.bisect_left(arr, N)
print(arr[ans_idx])