#include<stdio.h>
#define N 1000000
#define Q 50000
int n,S[N],T[Q];

int binarySearch(int key)
{
  int left = 0,right = n,mid;
  while(left < right){
    mid = (left+right)/2;
    if(S[mid] == key) return 1;
    else if(key < S[mid]) right = mid;
    else left = mid+1;
  }
  return 0;
}

int main()
{
  
  int i,j,q,c=0;
  
  scanf("%d",&n);
  for(i=0;i<n;i++){
    scanf("%d",&S[i]);
  }
  
  scanf("%d",&q);
  for(i=0;i<q;i++){
    scanf("%d",&T[i]);
    if(binarySearch(T[i])==1) c++;
  }
   
  printf("%d\n",c);
  
  return 0;
}