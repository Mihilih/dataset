#include <iostream>

using namespace std;
typedef long long ll;

int main(){
    ll x1, x2, y1, y2;
    cin >> x1 >> y1 >> x2 >> y2;
    const ll dx = x2 - x1, dy = y2 - y1;
    ll x3 = x2 - dy, y3 = y2 + dx;
    ll x4 = x1 - dy, y4 = y1 + dx;
    cout << x3 << ' ' << y3 << ' ' << x4 << ' ' << y4 << endl;
    return 0;
}
