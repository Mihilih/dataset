#include <stdio.h>

int main(void){

  int S;
  scanf("%d", &S);

  if (S < 60)
    {
      printf("0:0:%d\n",S);
    }
  
  else if (S < 3600)
    {
      printf("0:%d:%d\n", (int)S/60, S%60);
    }
  
  else
    {
      printf("%d:%d:%d\n", (int)S/3600, (int)(S%3600)/60, (S%60)%60);
    }
  return 0;
}
