N=int(input())
mo=[]
for _ in range(N):
    x,u=input().split()
    x=float(x)
    mo.append([x,u])
okz=0
for i in mo:
    if i[1]=="JPY":
        okz +=i[0]
    else:
        okz += i[0]*380000

print(okz)
