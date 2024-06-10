#include<iostream>
using namespace std;
int main(){
  int n,a[101],i;
  cin >> n;
  for(i=0; i<n;i++)
  cin >> a[i];
  cout << a[n-1];
  for(i=1;i<n;i++)
  cout<< " " << a[n-i-1];
  cout << endl;
  return 0;
}
