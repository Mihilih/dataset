#include <stdio.h>
#include <math.h>


void main(){
	int n,d;
	scanf("%d%d",&n,&d);
	int point[n+1][d+1];
	
	for (int i=1;i<=n ; i++){
		for (int j=1; j<=d; j++){
			scanf("%d",&point[i][j]);
		}
	}
	
	int count=0;
	for (int i=1; i<=n-1; i++){
		for (int j=i+1; j<=n; j++){
			
			int sum=0;
			for (int k=1; k<=d; k++){
				sum = sum+ (point[i][k] - point[j][k])*(point[i][k] - point[j][k]);
			}
			double kyori = sqrt(sum);
			if (ceil(kyori) == floor(kyori)){
				count++;
			}
		}
	}
	
	printf("%d\n",count);
}