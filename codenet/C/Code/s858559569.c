#include<stdio.h>
#define N 4

typedef struct{
  int P[N][N];
}Pazz;

Pazz Q;
int dx[4]={0,1,0,-1};
int dy[4]={1,0,-1,0};

int Heu(Pazz Q){
  int i ,j;
  int hx,hy,sum=0;
  for(i=0;i<N;i++){
    for(j=0;j<N;j++){
      if(Q.P[i][j]==0)continue;

      hx=(Q.P[i][j]-1)%N-j;
      hy=(Q.P[i][j]-1)/N-i;

      if(hx<0)sum-=hx;
      else sum+=hx;

      if(hy<0)sum-=hy;
      else sum+=hy;
    }
  }
  return sum;
}
int dfs (int x,int y,int max,int count,int n){
  int i,temp;
  int x0,y0,ans=-1,h;

  h=Heu(Q);

  if(h==0)return count;
  if((count+h) > max)return -1;

  for(i=0;i<4;i++){
    x0=x+dx[i];
    y0=y+dy[i];

    if(((i == (n+2)%4 )&& (n!=-1))||!((0<=x0 )&&( x0<N) && (0<=y0) && (y0<N)))continue;
    temp=Q.P[y][x];
    Q.P[y][x]=Q.P[y0][x0];
    Q.P[y0][x0]=temp;

    ans= dfs(x0,y0,max,count+1,i);

    if(ans!=-1)return ans;
    temp=Q.P[y][x];
    Q.P[y][x]=Q.P[y0][x0];
    Q.P[y0][x0]=temp;
  }

  return -1;

}

int main(){
  int i,j;
  int kx,ky,ans,a;
  Pazz tP;

  for(i=0;i<N;i++){
    for(j=0;j<N;j++){
      scanf("%d",&a);
      Q.P[i][j]=a;
      if(a==0){
        kx=j;
        ky=i;
      }
    }
  }

  tP=Q;
  for(i=1;i<46;i++){
    Q=tP;
    ans=dfs(kx,ky,i,0,-1);
    if(ans!=-1){
      printf("%d\n",ans);
      break;
    }
  }

  return 0;
}

