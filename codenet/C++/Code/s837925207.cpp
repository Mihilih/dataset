#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
#include <cmath>
#include <functional>
#define ll long long int
using namespace std;
int h[6], w[6];

int main() {
	int x, ans = 0;

	cin >> x;

	ans = x + x*x + x*x*x;

	cout << ans << endl;

	return 0;
}