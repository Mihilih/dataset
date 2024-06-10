#include<stdio.h>
#define MAX 100
#define INF 999999
#define NIL -1
#define WHITE 0
#define BLACK 2
  
int prim();
  
int n, G[MAX][MAX];
  
int main()
{
  int i, j;
  
  scanf("%d", &n);
  for(i=0; i<n; i++)
    {
      for(j=0; j<n; j++)
    {
      scanf("%d", &G[i][j]);
    }
    }
    
  printf("%d\n", prim());
    
  return 0;
}
  
int prim()
{
  int u, i, v, mincost, d[n], pi[n], color[n], sum=0;
  
  for(u=0; u<n; u++)
    {
      d[u] = INF;
      pi[u] = NIL;
      color[u] = WHITE;
    }
  
  d[0] = 0;
  while(1)
    {
      mincost = INF;
  
      for(i=0; i<n; i++)
    {
      if(color[i] != BLACK && d[i] < mincost)
        {
          mincost = d[i];
          u = i;
        }
    }
        
      if(mincost == INF) break;
        
      color[u] = BLACK;
        
      for(v=0; v<n; v++)
    {
      if(color[v] != BLACK && G[u][v] < d[v] && G[u][v] != -1)
        {
          pi[v] = u;
          d[v] = G[u][v];
        }
    }
    }
  
  for(i=0; i<n; i++)
    {
      if(d[i] != INF) sum += d[i];
    }
  
  return sum;
}