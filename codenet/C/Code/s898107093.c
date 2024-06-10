#include<string.h>
#include<stdlib.h>
#include<stdio.h>


int main(){
  char **t,**h;
  int n,taro=0,hanako=0,i;
  scanf("%d",&n);
  t=malloc(n*sizeof(char *));
  h=malloc(n*sizeof(char *));
  for(i=0;i<n;i++){
    t[i]=malloc(100*sizeof(char));
    h[i]=malloc(100*sizeof(char));
    scanf("%s",t[i]);
    scanf("%s",h[i]);
    if(strcmp(t[i],h[i])<0) hanako+=3;
    if(strcmp(t[i],h[i])>0) taro+=3;
    if(strcmp(t[i],h[i])==0){
      taro+=1;
      hanako+=1;
    }
    free(t[i]);
    free(h[i]);
  }
  printf("%d %d\n",taro,hanako);
  return 0;
}