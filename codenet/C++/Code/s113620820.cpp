/*
 * 2415.cc: Sashimi
 */

#include<cstdio>
#include<cstdlib>
#include<cstring>
#include<cmath>
#include<iostream>
#include<string>
#include<vector>
#include<map>
#include<set>
#include<stack>
#include<list>
#include<queue>
#include<deque>
#include<algorithm>
#include<numeric>
#include<utility>
#include<complex>
#include<functional>
 
using namespace std;

/* constant */

const int MAX_N = 4000;

typedef long long ll;

const ll LINF = 1LL << 60;

/* typedef */

/* global variables */

ll wis[MAX_N], wsums[MAX_N + 1], dp[MAX_N][MAX_N + 1];
int ks[MAX_N][MAX_N + 1];

/* subroutines */

/* main */

int main() {
  int n;
  cin >> n;

  wsums[0] = 0;
  for (int i = 0; i < n; i++) {
    cin >> wis[i];
    wsums[i + 1] = wsums[i] + wis[i];
  }

  for (int i = 0; i < n; i++) {
    for (int j = 0; j <= n; j++) dp[i][j] = LINF, ks[i][j] = -1;
    dp[i][i + 1] = 0;
    ks[i][i + 1] = i;
  }

  for (int l = 2; l <= n; l++)
    for (int i = 0, j = l; j <= n; i++, j++) {
      ll mind = LINF;
      ll wsum = wsums[j] - wsums[i];
      int mink = -1;
      for (int k = ks[i][j - 1]; k <= ks[i + 1][j]; k++) {
	ll d = dp[i][k] + dp[k][j] + wsum;
	if (mind > d) mind = d, mink = k;
      }
      dp[i][j] = mind;
      ks[i][j] = mink;
    }

  printf("%lld\n", dp[0][n]);
  return 0;
}