#include<stdio.h>

#define MAX 100005
#define N 100

typedef struct{
  char name[N];
  int t;
}P;

P Q[MAX+1];
int head, tail;

void Enqueue(P x){
  if(MAX==tail) tail=0;
  Q[tail]=x;
  tail++;
}

P Dequeue(void){
  if(head==MAX) head=0;
  return Q[head++];
}


int main(){
  int i,q,n,T=0;
  P a;
  scanf("%d %d", &n, &q);

  for (i=0;i<n;i++){
    scanf("%s%d",a.name,&a.t);
    Enqueue(a);
  }

  while(n!=0){
    a=Dequeue();
    if(a.t>q){
      a.t=a.t-q;
      T+=q;
      Enqueue(a);
    }
    else{
      T=T+a.t;
      printf("%s %d\n",a.name,T);
      n--;
    }
  }

  return 0;
}

