#include<stdio.h>
#include<string.h>
#include<stdlib.h>

int main(){
  int n,i;
  int h[100001];
  int max = -1;
  int flag = 0;

  scanf("%d", &n);

  for(i = 0;i < n;i++){
    scanf("%d", &h[i]);
    if(max < h[i]) max = h[i];

    if(max - h[i] >= 2) flag = 1;
  }

  if(flag == 1) printf("No\n");

  else printf("Yes\n");

  return 0;
}
