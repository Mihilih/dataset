#include<stdio.h>
#define N 1000 

int main(void){
	char su[N]={'0'};
	int susum=0;
	int j=0;
	
	while(1){
		for(j=0;j<=N;j++){
			scanf("%c",&su[j]);
			if(su[j]=='\n')break;
			susum=susum+(su[j]-'0');
		}	
		if(su[0]=='0')break;
		printf("%d\n",susum);
		susum=0;
	}
	return 0;
}
