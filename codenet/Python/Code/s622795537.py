n = int(input())
arr = {}

for i in range(n):
    s = input()
    if not s in arr:
        arr[s] = 1
    else:
        arr[s] += 1

max_count = max(arr.values())
dic = [key[0] for key in arr.items() if key[1] == max_count]

out_sort = sorted(dic)
for i in out_sort:
    print(i)
