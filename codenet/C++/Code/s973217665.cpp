#include <iostream>
#include <fstream>
#include <cstdio>
#include <cmath>
#include <vector>
#include <cstring>
#include <string>
#include <set>
#include <map>
#include <stack>
#include <queue>
#include <algorithm>
using namespace std;
 
#define REP(i,n) for(int i=0; i<n; ++i)
#define FOR(i,a,b) for(int i=a; i<=b; ++i)
#define FORR(i,a,b) for (int i=a; i>=b; --i)
#define pi M_PI
 
typedef long long ll;
typedef vector<int> VI;
typedef vector<ll> VL;
typedef vector<VI> VVI;
typedef pair<int,int> P;
typedef pair<ll,ll> PL;

int main() {
    int n;
    cin >> n;
    while (n--){
        int p, q;
        cin >> p >> q;
        int l = sqrt(p*p + q*q);
        bool isprime = 1;
        REP(i,l) REP(j,l) {
            int x = i*i + j*j;
            if (x <= 1 || x >= p*p + q*q) continue;
            if ((i*p + j*q) % x == 0 && (i*q - j*p) % x == 0) isprime = 0;
        }
        cout << (isprime ? "P" : "C") << endl;
    }

    return 0;
}