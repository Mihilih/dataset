#include<iostream>
#include<vector>
using namespace std;

int main(){
  int n;
  int sq[10000],fr[5000];
  vector<int> com;
  int tmp;

  while(1){
    cin >> n;
    if(!n)break;

    for(int i=1;i<n;i++)sq[i] = (i*i)%n;
    com.clear();

    for(int i=1;i<n;i++){
      bool f = true;
      for(int j=0;j<com.size();j++){
	if(com[j]==sq[i]){
	  f = false;
	  break;
	}
      }
      if(f)com.push_back(sq[i]);
    }
 
    for(int i=0;i<=(n-1)/2;i++)fr[i] = 0;

    for(int i=0;i<com.size();i++){
      for(int j=0;j<com.size();j++){
	if(i!=j){
	  tmp = com[i]-com[j];
	  if(tmp<0)tmp+=n;
	  if(tmp>(n-1)/2)tmp = n - tmp;
	  fr[tmp]++;
	}
      }
    }

    for(int i=1;i<=(n-1)/2;i++)cout << fr[i] << endl;
  }
}