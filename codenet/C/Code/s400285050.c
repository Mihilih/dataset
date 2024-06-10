#include<stdio.h>

int you(int,int);
int main(){
  int x,y,z;
  scanf("%d %d",&x,&y);
  if(x>=y)z=you(x,y);
  else z=you(y,x);
  printf("%d\n",z);
  return 0;
}
int you(int x ,int y){
  int z;
  while(1){
    z=x%y;
    x=y;
    y=z;
    if(y<=0)break;
  }
  return x;

}

