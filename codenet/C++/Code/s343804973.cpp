#include<cstdio>
#define int long long
int n,m,mod,C[310][310],pre[310][310],f[310][310];
using namespace std;
signed main(){
	scanf("%lld%lld%lld",&n,&m,&mod);
	C[0][0]=1;
	for(int i=1;i<=n;i++){
		C[i][0]=C[i][i]=1;
		for(int j=1;j<i;j++)
			C[i][j]=(C[i-1][j-1]+C[i-1][j])%mod;
	}
    for(int i=0;i<=m;i++)
        f[1][i]=1,pre[1][i]=m-i+1;
    for(int i=2;i<=n+1;i++){
    	for(int j=0;j<=m;j++)
    		for(int k=1;k<i;k++)
    			(f[i][j]+=f[i-k][j]*pre[k][j+1]%mod*C[i-2][k-1])%=mod;
    	for(int j=m;j>=0;j--)
    		pre[i][j]=(pre[i][j+1]+f[i][j])%mod;
    }
    printf("%lld\n",f[n+1][0]);
} 