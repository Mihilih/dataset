#include<cstdio>
#include<map>
#include<cstring>
#include<cmath>
#include<iostream>
#include<algorithm>
#include<queue>
using namespace std;
long long a[200005];
long long pre[200005];
long long last[200005];
int main(){
	int n;
	scanf("%d",&n);
	for(int i = 1;i<=n;i++){
			scanf("%lld",&a[i]);
	}
	long long sumpre=0,sumlast=0;
	for(int i = 1;i<n;i++){
		sumpre=sumpre+a[i];
		pre[i]=sumpre;
//		printf("%lld++\n",pre[i]);
	}
	for(int i = n;i>1;i--){
		sumlast=sumlast+a[i];
		last[i]=sumlast;
//		printf("%lld+++\n",last[i]);
	}
	long long d=(1ll<<60);
	for(int i = 1;i<n;i++){
//		printf("%lld\n",pre[i]-last[i+1]);
		d=min(d,abs(pre[i]-last[i + 1]));
	}
	printf("%lld\n",d);
}
