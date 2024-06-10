#include <cstdio>
#include <algorithm>
using std::sort;
int main(void)
{
	int *a,*b,i,N;
	int frontHalf,backHalf;
	scanf("%d",&N);
	a= new int [N];
	b= new int [N];
	for(i=0;i<N;i++)
	{
		scanf("%d",a+i);
		b[i]=a[i];
	}
	sort(b,b+N);
	frontHalf=b[N/2-1];
	backHalf=b[N/2];
	delete [] b;
	for(i=0;i<N;i++)
	{
		if(a[i]<backHalf)
			printf("%d\n",backHalf);
		else
			printf("%d\n",frontHalf);
	}
	delete [] a;
	return 0;
}