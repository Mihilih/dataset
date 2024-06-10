#include <iostream>
#include <algorithm>
#include <vector>
#include <stack>
#include <queue>
#include <string>
#include <cmath>
#include <iomanip>
using namespace std;
typedef long long ll;
typedef pair<ll,ll>PP;
ll key[1005]={0};
ll cost[1005]={0};
ll dp[(1<<12)+5][1005]={0};
const ll INF=123456789012;
int main(){
  ll n, m;cin>>n>>m;
  for(int i=0;i<(1<<12)+5;i++){
    for(int j=0;j<1005;j++){
      dp[i][j]=INF;
    }
  }
  dp[0][0]=0;
  for(int i=1;i<=m;i++){
    ll b;
    cin>>cost[i]>>b;
    for(int j=0;j<b;j++){
      ll c;
      cin>>c;
      key[i]+=(1<<(c-1));
    }
  }
  for(ll i=0;i<(1<<n);i++){
    for(int j=0;j<m;j++){
      dp[i][j+1]=min(dp[i][j],dp[i][j+1]);
      dp[i|key[j+1]][j+1]=min(dp[i|key[j+1]][j+1],dp[i][j]+cost[j+1]);
    }
  }
  if(dp[(1<<n)-1][m]==INF)cout<<-1<<endl;
  else cout<<dp[(1<<n)-1][m]<<endl;
}
