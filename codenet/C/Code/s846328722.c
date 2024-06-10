#include<stdio.h>
int linersearch(int [],int ,int );

int main(){
  int i,n,s[100000],q,t,count=0;

  scanf("%d",&n);

  for(i=0;i<n;i++){
    scanf("%d",&s[i]);
  }

  scanf("%d",&q);

  for(i=0;i<q;i++){
    scanf("%d",&t);
    if( linersearch(s,n,t) ) count++;
  }
  printf("%d\n",count);
  
  return 0;
}

int linersearch(int a[],int n,int key){
  int i=0;

  a[n]=key;
  
  while(a[i]!=key){
    i++;
  }
    return i!=n;
}
 

