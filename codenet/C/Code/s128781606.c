#include <stdio.h>
int main(void) {
  int A,B,C,D,E,max;
  scanf("%d %d",&A,&B);
  C = A+B;
  D = A-B;
  E = A*B;
  max = C;
  if (max<D) {
    max = D;
  }
  if (max<E) {
    max = E;
  }
  printf("%d\n",max);
  return 0;
}