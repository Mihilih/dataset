#include<stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
 

 
int main()
{
    int X,A,B,C;
    int i=0;
    int j=0;
    int k=0;
    int kosu=0;
  
 // 整数の入力
    scanf("%d", &A);
    scanf("%d", &B);
    scanf("%d", &C);
    scanf("%d", &X);
  
  X=X/50;
  
   for(i=0;i<=A;i++){
     for(j=0;j<=B;j++){
       for(k=0;k<=C;k++){
         if(X==(10*i)+(2*j)+k) kosu++;
       }
     }
   }
  
     

  printf("%d\n",kosu);

return 0;
}
