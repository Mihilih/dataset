#include<stdio.h>

int main(void){
	int n,x,min,m,i;
	scanf("%d %d %d",&n,&x,&min);
	x-=min;
	for(i=1;i<n;i++){
		scanf("%d",&m);
		x-=m;
		if(min>m){
			min=m;
		}
	}
	printf("%d\n",n+x/min);
	return 0;
}
