#include<iostream>
using namespace std;
int main(){
	int n;
	cin>>n;
	string s;
	cin>>s;
	int cnt=0;
	for(int i=0;i<n;i++){
		cnt++;
		int j=i+1;
		for(;j<n;j++){
				if(s[i]!=s[j]){
					break;
				}
		}
		i=j-1;
	}
	cout<<cnt<<endl;
}