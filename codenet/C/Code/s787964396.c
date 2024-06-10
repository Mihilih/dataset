#include<stdio.h>
#include<stdlib.h>
#define I 10000
void CountingSort(int*,int*,int);
int main(){
  int *a,*b,i,max=0,n;
  scanf("%d",&n);
  a=(int *)malloc((n+1) *sizeof(int));
  b=(int *)malloc((n+1) *sizeof(int));
  for(i=0;i<n;i++){
    scanf("%d",&a[i+1]);
  }
  CountingSort(a,b,n);
  printf("%d",b[1]);
  for(i=2;i<n+1;i++)printf(" %d",b[i]);
  printf("\n");
  free(a);
  free(b);
  return 0;
}
void CountingSort(int a[],int b[],int k){
  int c[I],i,j;
  for(i=0;i<=I;i++)c[i]=0;
  for(j=0;j<k;j++)c[a[j+1]]++;
  for(i=1;i<I+1;i++)c[i]+=c[i-1];
  for(j=k;0<j;j--){
    b[c[a[j]]]=a[j];
    c[a[j]]--;
  }
}

