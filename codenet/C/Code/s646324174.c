#include<stdio.h>
#include<stdlib.h>
 
int top,S[10000];
 
void push(int x){
  S[++top]=x;
}
 
int pop(){
 return S[top--];
}
 
int main(){
  int a,b;
  char s[200];
  top=0;
   
  while(scanf("%s",s)!=EOF){
    if(s[0]=='+'){
      b=pop();
      a=pop();
      push(a+b);
    }else if(s[0]=='-'){
      b=pop();
      a=pop();
      push(a-b);
    }else if(s[0]=='*'){
      b=pop();
      a=pop();
      push(a*b);
    }else{
      push(atoi(s));
    }
  }
  printf("%d\n",pop());
  return 0;
}