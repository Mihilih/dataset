#include<stdio.h>

int n,r,i,j,p,c;
int a[100],b[100];

int main(){
  while(1){
    scanf("%d %d",&n,&r);
    if(n==0&&r==0)break;
    
    for(i=0;i<n;i++){
      a[i]=n-i;
    }
    
    for(i=0;i<r;i++){
      
      for(j=0;j<n;j++){
        b[j]=a[j];
      }
      scanf("%d %d",&p,&c);

      for(j=0;j<c;j++){
        a[j]=b[p-1+j];
      }
      
      for(j=c;j<c+p-1;j++){
        a[j]=b[j-c];
      }
    }
    printf("%d\n",a[0]);
  }
  return 0;
}