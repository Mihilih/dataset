#include <iostream>
#include <vector>
#include <cstring>

using namespace std;
using ll = long long;

/**
 * ?????¨?????§??????????????°
 *
 * O(EV)
 */
template<int V>
struct BitMatching {
    vector<int> G[2*V];
    int match[2*V];
    bool used[2*V];
    /// ?????????
    void init() {
        for (int i = 0; i < 2*V; i++) {
            G[i].clear();
        }
    }
    /// ?????´???a????????¨?????´???b?????????????????????
    void add(int a, int b) {
        G[a].push_back(b+V);
        G[b+V].push_back(a);
    }

    bool dfs(int v) {
        used[v] = true;
        for (int i = 0; i < G[v].size(); i++) {
            int u = G[v][i], w = match[u];
            if (w < 0 || (!used[w] && dfs(w))) {
                match[v] = u;
                match[u] = v;
                return true;
            }
        }
        return false;
    }
    /// ?????§??????????????°?????¬??°???????????????
    int exec() {
        int res = 0;
        memset(match, -1, sizeof(match));
        for (int v = 0; v < V; v++) {
            if (match[v] < 0) {
                memset(used, 0, sizeof(used));
                if (dfs(v)) {
                    res++;
                }
            }
        }
        return res;
    }
};

const int MN = 520;
BitMatching<MN> bm;
ll gcd(ll a, ll b) {
    if (b == 0) return a;
    return gcd(b, a%b);
}
int main() {
    while (true) {
        int n, m;
        cin >> n >> m;
        if (!n) break;
        bm.init();
        int a[n], b[m];
        for (int i = 0; i < n; i++) {
            cin >> a[i];
        }
        for (int i = 0; i < m; i++) {
            cin >> b[i];
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (gcd(a[i], b[j]) != 1) {
                    bm.add(i, j);
                }
            }
        }
        cout << bm.exec() << endl;
    }
    return 0;
}