// ACM-ICPCアジア地区予選2014 B. Miscalculation

#include <iostream>
#include <string>

using namespace std;

int mul(const string& str, int& idx){
	int res = str[idx]-'0';
	while(idx+1 < str.size() && str[idx+1]=='*'){
		idx += 2;
		res *= str[idx]-'0';
	}
	return res;
}

int add(const string& str, int& idx){
	int res = mul(str, idx);
	while(idx+1 < str.size() && str[idx+1] == '+'){
		idx += 2;
		res += mul(str, idx);
	}
	return res;
}

int bob(const string& str, int& idx){
	int res = str[idx]-'0';
	while(idx+1 < str.size()){
		if(str[idx+1] == '+') res += str[idx+2]-'0';
		else                  res *= str[idx+2]-'0';
		idx += 2;
	}
	return res;
}

int main(){
	string s; int d;
	while(cin >> s >> d){
		int idx = 0;
		int a = add(s, idx);
		idx = 0;
		int b = bob(s, idx);
		if(a == d){
			cout << (b == d ? "U" : "M") << endl;
		} else {
			cout << (b == d ? "L" : "I") << endl;
		}
	}
}