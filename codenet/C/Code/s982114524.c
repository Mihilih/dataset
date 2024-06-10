#include <stdio.h>
int main(void){
  int i,N,x;
  x = 0;
  scanf("%d",&N);
  for(i=1; i<=N; i++)
    x += i;
  printf("%d\n",x);
  return 0;
}
