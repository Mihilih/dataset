#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <string.h>

int main()
{
  int i_min,min;
  int i,j,k;
  int X,N;
  scanf("%d %d",&X,&N);
  if( N==0 ){
    printf("%d\n",X); 
    exit(0);
  }
  
  int plus[256];
  int minus[256];
  for(i=0;i<256;i++){
    plus[i] = i;
    minus[i] = (-1*i);
  }
  for(i=0;i<N;i++){
    scanf("%d",&j);
    plus[j] = 0;
  }
  
  i_min=0;
  min = 1000;
  for(i=255;i>=0;i--){
    if( plus[i] == 0 && i>0 ){
      continue;
    }
    k = X-plus[i];
    if(k<0){ k *= -1; }
    if( k<=min ){
      min = k;
      i_min = i;
    }
  }  
  
  printf("%d\n",i_min);
  
  return 0;
}