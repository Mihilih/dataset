#include<stdio.h>
int main(void)
{
	int n,k,x,y,z;
	scanf("%d",&n);
	scanf("%d",&k);
	x=n/k;
	y=n%k;
	if(y!=0) {
		z=x+1-x;
	}
	else {
		z=x-x;
	}
	printf("%d\n",z);
	
	return 0;
}
