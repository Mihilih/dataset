#include <stdio.h>

int main(void)
{
	int a,b,c,i,j,k;
	int max;

	scanf("%d",&j);

	for(i=0;i<j;i++){
		scanf("%d",&a);
		scanf("%d",&b);
		scanf("%d",&c);

		max=a;
		k=0;
		if(max<=b){
			max=b;
			k=1;
		}
		if(max<=c){
			max=c;
			k=2;
		}

		max=max*max;
		a=a*a;
		b=b*b;
		c=c*c;
		if(k==0 && max==b+c){
			printf("YES\n");
		}
		else if(k==1 && max==a+c){
			printf("YES\n");
		}
		else if(k==2 && max==a+b){
			printf("YES\n");
		}
		else{
			printf("NO\n");
		}
	}

return (0);
}