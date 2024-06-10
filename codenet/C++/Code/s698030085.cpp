#include <iostream>
using namespace std;
int main(void) {
	long long int a, b;
	cin >> a >> b;
	if ((a + b) % 2 == 0) {
		cout << (a + b) / 2 << "\n";
	} else {
		cout << "IMPOSSIBLE\n";
	}
}