#include<stdio.h>
int main(){
  int a,b,c,x,y;
  scanf("%d%d%d%d%d",&a,&b,&c,&x,&y);
  c*=2;
  if(a+b<=c)
    printf("%d\n",a*x+b*y);
  else{
    if(x<=y){
      if(b<=c)
        printf("%d\n",c*x+(y-x)*b);
      else
        printf("%d\n",c*y);
    }
    else{
      if(a<=c)
        printf("%d\n",c*y+(x-y)*a);
      else
        printf("%d\n",c*x);
    }
  }
  return 0;
}
