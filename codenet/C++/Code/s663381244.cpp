#include <cstdlib>
#include <iostream>
#include <vector>
using namespace std;

int main() {
	cin.tie(0);
	ios::sync_with_stdio(false);

	vector<int> m;
	m.push_back(10);
	m.push_back(50);
	m.push_back(100);
	m.push_back(500);

	bool first = true;
	for(int money; cin >> money, money;) {
		if(!first)
			cout << endl;

		first = false;
		int sum = 0;
		vector<int> num(4);
		for(int i = 0; i < 4; ++i) {
			cin >> num[i];
			sum += num[i] * m[i];
		}

		int change = sum - money;
		for(int i = 3; i >= 0; --i) {
			if(change / m[i]) {
				num[i] = num[i] - change / m[i];
				change %= m[i];
			}
		}

		for(int i = 0; i < 4; ++i)
			if(num[i] > 0)
				cout << m[i] << " " << num[i] << endl;
	}

	return EXIT_SUCCESS;
}