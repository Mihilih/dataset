#include <iostream>
#include <algorithm>
using namespace std;
int main(){
	int n;
	cin >> n;
	int a;
	cin >>a;
	int sum=0;
	int s[n];
	for(int i=0;i<n;i++){
		cin >> s[i];
	}
	sort(s,s+n);
	for(int i=n-1;i>n-a-1;i--){
		sum += s[i];
	}
	cout << sum << endl;
	return 0;
}