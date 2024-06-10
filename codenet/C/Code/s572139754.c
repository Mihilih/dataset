#include<stdio.h>
int main()
{
    int n;
    scanf("%d",&n);
    if(n%1000==0) printf("%d\n",0);
    else printf("%d\n",(n/1000+1)*1000-n);
}
