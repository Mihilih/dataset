#include<stdio.h>

int main(){
	int i,j,max,max_j,buf;
	int io[5];
	scanf("%d %d %d %d %d",&io[0],&io[1],&io[2],&io[3],&io[4]);
	for(i=0;i<5;i++){
		max=io[i];
		max_j=i;
		for(j=i+1;j<5;j++){
			if(max<io[j]){
				max=io[j];
				max_j=j;
			}
		}
		buf=io[i];
		io[i]=io[max_j];
		io[max_j]=buf;
		i<4?printf("%d ",io[i]):printf("%d\n",io[i]);
	}
	return 0;
}