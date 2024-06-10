#include<cmath>
#include<cstring>
#include<iostream>
#include<algorithm>
using namespace std;
typedef long long ll;
const int inf = 0x3f3f3f3f;
const int mod = (1 ? 1e9 + 7 : 998244353);



int main()
{
	ios::sync_with_stdio(false); cin.tie(0);
	ll a, b, c, d, e, f, g, T;
	string z;
	cin >> z;
	a = z.size();
	for (int i = 0; i < a - 1; i++)
	{
		if (z[i] == z[i + 1])
		{
			cout << "Bad" << endl;
			return 0;
		}
	}
	cout << "Good" << endl;
}