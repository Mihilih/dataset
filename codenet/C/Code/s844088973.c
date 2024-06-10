#include <stdio.h>

int main(){
  int K,X;
  scanf("%d %d",&K,&X);
  for(int i=X-K+1;i<=X+K-1;i++){
    printf("%d",i);
    if(i<X+K-1) printf(" ");
  }
  printf("\n");
  return 0;
}