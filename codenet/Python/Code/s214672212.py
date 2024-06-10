nums = list(map(int, input().split(" ")))
nums.sort(reverse=True)
print(nums[0]*10+nums[1]+nums[2])