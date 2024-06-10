#include<iostream>
#include<cstring>
#include<string>
#include<cstdio>
#include<cmath>
#include<vector>
#include<queue>
#include<map>
#include<algorithm>
using namespace std;
const int maxn=200000+10;
const int INF=int(1e8);
int maps[maxn];
int num[maxn];
int main() {
	int n;
	while(~scanf("%d",&n)) {
		for(int i=1; i<=n; i++) {
			scanf("%d",&maps[i]);
			num[i]=maps[i];
		}
		sort(maps+1,maps+n+1);
		int m=n/2;
		for(int i=1; i<=n; i++) {
			if(num[i]<=maps[m])
				printf("%d\n",maps[m+1]);
			else
				printf("%d\n",maps[m]);

		}
	}
	return 0;
}