
#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main()
{
	int a, b, c;

	cin >> a >> b >> c;

	if ((100*a + 10*b + c) % 4 == 0) {
		cout << "YES" << endl;
	}
	else {
		cout << "NO" << endl;
	}
}