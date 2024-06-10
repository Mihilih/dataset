A,B = map(int,input().split())
lst = []
lst.append(A+B)
lst.append(A-B)
lst.append(A*B)
print(max(lst))