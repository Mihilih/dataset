#include<stdio.h>
int main(){
  int n,l[2001],i,j,k,cnt=0,tmp=0;
  scanf("%d",&n);
  for(i=0; i<n; i++){
    scanf("%d",&l[i]);
  }
  for(i=0; i<n-1; i++){
    for(j=i+1; j<n; j++){
      if(l[j]<l[i]){
        tmp=l[i];
        l[i]=l[j];
        l[j]=tmp;
      }
    }
  }
  for(i=0; i<n-2; i++){
    for(j=i+1; j<n-1; j++){
      for(k=j+1; k<n; k++){
        if(l[i]+l[j]>l[k]){
          cnt++;
        }
        else{
          break;
        }
      }
    }
  }
  printf("%d\n",cnt);
  return 0;
}
