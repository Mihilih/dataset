#include<stdio.h>
int main(){


int a,b,c,d,i,j;

scanf("%d %d %d %d",&a,&b,&c,&d);

i=a*b;
j=c*d;
if(i>j){
    printf("%d\n",i);
}
else{
    printf("%d\n",j);
}


return 0;
}
