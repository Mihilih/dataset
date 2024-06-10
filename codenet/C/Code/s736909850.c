#include<stdio.h>

int main(void){
   int sheep;
   int wolf;

   scanf("%d %d",&sheep,&wolf);

   if(wolf>=sheep){
      printf("unsafe\n");
   } else {
      printf("safe\n");
   }

   return 0;
}
