N=int(input())
S=input()
x=1
for i in range(N-1):
    if S[i]!=S[i+1]:
        x=x+1
print(x)
