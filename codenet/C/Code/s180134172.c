#include<stdio.h>
signed main(){
    int n,k,p[99999],i,j,l,m,o=0;
    scanf("%d %d",&n,&k);
    for(i=0;i<n;i++){
        scanf("%d",&p[i]);
    }
    for(i=0;i<n;i++){
        l=i;
        for(j=i+1;j<n;j++){
            if(p[j]<p[l]){
                l=j;
            }
        }
        if(l!=i) {
            m=p[i];
            p[i]=p[l];
            p[l]=m;
        }
    }
    for(i=0;i<k;i++){
        o +=p[i];
    }
    printf("%d\n",o);
    return(0);
}
