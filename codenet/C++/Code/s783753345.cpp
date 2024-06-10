#include<iostream>
#include<string>
using namespace std;
int main() {
	int a, b;
	char S;
	while (true) {
		cin >> a >> S >> b;
		if (S == '+') cout << a + b << endl;
		if (S == '-')cout << a - b << endl;
		if (S == '*')cout << a * b << endl;
		if (S == '/')cout << a / b << endl;
		if (S == '?') break;
	}
}
