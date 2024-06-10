#include <iostream>
#include <map>

using u64 = unsigned long long;

const u64 B = 13131;
const int N = 500000 + 7;

int n;
char s[N];
u64 f[N];
int g[N];
std::map<u64, u64> map;
u64 cnt;

u64 pow(u64 a, u64 k) {
	if (k < 0) k += (1llu << 63) - 1;
	u64 t = 1;
	for (; k; a = a * a, k >>= 1)
		if (k & 1) t = t * a;
	return t;
}

int main() {
//	freopen("code.in", "r", stdin);
//	freopen("code.out", "w", stdout);

	scanf("%d%s", &n, s + 1);
	for (int i = 1; i <= n; ++i)
		if (s[i] == '+' || s[i] == '-')
			f[i] = f[i - 1] + (s[i] == '+' ? 1 : -1) * pow(B, g[i] = g[i - 1]);
		else
			f[i] = f[i - 1], g[i] = g[i - 1] + (s[i] == '<' ? -1 : 1);
	for (int i = n; i; --i)
		++map[f[i]], cnt += map[f[n] * pow(B, g[i - 1]) + f[i - 1]];
	printf("%lld\n", cnt);

	return 0;
}
