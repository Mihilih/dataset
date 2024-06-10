a = [int(input()) for i in range(5)]

dic = {}

for i in range(5):
    if str(a[i])[-1] == "0":
        dic.update({i: 0})
    else:
        dic.update({i: int(str(a[i])[-1]) - 10})


min_num = [i for i in dic if dic[i] == min(dic.values())][0]
a_sum = sum(a)
dic.pop(min_num)
print(abs(sum(dic.values())) + a_sum)