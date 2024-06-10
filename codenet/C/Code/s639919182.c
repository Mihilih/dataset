#include <stdio.h>
int main(void)
{
	int v[10];
	int sum=0;
	int i;
	
	for(i=0;i<10;i++)
	scanf("%d",&v[i]);
	
	for(i=0;i<10;i++)
	sum+=v[i];
	
	printf("%d\n",sum);
	
	return 0;
}