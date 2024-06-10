#include<stdio.h>

int main(void)
{
	int i,j,x[10000];

	for(i=0;i<10000;i++){
		x[i] = 0;
	}
	i=0;
	scanf("%d",&x[i]);
	
	while(x[i] != 0){
		i++;
		scanf("%d",&x[i]);
	}
	
	for(j=0;j<i;j++){
		printf("Case %d: %d\n",j+1,x[j]);
	}
	
	return 0;
}