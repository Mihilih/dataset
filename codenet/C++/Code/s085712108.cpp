/*Lucky_Glass*/
#include<cstdio>
#include<cstring>
#include<algorithm>
#include<queue>
#include<vector>
using namespace std;
#define MOD 7007
struct QUEUE
{
	int a,b,c,tot;
}Push;
int F[6][3]={{1,1,0},{1,0,1},{0,1,1},{2,0,0},{0,2,0},{0,0,2}};
vector<int> Hash[MOD];
bool HASH(int n)
{
	for(int i=0;i<Hash[n%MOD].size();i++)
		if(n==Hash[n%MOD][i])
			return false;
	Hash[n%MOD].push_back(n);
	return true;
}
int main()
{
	Push.tot=0;
	queue<QUEUE> que;
	scanf("%d%d%d",&Push.a,&Push.b,&Push.c);
	que.push(Push);
	while(!que.empty())
	{
		QUEUE Fro=que.front();
		if(Fro.a==Fro.b && Fro.b==Fro.c)
		{
			printf("%d\n",Fro.tot);
			return 0;
		}
		for(int i=0;i<6;i++)
		{
			Push=Fro;
			Push.tot++;
			Push.a+=F[i][0];Push.b+=F[i][1];Push.c+=F[i][2];
			int n=Push.a*10000+Push.b*100+Push.c;
			if(!HASH(n)) continue;
			que.push(Push);
		}
		que.pop();
	}
	return 0;
}
