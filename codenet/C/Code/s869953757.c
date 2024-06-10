#include<stdio.h>

#define M 100
#define whi 0
#define gra 1
#define bla 2

int n;
int T[M][M];
int color[M],d[M];
int Q[M],head=0,tail=0;

void enqueue(int x){
  Q[tail] = x;
  tail = (tail+1)%M;
}

int dequeue(void){
  int x;
  x = Q[head];
  head = (head+1)%M;
  return x;
}

void bfs(int s){
  int i,u,v;
  
  for(i=0; i<n; i++){
    color[i] = whi;
    d[i] = 1000000;
  }

  color[s] = gra;
  d[s] = 0;
  enqueue(s);

  while(head != tail){
    u = dequeue();
    for(v=0; v<n; v++){
      if(T[u][v] == 1 && color[v] == whi){
	color[v] = gra;
	d[v] = d[u]+1;
	enqueue(v);
      }
    }
    color[u] = bla;
  }
  
}

int main(){
  int i,j;
  int u,k,v;

  scanf("%d",&n);

  for(i=0; i<n; i++){
    for(j=0; j<n; j++){
      T[i][j] = 0;
    }
  }

  for(i=0; i<n; i++){
    scanf("%d %d",&u,&k);
    u--;
    for(j=0; j<k; j++){
      scanf("%d",&v);
      v--;
      T[u][v] = 1;
    }
  }

  bfs(0);

  for(i=0; i<n; i++){
    if(d[i] == 1000000) d[i] = -1;
    printf("%d %d\n",i+1,d[i]);
  }

  return 0;
}

