#include <cstdio>

const int MAXN = 1E5 + 10;

int n, m, Q;
int a[MAXN];
int b[MAXN], id[MAXN];
bool vis[MAXN];
int cnt[MAXN];

int main(){
	scanf("%d%d", &n, &m);
	scanf("%d", &Q);
	for (int i = 1; i <= Q; ++i)
		scanf("%d", &a[i]);
	for (int k = 0, j = Q; j > 0; --j)
		if (!vis[a[j]])
			b[++k] = a[j], vis[a[j]] = true;
	for (int j = m, i = m; i > 0; --i)
		if (!vis[i])
			b[j--] = i;
	for (int i = 1; i <= m; ++i)
		id[b[i]] = i;

	bool flag = true;
	cnt[0] = n;
	for (int i = Q; i > 0; --i){
		int t = id[a[i]];
		if (cnt[t - 1] > 0){
			--cnt[t - 1];
			++cnt[t];
			vis[t] = true;
		}
		else if (!vis[t]){
			flag = false;
			break;
		}
	}

	int l;
	for (l = 0; cnt[l] == 0; ++l);
	for (int i = l + 1; i < m; ++i)
		flag &= b[i] < b[i + 1];
	puts(flag ? "Yes" : "No");
	return 0;
}
