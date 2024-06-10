#include <stdio.h>
#include <string.h>
int main(void) {
  char s[1000];
  scanf("%s", s);
  int i, flag = 0;
  for (i = 0; i < strlen(s); i++) {
    if (i % 2 == 0) {
      switch (s[i]) {
        case 'R':
          break;
        case 'U':
          break;
        case 'D':
          break;
        default:
          flag = 1;
          break;
      }
    } else {
      switch (s[i]) {
        case 'L':
          break;
        case 'U':
          break;
        case 'D':
          break;
        default:
          flag = 1;
          break;
      }
    }
  }
  if (flag == 0) {
    puts("Yes");
  } else {
    puts("No");
  }
}
