#include <stdio.h>
#include <string.h>

int data[111111];
int seq[222222];

int max(int a,int b);

int main(void)
{
  int n,k,t,i,p,ret=0;

  while(1){

    scanf("%d %d",&n,&k);
    if(!n && !k)break;

    memset(data,0,sizeof(data));
    memset(seq,0,sizeof(seq));

    for(i = 0; i < k; i++){
      scanf("%d",&t);
      data[t]++;
    }

    p = 0;
    for(i = 1; i <= n; i++){
      if(data[i]){
	seq[p]++;
      } else {
	p+=2;
      }
    }
    p++;

    if(data[0]){
      for(i=0;i<p;i++){
	ret=max(ret,seq[i]+seq[i+2]+1);
      }
    } else {
      for(i=0;i<p;i++){
	ret=max(ret,seq[i]);
      }
    }

    printf("%d\n",ret);
    }

  return 0;
}

int max(int a,int b)
{
  if(a > b){
    return a;
  }
  return b;
}