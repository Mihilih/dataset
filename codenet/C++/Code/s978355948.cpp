#include <iostream>
#include <vector>

using namespace std;

int main(){
	int N, X;
	cin >> N >> X;
	vector<int> L(N);
	for(int i = 0; i < N; i++)
		cin >> L[i];
	
	int i;
	int d = 0;
	for(i = 0; i < N; i++){
		d = d + L[i];
		if(d > X)
			break;
	}

	cout << i+1 << endl;
}