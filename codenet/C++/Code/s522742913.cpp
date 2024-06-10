#include <iostream>
#include <string>
#include <cmath>
#include <bitset>

using namespace std;

int main()
{
	string source = "";
	cin >> source;

	if(source.length() > 10 || source.length() < 1)
	{
		return -1;
	}

	int max_i = static_cast<int>(pow(2, source.length() - 1));

	double sum = 0;

	for (int i = 0; i < max_i; ++i)
	{
		bitset<100> plus(i);

		double number = 0;

		string working = source;
		while(plus.any())
		{
			int i = 0;
			while(!plus[i]) ++i;
			sum += atof(working.substr(0, i + 1).c_str());
			plus >>= i + 1;
			working = working.substr(i + 1);
		}
		sum += atof(working.c_str());
	}

	cout.precision(0);
	cout << fixed << sum << endl;


	return 0;
}