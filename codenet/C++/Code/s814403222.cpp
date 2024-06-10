#include <cstdio>
#include <algorithm>
#include <iostream>
#include <string>
#include <vector>
using namespace std;
typedef pair<int,string> P;
P v[22];
vector<int> d[33];
int main(void){
  int n;
  while(cin >> n && n){
    int m;
    for(int i = 0; i < 33; i++) d[i].clear();
    for(int i = 0; i < n; i++){
      v[i].first = 0;
      cin >> v[i].second >> m;
      for(int j = 0; j < m; j++){
	int a;
	cin >> a;
	v[i].first += n - (int)d[a].size();
	for(int k = 0; k < (int)d[a].size(); k++){
	  v[d[a][k]].first--;
	}
	d[a].push_back(i);
      }
    }
    sort(v,v+n);
    cout << v[0].first << " " << v[0].second << endl;
  }
}