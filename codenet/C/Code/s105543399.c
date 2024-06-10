#include <stdio.h>

int main() {
  long long  n,a,m,M,c,b,i;
  c = 0;
  m = 100000000;
  M =-100000000;
  scanf("%lld",&n);

  for(i=1; i<=n; i++){
    scanf("%lld",&a);
    if(a>M) {
      M = a;
    } 
    if(a < m){
      m = a;
    }
    c = c+a;
  }
    printf("%lld %lld %lld\n",m,M,c);

  return 0;
}
