#include <iostream>
#include <vector>

int main()
{
    int n, m;
    std::cin >> n >> m;

    std::vector<int> foods(m);

    for (int i = 0; i < n; i++) {
        int k;
        std::cin >> k;

        for (int j = 0; j < k; j++) {
            int temp;
            std::cin >> temp;
            temp--;

            foods[temp]++;
        }
    }

    int ans = 0;
    for (auto elem : foods) {
        if (elem == n) {
            ans++;
        }
    }

    std::cout << ans << std::endl;
}
