#include <stdio.h>

#define N 200
#define SHIRO 0
#define HAI 1
#define KURO 2

void aaaaa();
void bbbbb(int);

int n,A[N][N];
int color[N],d[N],f[N];
int TT;

int main() {

  int u,k,v;
  int i,j;


  scanf("%d",&n);

  for(i=0;i<n;i++){
    for(j=0;j<n;j++){
      A[i][j] = 0;
    }
  }
  for(i=0;i<n;i++){
    scanf("%d %d",&u,&k);
    u--;
    for(j=0;j<k;j++){
      scanf("%d",&v);
      v--;
      A[u][v] = 1;
    }
  }

  aaaaa();

  return 0;
}


void aaaaa() {
  int u,i;

  for(i=0;i<n;i++){
    color[i] = SHIRO;
  }
    
  TT = 0;

  for(u=0;u<n;u++){
    if(color[u] == SHIRO){
      bbbbb(u);
    }
  }

  for(i = 0;i<n;i++){
    printf("%d %d %d\n",i+1,d[i],f[i]);
  }
}

void bbbbb(int k) {
  int v;
  color[k] = HAI;
  TT++;
  d[k] = TT;
  for(v=0;v<n;v++){
    if(A[k][v] == 0) continue;
    if(color[v] == SHIRO){
      bbbbb(v);
    }
  }
  color[k] = KURO;
  f[k] = ++TT;
}