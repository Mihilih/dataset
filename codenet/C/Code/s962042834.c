#include<stdio.h>

void kansu(int,int);

int main(void)
{
	int a,b;
	
	scanf("%d %d",&a,&b);
	while(a!=0 && b!=0){
		kansu(a,b);
		scanf("%d %d",&a,&b);
	}
	return 0;
}
void kansu(int a,int b)
{
	int i,j,x,y,n;
	int suu[17][17];
	int kouji[17][17];
	
	scanf("%d",&n);
	for(i=1;i<=a;i++){
		for(j=1;j<=b;j++){
			kouji[i][j]=0;
		}
	}
	for(i=0;i<n;i++){
		scanf("%d %d",&x,&y);
		kouji[x][y]=1;
	}
	for(i=1;i<=a;i++){
		for(j=1;j<=b;j++){
			if(kouji[i][j]==1){
				suu[i][j]=0;
			}
			else {
				if(i==1 && j==1){
					suu[i][j]=1;
				}
				else {
					if(i==1){
						suu[i][j]=suu[i][j-1];
					}
					else if(j==1){
						suu[i][j]=suu[i-1][j];
					}
					else {
						suu[i][j]=suu[i][j-1]+suu[i-1][j];
					}
				}
			}
		}
	}
	printf("%d\n",suu[a][b]);
}
					