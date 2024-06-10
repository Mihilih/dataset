N = int(input())
capacity_list = [int(input()) for _ in range(5)]
capacity_list.sort()
bottle_neck = capacity_list[0]
print(4+int((N+bottle_neck-1)/bottle_neck))
