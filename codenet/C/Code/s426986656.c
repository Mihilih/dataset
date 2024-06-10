#include <stdio.h>

int main(void) {
  int A, B, flag = 0;
  scanf("%d %d", &A, &B);

  for(int i=1; i<=3; ++i) {
    if((A*B*i)%2 == 1) {
      flag = 1;
      break;
    }
  }

  if(flag) printf("Yes\n");
  else printf("No\n");

  return 0;
}
