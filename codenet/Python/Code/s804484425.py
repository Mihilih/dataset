from operator import itemgetter


n, k = map(int,input().split())
info = [list(map(int, input().split())) for i in range(n)]

info = sorted(info, key = itemgetter(1), reverse = True)

selected = info[0:k]
selected_only = []
selected_chohuku = []
unselected_only = []
memo = {}
for t, d in selected:
    if t not in memo:
        memo[t] = 1
        selected_only.append(d)
    else:
        selected_chohuku.append(d)

cnt_type = len(memo)
for t, d in info[k:]:
    if t not in memo:
        memo[t] = 1
        unselected_only.append(d)


sum_select = sum(selected_chohuku) + sum(selected_only) 
ans = cnt_type*cnt_type + sum_select

unselected_only = unselected_only[::-1]
for i in range(min(len(selected_chohuku), len(unselected_only))):
    cnt_type += 1
    sum_select += unselected_only[-1]
    sum_select -= selected_chohuku[-1]
    del unselected_only[-1]
    del selected_chohuku[-1]
    tmp = cnt_type*cnt_type + sum_select
    ans = max(ans, tmp)
print(ans)

  