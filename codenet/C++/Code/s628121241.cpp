#include<iostream>
#include<algorithm>
#include<stdlib.h>
using namespace std;

int gcd(int a,int b) {
	if (a == 0) return b;
	return gcd(b % a, a);
}

int main() {
	int R;
	cin >> R;
	if (R < 1200)cout << "ABC" << endl;
	else if (R >= 2800)cout << "AGC" << endl;
	else cout << "ARC" << endl;
}