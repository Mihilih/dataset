#include <stdio.h>

int main(void) {
   
   int N;
   scanf("%d",&N);
   
   int A[N+1];
   int B[N];
   int i;
   
   for (i = 0; i < N + 1; i++) {
      scanf("%d",&A[i]);
   }
   
   for (i = 0; i < N; i++) {
      scanf("%d",&B[i]);
   }
   
   long ans = 0;
   
   for (i = 0; i < N; i++) {
      
      //site i
      if (A[i] >= B[i]) {
         ans = ans + B[i];
         A[i] = A[i] - B[i];
         B[i] = 0;
      }
      else {
         ans = ans + A[i];
         B[i] = B[i] - A[i];
         A[i] = 0;
      }

      //site i + 1
      if (A[i + 1] >= B[i]) {
         ans = ans + B[i];
         A[i + 1] = A[i + 1] - B[i];
         B[i] = 0;
      }
      else {
         ans = ans + A[i + 1];
         B[i] = B[i] - A[i + 1];
         A[i + 1] = 0;
      }
   }
   
   printf("%ld\n",ans);
   
   
   return 0;
   
}
