#include <iostream>
#include <vector>
#define rep(i, k, n) for (int i = k; i < n; ++i)
using namespace std;

template<class T> inline void chmin(T &a, T b) {if (a > b) a = b; return;}
const int INF = 1 << 30;

int main(){
  vector<int> dp(101000, INF);
  dp.at(0) = 0;
  // input
  int N, K;
  cin >> N >> K;
  vector<int> h(N);
  rep(i, 0, N) cin >> h[i];

  //dp
  rep(i, 0, N) {
    rep(j, 1, K + 1) {
      chmin(dp[i + j], dp[i] + abs(h[i] - h[i + j]));
    }
  }

  // output
  cout << dp[N - 1] << endl;
  return 0;
}
