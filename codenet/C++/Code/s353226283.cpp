#include <vector>
#include <iostream>
#include <algorithm>
int n, k, t;
std::vector<int> vec;
int ans = 1000000001;
int main() {
    std::cin >> n >> k;
    for (int i = 0; i < n; i++) {
        std::cin >> t;
        vec.push_back(t);
    }
    std::sort(vec.begin(), vec.end());
    for (int i = 0; i + k -1 < n; i++) {
        int diff = vec[i+k-1] - vec[i];
        if (diff < ans) {
            ans = diff;
        }
    }
    std::cout << ans << std::endl;
    
}
