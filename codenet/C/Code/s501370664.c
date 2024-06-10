#include <stdio.h>
#include <stdlib.h>

int *flag;

void prime(int num){
	int i,j;

	flag = (int *)calloc(sizeof(int),num+1);

	for(i = 2;i*i <= num;i++){
		if(flag[i] == 0){
			for(j = 2;i*j <= num;j++){
				flag[i*j] = 1;
			}
		}
	}
}

int main(){
	int n,i,cnt;

	prime(50000);

	while(1){
		scanf("%d",&n);
		if(n == 0){
			break;
		}
		i = 2;
		cnt = 0;
		while(i*2 <= n){
			if(!flag[i] && !flag[n-i]){
				cnt++;
			}
			i++;
		}
		printf("%d\n",cnt);
	}

	return 0;
}