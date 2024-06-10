#include<stdio.h>
#define INF 100000
#define MAX 101
#define NIL -6
#define WHITE 0
#define GRAY 1
#define BLACK 2

int G[MAX][MAX];
int n;

void prim(){
  int i,j;
  int d[MAX];
  int pi[MAX];
  int color[MAX];
  int min,u,v,sum=0;

  for(i=0;i<n;i++){
    d[i] = INF;
    pi[i] = NIL;
    color[i] = WHITE;
  }

  d[0] = 0;

  while(1){
    min = INF;
    u = NIL;
    for(i=0;i<n;i++){
      if(color[i] != BLACK && d[i] < min){
        min = d[i];
        u = i;
      }
    }
    if(u == NIL){
      break;
    }
    color[u] = BLACK;
    for(v=0;v<n;v++){
      if(color[v] != BLACK && G[u][v] != INF){
        if(d[v] > G[u][v]){
          d[v] = G[u][v];
          pi[v] = u;
          color[v] = GRAY;
        }
      }
    }
  }
  for(i=0;i<n;i++){
    if(pi[i] != NIL)sum += G[i][pi[i]];
  }
  printf("%d\n",sum);
}

int main(){
  int e;
  int i,j;

  scanf("%d",&n);

  for(i=0;i<n;i++){
    for(j=0;j<n;j++){
      scanf("%d",&e);
      if(e == -1){
        G[i][j] = INF;
      }else{
        G[i][j] = e;
      }
    }
  }

  prim();
  return 0;
}