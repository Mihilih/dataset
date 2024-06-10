#include <iostream>
#include <vector>
#include <array>
#include <deque>
#include <stack>
#include <queue>
#include <list>
#include <map>
#include <set>
#include <algorithm>
#include <numeric>
#include <utility>
#include <cmath>

using namespace std;
using ll=long long int;

int gcd(int a, int b) {
    if (a < b) swap(a, b);
    int r;
    while ((r = a%b) > 0) {
        a = b;
        b = r;
    }
    return b;
}

int main() {
    int n;
    cin >> n;

    int ans;
    cin >> ans;

    for (int i = 1; i < n; ++i) {
        int a;
        cin >> a;
        ans = gcd(ans, a);
    }

    cout << ans << endl;

    return 0;
}
