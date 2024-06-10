#include <iostream>
using namespace std;

long long Euclid(long long x, long long y) {
	long long tmp;

	if (x < y) {
		tmp = x;
		x = y;
		y = tmp;
	}

	if (!(x%y)) return y;
	return Euclid(y, x%y);
}

int main() {
	long long A, B; cin >> A >> B;

	cout << (A*B) / Euclid(A, B) << endl;
}