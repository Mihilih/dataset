#ABC111C
import collections
def main():
    n=int(input())
    v=list(map(int,input().split()))
    ve=[]
    vo=[]
    for i in range(n//2):
        ve.append(v[2*i])
        vo.append(v[2*i+1])
    ce=collections.Counter(ve)
    co=collections.Counter(vo)
    ans=n
    if ce.most_common()[0][0]!=co.most_common()[0][0]:
        ans=n-ce.most_common()[0][1]-co.most_common()[0][1]
    elif len(ce)==1 and len(co)==1:
        ans=n-ce.most_common()[0][1]
    elif len(ce)==1:
        ans=n-ce.most_common()[0][1]-co.most_common()[1][1]
    elif len(co)==1:
        ans=n-ce.most_common()[1][1]-co.most_common()[0][1]
    else:
        ans=min(n-ce.most_common()[0][1]-co.most_common()[1][1],n-ce.most_common()[1][1]-co.most_common()[0][1])
    print(ans)
if __name__=="__main__":
    main()