#include <stdio.h>

int main(void)
{
  char s[4], t[4];
  scanf("%s", s);
  scanf("%s", t);
  int hit = 0;
  for (int i = 0; i < 3; i++){
    if (s[i] == t[i]) hit++;
  }
  printf("%d\n", hit);
  return 0;
}