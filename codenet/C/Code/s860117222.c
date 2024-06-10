#include <stdio.h>
int main (){
  long long int a,b,c;
  scanf("%lld %lld %lld", &a,&b,&c);

  long long int d=c-a-b;
  if( ( d>0 ) && ( (4*a*b) < d*d ) )
    printf("Yes\n");
  else
    printf("No\n");

  return 0;
}
