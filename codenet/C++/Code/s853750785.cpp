// AtCoder.cpp : このファイルには 'main' 関数が含まれています。プログラム実行の開始と終了がそこで行われます。
//

// AtCoder.cpp : このファイルには 'main' 関数が含まれています。プログラム実行の開始と終了がそこで行われます。
//


#define _USE_MATH_DEFINES
#include<math.h>

//#include<cmath>

#include<deque>
#include<queue>
#include<vector>
#include<algorithm>
#include<iostream>
#include<set>
#include<cmath>
#include<tuple>
#include<string>
#include<chrono>
#include<functional>
#include<iterator>
#include<random>
#include<unordered_set>
#include<array>
#include<map>
#include<iomanip>
#include<assert.h>
#include<bitset>
#include<stack>
#include<memory>



//#include "Ants.h"
using namespace std;
typedef long long ll;
#define rad_to_deg(rad) (((rad)/2/M_PI)*360)
#define EPS (1e-7)
#define INF (1e9)
#define PI (acos(-1))
#define rep(i,n) for(int i=0;i<n;i++)
#define show(s) cout<<s<<endl
#define chmin(x,y) x=min(x,y)
#define chmax(x,y) x=max(x,y)
#define LINF (1000000000000000000ll)
#define MOD (1e9+7)
#define rep1(i,n) for(int i =1;i<=n;i++)
typedef pair < ll, ll> P;
ll gcd(ll a, ll b) {//最大公約数を求める///最大公倍数a*b/gcd(a,b)
	if (b == 0) return a;
	return gcd(b, a % b);
}
ll lcd(ll a, ll b) {//最小公倍数を求める　b=0のときaを返す
	if (b == 0) return a;
	return (a / gcd(a, b)) * b;
}
vector<int> divnum(ll num) {
	int dig;
	vector<int>p;
	while (num) {
		dig = num % 10;
		p.push_back(dig);
		num /= 10;
	}
	return p;
}
int digiter(ll num) {
	int dig;
	vector<int>p;
	while (num) {
		dig = num % 10;
		p.push_back(dig);
		num /= 10;
	}
	return p.size();
}
vector<int> convertstring(string s) {
	vector<int> d;
	ll n = s.size();
	rep(i, n) {
		d.push_back(s[i] - '0');
	}
	return d;
}
map< ll, int > prime_factor(ll n) {
	map< ll, int > ret;
	for (ll i = 2; i * i <= n; i++) {
		while (n % i == 0) {
			ret[i]++;
			n /= i;
		}
	}
	if (n != 1) ret[n] = 1;
	return ret;
}
vector<ll> divisor(ll n) {
	vector<ll>res;
	for (ll i = 1; i * i <= n; i++) {
		if (n % i != 0)continue;
		res.push_back(i);
		if (i * i != n)res.push_back(n / i);
	}
	return res;
}


ll myPow(ll x, ll n, ll m) {//x^n
	if (n == 0)
		return 1;
	if (n % 2 == 0)
		return myPow(x * x % m, n / 2, m);
	else
		return x * myPow(x, n - 1, m) % m;
}
std::vector<int> Eratosthenes(const int N)//素数列挙
{
	std::vector<bool> is_prime(N + 1);
	for (int i = 0; i <= N; i++)
	{
		is_prime[i] = true;
	}
	std::vector<int> P;
	for (int i = 2; i <= N; i++)
	{
		if (is_prime[i])
		{
			for (int j = 2 * i; j <= N; j += i)
			{
				is_prime[j] = false;
			}
			P.emplace_back(i);
		}
	}
	return P;
}
const ll mod = MOD;
struct mint {

	ll x; // typedef long long ll;
	mint(ll x = 0) :x((x% mod + mod) % mod) {}
	mint operator-() const { return mint(-x); }
	mint& operator+=(const mint a) {
		if ((x += a.x) >= mod) x -= mod;
		return *this;
	}
	mint& operator-=(const mint a) {
		if ((x += mod - a.x) >= mod) x -= mod;
		return *this;
	}
	mint& operator*=(const mint a) { (x *= a.x) %= mod; return *this; }
	mint operator+(const mint a) const { return mint(*this) += a; }
	mint operator-(const mint a) const { return mint(*this) -= a; }
	mint operator*(const mint a) const { return mint(*this) *= a; }
	mint pow(ll t) const {
		if (!t) return 1;
		mint a = pow(t >> 1);
		a *= a;
		if (t & 1) a *= *this;
		return a;
	}

	// for prime mod
	mint inv() const { return pow(mod - 2); }
	mint& operator/=(const mint a) { return *this *= a.inv(); }
	mint operator/(const mint a) const { return mint(*this) /= a; }
};
istream& operator>>(istream& is, const mint& a) { return is >> a.x; }
ostream& operator<<(ostream& os, const mint& a) { return os << a.x; }
struct combination {

	vector<mint> fact, ifact;
	combination(ll n) :fact(n + 1), ifact(n + 1) {
		assert(n < mod);
		fact[0] = 1;
		for (ll i = 1; i <= n; ++i) fact[i] = fact[i - 1] * i;
		ifact[n] = fact[n].inv();
		for (ll i = n; i >= 1; --i) ifact[i - 1] = ifact[i] * i;
	}
	mint operator()(ll n, ll k) {
		if (k < 0 || k > n) return 0;
		return fact[n] * ifact[k] * ifact[n - k];
	}
}comb(1000005);//comb貯め
mint f(ll n, ll k) {
	if (n < 0) return 0;
	// nPk = nCk * k!
	mint res = comb(n, k);
	res *= comb.fact[k];
	return res;
}

/*int Q;


struct SegmentTree {
private:
	int n;
	vector<int> node;

public:
	SegmentTree(vector<int> v) {//SegmentTree seg(vector<int> v(N,INF))で呼び出し 
		int sz = v.size();
		n = 1; while (n < sz) n *= 2;
		node.resize(2 * n - 1, INF);
		for (int i = 0; i < sz; i++) node[i + n - 1] = v[i];
		for (int i = n - 2; i >= 0; i--) node[i] = min(node[2 * i + 1], node[2 * i + 2]);
	}

	void update(int x, int val) {
		x += (n - 1);
		node[x] = val;
		while (x > 0) {
			x = (x - 1) / 2;
			node[x] = min(node[2 * x + 1], node[2 * x + 2]);
		}
	}

	int getmin(int a, int b, int k = 0, int l = 0, int r = -1) {
		if (r < 0) r = n;
		if (r <= a || b <= l) return INF;
		if (a <= l && r <= b) return node[k];

		int vl = getmin(a, b, 2 * k + 1, l, (l + r) / 2);
		int vr = getmin(a, b, 2 * k + 2, (l + r) / 2, r);
		return min(vl, vr);
	}
};
// 1-indexedなので注意。
struct BIT {
private:
	vector<int> bit;
	int N;
public:
	BIT(int size) {
		N = size;
		bit.resize(N + 1);
	}

	// 一点更新です
	void add(int a, int w) {//a番目をwに更新
		for (int x = a; x <= N; x += x & -x) bit[x] += w;
	}

	// 1~Nまでの和を求める。
	int sum(int a) {
		int ret = 0;
		for (int x = a; x > 0; x -= x & -x) ret += bit[x];
		return ret;
	}
};*/

int N, M; int H[100005];
vector<int> G[100005];
int main() {
	cin >> N >> M;
	rep(i, N)cin >> H[i];
	rep(i, M) {
		int u, v;
		cin >> u >> v;
		u--; v--;
		G[u].push_back(v);
		G[v].push_back(u);
	}
	ll ans = 0;
	rep(u, N) {
		bool flag = true;
		for (int v : G[u]) {
			if (H[u] <= H[v])flag = false;
		}
		if (flag)ans++;
	}
	cout << ans << endl;
}