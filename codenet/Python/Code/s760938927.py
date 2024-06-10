h,w,ka=map(int,input().split())
mat=[list(input()) for i in range(h)]
ans=0
for i  in range(2**(h+w)):
    b=bin(i)[2:].zfill(h+w)
    rs=b[:h]
    cs=b[h:]
    ct=0
    for l in range(h):
        for k in range(w):
            if mat[l][k]=='#' and rs[l]=='0' and cs[k]=='0':
                ct+=1
    if ct==ka: ans+=1
print(ans)
