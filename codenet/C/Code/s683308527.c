#include<stdio.h>
#include<string.h>
int main(){
  int n;
  char s[10010],*c;
  scanf("%d%*c",&n);
  while(n--){
    fgets(s,1010,stdin);
    while(c=strstr(s,"Hoshino"))*(c+6)='a';
    printf("%s",s);
  }
  return 0;
}