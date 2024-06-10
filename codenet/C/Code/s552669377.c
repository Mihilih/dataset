#include<stdio.h>

int main(void){
int i,n,tmp;
long long int min=1000000,max=-1000000,sum=0;

scanf("%d",&n);
	
for(i=0;i<n;i++){
scanf("%d",&tmp);
if(min>tmp)min=tmp;
if(max<tmp)max=tmp;
sum+=tmp;
}

printf("%ld %ld %ld\n",min,max,sum);

return 0;
}
