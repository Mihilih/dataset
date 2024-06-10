#include<iostream> 
#include<string> 
#include<vector> 
#include<algorithm> 
using namespace std; 
int main()
{
	int a, b, c, d; 
	cin >> a >> b >> c >> d; 
	if (a*b%2==1&&(c+d)%2==1)
	{
		cout << "No" << endl;
	}
	else
	{
		cout << "Yes" << endl;
	}
}


