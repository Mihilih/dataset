#include <stdio.h>

int main(void)
{
   int x, y;
   x = 0; y = 0;   

   scanf("%d", &x);		scanf("%d", &y);
   
   printf("%d %d\n", x * y, (2*x) + (2*y));  

   return 0;

}