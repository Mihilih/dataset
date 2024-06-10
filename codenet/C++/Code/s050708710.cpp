#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <string>
#include <vector>
#include <algorithm>
#include <numeric>
#include <map>
#include <stack>
#include <queue>
#include <iomanip>
using namespace std;
using ll = long long;
using P = pair<int, int>;


int main()
{
    int r, g, b, n;
    cin >> r >> g >> b >> n;
    int ans = 0;
    for (int i = 0; i <= n / r; ++i)
    {
        for (int j = 0; j <= n / g; ++j)
        {
            int num = n - r * i - g * j;
            if (num >= 0 && num % b == 0)
            {
                ++ans;
            }
        }
    }

    cout << ans << endl;
    return 0;
}
