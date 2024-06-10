#include <algorithm>
#include <iostream>
#include <vector>
#define rep(i, n) for (int i = 0; i < (n); i++)
using namespace std;

int main(void) {
  ios::sync_with_stdio(false);
  int N;
  cin >> N;
  vector<int64_t> A(N);
  rep(i, N) cin >> A[i];

  int64_t answer = 0;
  for (int i = 0; i < N - 1; ++i) {
    for (int j = i + 1; j < N; ++j) {
      int64_t diff = abs(A[i] - A[j]);
      answer = max(answer, diff);
    }
  }
  cout << answer << endl;
  return 0;
}