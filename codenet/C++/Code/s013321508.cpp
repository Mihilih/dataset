#include <iostream>
#include <cmath>
#include <algorithm>
#include <vector>
#include <list>
#include <numeric>
#include <cstdio>


using namespace std;

int main() {

    int N, M;
    cin >> N >> M ;

    vector<int> L(100000);
    int l;
    for (int i = 0; i < N; i++) {
        scanf("%d", &l);
        L[i] = l;
    }

    sort(L.begin(), L.end());

    vector<int>::iterator itr;
    
    for (int i = 0; i < M; i++) {
        int max_L = L.back();
        if (max_L == 0) {
            break;
        }

        max_L /= 2;
        itr = lower_bound(L.begin(), L.end(), max_L);
        L.insert(itr, max_L);
        L.pop_back();
    }

    long long ans = accumulate(L.begin(), L.end(), 0LL);

    cout << ans << '\n';

}
