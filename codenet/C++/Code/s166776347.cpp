#include <iostream>
#include <set>
#include <map>
#include <string>
#include <math.h>
#include <algorithm>
#include <vector>
#include <stack>
#include <queue>
#include <bitset>
#include <string.h>

using namespace std;

// #define for(i,a,b) for (int i=(a);i<(b);++i)
typedef long long ll;
typedef pair<ll,ll> P;
#define REP(i,n) for(long long i = 0; i < (long long)(n); i++)
#define pb push_back // vectorに要素追加
#define INF (ll)1e18

ll mod = 1e9+7;
  
int main() {
	// 入力
	ll N,K;cin>>N>>K;
	ll A[N];REP(i,N)cin>>A[i];

	// 解法 
    ll ans1 = 0;
	REP(i,N){
        REP(j,N){
            if (i>=j) continue;
            if (A[i]>A[j]) ans1++;
            ans1 %= mod;
        }
    }
    

    ll count[2005] = {0};
    REP(i,N){
        count[A[i]-1]++;
    }
	// REP(i,3) printf("%lld, ", count[i]);
	// printf("\n");
    ll ans2 = 0;
    ll remain = N;
    REP(i,2005){
        remain -= count[i];
        ans2 += count[i]*remain;
    }
	// cout << ans1 << endl;
	// cout << ans2 << endl;
    // K %= mod;
    ll ans = 0;
    ll tmp = K*(K-1);
    tmp /= 2;
    tmp %= mod;
    tmp *= ans2;
    tmp %= mod;
    ans += ans1 * K;
    ans %= mod;
    ans += tmp;
    ans %= mod;
	//出力
	cout << ans << endl;
}
