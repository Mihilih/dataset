#include <iostream>
#include <vector>

int main()
{
    int n;
    std::cin >> n;

    std::vector<long long> a(n);
    for (int i = 0; i < n; i++) {
        std::cin >> a[i];
    }

    std::vector<long long> abs_a = a;

    for (int i = 0; i < n; i++) {
        if (abs_a[i] < 0) {
            abs_a[i] = -abs_a[i];
        }
    }

    long long ans = 0;
    long long min = abs_a[0];
    for (auto e : abs_a) {
        ans += e;
        if (min > e) {
            min = e;
        }
    }
    int num_negative = 0;
    for (auto e : a) {
        if (e < 0) {
            num_negative++;
        }
    }

    if (num_negative % 2) {
        ans -= min * 2;
    }

    std::cout << ans << std::endl;
}
