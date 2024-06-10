#include <iostream>
using namespace std;
string str;

int main() {
  	cin >> str;
  	if (str[2] == str[3] && str[4] == str[5]) cout << "Yes\n";
  	else cout << "No\n";
}
