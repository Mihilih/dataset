/*depth first search
not lie in stack
*/
#include <iostream>
using namespace std;
static const int N=100;
static const int WHITE=0;
static const int GRAY=1;
static const int BLACK=2;

int M[N][N],n;
int color[N],d[N],f[N],tt;

void dfs_visit(int u){
	int v;
	color[u]=GRAY;
	d[u]=++tt;
	for(v=0;v<n;v++){
		if(M[u][v]==0)
			continue;
		if(color[v]==WHITE){
			dfs_visit(v);
		}
	}
	color[u]=BLACK;
	f[u]=++tt;
	
}

void dfs(){
	int u;
	for(int i=0;i<n;i++){
		color[i]=WHITE;
	}
	tt=0;
	
	for(u=0;u<n;u++){
		if(color[u]==WHITE)
			dfs_visit(u);
	}
	
	for(int i=0;i<n;i++)
		cout<<i+1<<" "<<d[i]<<" "<<f[i]<<endl;
}

int main(){
	
	int k,u,v;
	cin>>n;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++)
			M[i][j]=0;
	}
	for(int i=0;i<n;i++){
		cin>>u>>k;
		u--;
		for(int j=0;j<k;j++){
			cin>>v;
			v--;
			M[u][v]=1;
		}
	}
		
	dfs();	

	return 0;
}
