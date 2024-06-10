#include <iostream>
#include <string>
#include <algorithm>
using namespace std;

#define rep(i,n) for (int i = 0; i < int(n); i++)

string input, ss;
int a[3], it, cnt;

int Not(int x) {
    return 2-x;
}

int And(int x, int y) {
    if (x*y == 0) return 0;
    if (x == 2 && y == 2) return 2;
    return 1;
}

int Or(int x, int y) {
    if (x == 2 || y == 2) return 2;
    if (x == 1 || y == 1) return 1;
    return 0;
}

int parse() {
    char c = ss[it++];
    if ('0' <= c && c <= '2') return c-'0';
    if (c == '-') return Not(parse());

    int x = parse();
    c = ss[it++];
    int y = parse();
    ++it;
    return c == '*' ? And(x, y) : Or(x, y);
}

int main() {
    while (cin >> input && input != ".") {
        rep (i,3) a[i] = i;
        cnt = 0;
        rep (i,3) rep (j,3) rep (k,3) {
            a[0] = i; a[1] = j; a[2] = k;
            ss = input;
            for (char& c : ss) {
                if (c == 'P') c = a[0]+'0';
                if (c == 'Q') c = a[1]+'0';
                if (c == 'R') c = a[2]+'0';
            }
            it = 0;
            if (parse() == 2) cnt++;
        }
        cout << cnt << endl;
    }
}