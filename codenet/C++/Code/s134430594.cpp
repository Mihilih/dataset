#include <iostream>
#include <vector>
#include <map>
#include <set>
#include <queue>
#include <algorithm>
#include <string>
#include <cmath>
#include <cstdio>
#include <iomanip>
#include <fstream>
#include <cassert>
#include <cstring>
#include <unordered_set>
#include <unordered_map>
#include <numeric>
#include <ctime>
#include <bitset>
#include <complex>
#include <random>

using namespace std;

#define int long long

struct Ban {
    int l;
    int r;
    int val;

    Ban() {}

    Ban(int l_, int r_, int val_) {
        l = l_;
        r = r_;
        val = val_;
    }
};

namespace Sp {
    const int LIM = 20; 
    const int N = 2e5 + 7;

    int mn[LIM][N];
    int pw[N];

    void init(vector<int> a) {
        int n = (int)a.size();
        for (int i = 0; i < n; i++) {
            mn[0][i] = a[i]; 
        }
        for (int i = 0; i + 1 < LIM; i++) {
            for (int j = 0; j + (1 << (i + 1)) <= n; j++) {
                mn[i + 1][j] = max(mn[i][j], mn[i][j + (1 << i)]);
            }
        }
        pw[1] = 0;
        for (int i = 2; i < N; i++) {
            pw[i] = pw[i / 2] + 1;
        }
    } 

    int get(int l, int r) {
        r++;
        int p = pw[r - l];
        return min(mn[p][l], mn[p][r - (1 << p)]);
    }
}

signed main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);

    int n;
    cin >> n;
    vector<int> a(n);
    for (auto &t : a) {
        cin >> t;
    }
    vector<int> dl(n);
    for (int i = 0; i < n; i++) {
        if (a[i] > i) {
            cout << -1 << endl;
            return 0;
        }
        dl[i] = i - a[i];
    }
    // for (auto t : dl) {
    //     cerr << t << ' ';
    // }
    // cerr << endl;
    int ans = 0;
    vector<Ban> bans;
    for (int i = 0; i < n; i++) {
        int r = i;
        while (r + 1 < n && a[r] + 1 == a[r + 1]) {
            r++;
        }
        ans += a[r];
        i = r;
        bans.push_back(Ban(r - a[r], r, r - a[r]));
    }
    Sp::init(dl);
    for (auto t : bans) {
        // cerr << t.l + 1 << ' ' << t.r + 1 << ' ' << t.val << endl;
        if (Sp::get(t.l, t.r) > t.val) {
            cout << - 1 << endl;
            return 0;
        }
    }
    cout << ans << endl;
}   