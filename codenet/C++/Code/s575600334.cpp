#include <iostream>
#include <cstdio>

using namespace std;

void binPrint(int x, int bits){
  for (int i=bits-1; i>=0; i--){
    cout << (x&(1<<i)?1:0);
  }
  cout << endl;
}
int main(void){
  unsigned a,b;
  cin >> a >> b;

  binPrint(a&b, 32);
  binPrint(a|b, 32);
  binPrint(a^b, 32);
  
  return 0;
}

