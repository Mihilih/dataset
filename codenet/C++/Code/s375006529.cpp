#include<iostream>
#include<string>
#include<vector>
using namespace std;

int main() {
	string s;
	cin >> s;
	int n = s.size();
	int v[26]={};
	for (int i = 0;i < n;i++)v[s[i] - 'a']++;
	string ans = "Yes";
	for (int i = 0;i < 26;i++) {
		if (v[i] % 2 != 0) {
			ans = "No";
			break;
		}
	}
	cout << ans << endl;
}