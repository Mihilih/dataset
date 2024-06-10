#include <stdio.h>
int main(){
    int n,k;
    long long int l=0,r=0;
    scanf("%d%d",&n,&k);
    if(k%2==0){
        for(int i=1;i<=n;i++)if(i%k==k/2)l++;
        else if(i%k==0)r++;
        printf("%lld\n",l*l*l+r*r*r);
    }
    else{
        for(int i=1;i<=n;i++)if(i%k==0)r++;
        printf("%lld\n",r*r*r);
    }
}