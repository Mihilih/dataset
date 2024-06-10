#include <stdio.h>
int main() {
  int a,b,c,d,e,i;
  scanf("%d%d%d",&a,&b,&c);
  if (b<=c) {
    printf("NO\n");
    return 0;
  } else {
    d=a;
    e=d%b;
    for (i=0; i<b; i++) {
      d=d%b;
      if (d==c) {
        printf("YES\n");
        return 0;
      } else if (i!=0&&d==c) {
        printf("NO\n");
        return 0;
      }
      d+=a;
    }
  }
  printf("NO\n");
  return 0;
}
