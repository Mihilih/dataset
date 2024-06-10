#include <stdio.h>
#include <string.h>

int main()
{
  char str[21];
  int i, len;
  
  scanf("%s",str);
  
  len = strlen(str);

  for(i = len-1; i >= 0; i--){
    putchar(str[i]);
  }
  printf("\n");
  
  return 0;
}
  