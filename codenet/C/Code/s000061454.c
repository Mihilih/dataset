#include <stdio.h>

int main(void) {
	int a,b,n;
	int sum;
	int i,j;
	while(1) {
		if(scanf("%d %d %d",&a,&b,&n)==-1)break;
		a-=a/b*b;
		sum=0;
		for(i=1;i<=n;i++) {
			a*=10;
			for(j=9;j>=0;j--) {
				if(b*j<=a)break;
			}
			a-=b*j;
			sum+=j;
		}
		printf("%d\n",sum);
	}
	return 0;
}