#include<stdio.h>
#define N 2000
int num1,math[N+1];
int main(){
    int a,num2,ans,sum=0,math[N+1];
    int i,j;

    math[0]=1;
    
    scanf("%d",&num1);
    for(i=0;i<num1;i++){
	    scanf("%d",&a);
	    sum+=a;
	    for(j=sum-a;j>=0;j--){
	       if(math[j]==1) math[j+a]=1;
    	}
    	
    }

    scanf("%d",&num2);
    for(i=0;i<num2;i++){
	    scanf("%d",&ans);
	    math[ans]==1 ? printf("yes\n") :printf("no\n");
    }

    return 0;
}

