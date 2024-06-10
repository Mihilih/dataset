#include<stdio.h>
int main(void){
    int n,i,a;
    scanf("%d",&n);
    for(i=1;i<=n;i++){
        a=i;
        if((a%3)==0){
            printf(" %d",i);
        }else{
            for(;a;){
                if((a%10)==3){
                    printf(" %d",i);
                    a=0;
                }
                a=a/10;
            }
        }
    }
    putchar('\n');
    return 0;
}

