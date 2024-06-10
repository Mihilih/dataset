#include<stdio.h>
#include<stdlib.h>

void run(void){
  int n,k;
  scanf("%d%d",&n,&k);
  int a[100];
  int i,j;
  for(i=0;i<n;i++) scanf("%d",a+i);
  int *dp=(int *)calloc(k+1,sizeof(int));
  for(i=1;i<=k;i++){
    int win=0;
    for(j=0;j<n && a[j]<=i;j++){
      if(dp[i-a[j]]==0){
	win=1;
      }
    }
    dp[i]=win;
  }
  printf("%s\n",dp[k]?"First":"Second");
}

int main(void){
  run();
  return 0;
}