#include<stdio.h>
int main()
{
    int n,i,j,m,s,t;
    scanf("%d",&n);
    int a[n];
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    t=0;
    for(i=0;i<n;i++){
        s=0;
        for(j=1;j<n;j++){
            if(j<=i){
                continue;
            }
            m=a[i]*a[j];
            s=s+m;
        }
        t=t+s;
    }
    printf("%d\n",t);
    return 0;
}
