#include <iostream>
using namespace std;

int main() {
  string s,t;
  cin>>s>>t;
  s+=s;
  puts(s.find(t)+1?"Yes":"No");
}
