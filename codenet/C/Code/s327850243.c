#include<stdio.h>
int main(){
 int m,n;
 int i,j;
 int A[100][100];
 int B[100];
 int S[100]={0};

 scanf("%d %d",&m,&n);

 for(i=0;i<m;i++){

   for(j=0;j<n-1;j++){
     scanf("%d ",&A[i][j]);
    }
     scanf("%d\n",&A[i][n-1]);

 }

 for(i=0;i<n;i++){
  scanf("%d\n",&B[i]);
 }

 for(i=0;i<m;i++){
 
  for(j=0;j<n;j++){
    S[i]=S[i]+A[i][j]*B[j];
  }

 }


 for(i=0;i<m;i++){
  printf("%d\n",S[i]);
 }

return 0;

}