
#include <iostream>
#include <algorithm>
#include <string>
int main()
{
	using namespace std;
	string s, t;
	cin >> s;
	t = s[0];
	t += to_string(s.size()-2);
	t += s[s.size() - 1];
	cout << t << endl;
}
