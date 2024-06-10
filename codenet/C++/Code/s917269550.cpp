#include <iostream>
#include <cmath>

using namespace std;

int main(){
  long long x, y;
  cin >> x >> y;
  if(abs(x-y) <= 1) cout << "Brown" << endl;
  else cout << "Alice" << endl;
}
