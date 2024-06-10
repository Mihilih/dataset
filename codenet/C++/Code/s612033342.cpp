#include <iostream>
#include <vector>
#include <algorithm>
 
using namespace std;
using vi = vector<int>;
using vi2 = vector<vi>;

int pow2(int a) {
  int ret = 1;
  for (int i = 0; i < a; i++) ret *= 2;
  return ret;
}

int count(vi2 hw, int a, int b) {
  int sum = 0;
  for (int i = 0; i < hw.size(); i++) {
    for (int j = 0; j < hw[0].size(); j++) {
      if (a >> i & 1 && b >> j & 1 && hw[i][j] == 1) sum++;
    }
  }
  return sum;
}

int main() {
  int h, w, k; cin >> h >> w >> k;
  vi2 hw(h, vi(w, 0));
  for (int i = 0; i < h; i++) {
    for (int j = 0; j < w; j++) {
      char c; cin >> c;
      if (c == '#') hw[i][j] = 1;
    }
  }
  int sum = 0;
  for (int i = 0; i < pow2(h); i++) {
    for (int j = 0; j < pow2(w); j++) {
      if (count(hw, i, j) == k) sum++;
    }
  }
  cout << sum << endl;
}