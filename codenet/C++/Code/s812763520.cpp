#include <iostream>
#include <algorithm>
using namespace std;

int main(){
  int n, ans = 0;
  string a, b, c;
  cin >> n;
  cin >> a >> b >> c;
  
  for(int i = 0; i < n; i++){
    if(a[i] == b[i] && b[i] == c[i]){
    }else if(a[i] == b[i] || b[i] == c[i] || a[i] == c[i]){
      ans++;
    }else{
      ans += 2;
    }
  }
  cout << ans << endl;
}