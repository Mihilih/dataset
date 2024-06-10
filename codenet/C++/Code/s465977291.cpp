#include<iostream>
#include<vector>
#include<set>
#include<map>
#include<cmath>
#include<algorithm>
using namespace std;

typedef long long ll;

int main(){
	int n,d;
	cin >> n  >> d;

	double a = d*2+1;
	cout <<  ceil(n/a) <<endl;


	return 0;
}
