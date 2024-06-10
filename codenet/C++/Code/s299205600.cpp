#include <iostream>
#include <string>
using namespace std;

int main() {
    int a;
    int b;
    cin >> a;
    cin >> b;
    int result;
    if (a > b) {
        result = 2 * a - 1;
    } else if (a == b) {
        result = 2 * a;
    } else {
        result = 2 * b - 1;
    }
    cout << result << endl;

	return 0;
}
