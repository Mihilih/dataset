#include <iostream>
#include <string>

using namespace std;

int main() {
    string s;
    cin >> s;
    int a, z;
    for(int i = 0; i < s.size(); i++) {
        if (s[i] == 'A') {
            a = i;
            break;
        }
    }
    for(int i = s.size() - 1; i >= 0; i--) {
        if (s[i] == 'Z') {
            z = i;
            break;
        }
    }
    cout << z - a + 1 << endl;
    return 0;
}