#include <iostream>
//#include <set>
//#include <map>
//#include <iomanip>
//#include <algorithm>
//#include <numeric>
//#include <queue>
//#include <stack>
//#include <math.h>
#include <vector>
//#include <unordered_map>
//#include <string>
typedef long long LL;
//typedef long double LD;
using namespace std;

#define MOD 1000000007

LL mod_pow(LL x, LL n){
    LL ans = 1;
    while(n>0){
        if((n&1)==1){
            ans = ans * x % MOD;
        }
        x = x * x % MOD;
        n >>= 1;
    }
    return ans;
}

LL comb_s(LL n, LL r){
    LL tmp_n=1;
    LL tmp_d=1;
    LL ans;
    for(int i=1; i<=r; i++){
        tmp_n=(tmp_n*(n+1-i))%MOD;
        tmp_d=(tmp_d*i)%MOD;
        ans=tmp_n*mod_pow(tmp_d,MOD-2);
    }

    return ans;    
}

int main() {
    LL n;
    LL n_tmp;
    LL a;
    LL b;
    LL ans=1;

    cin >> n >> a >> b;
    ans=mod_pow(2,n);
    ans--;
    LL tmp_nd;
    tmp_nd=comb_s(n,a);
    ans=(ans-tmp_nd)%MOD;
    while(ans<0){
        ans+=MOD;
    }
    //cout << ans << " " << tmp_ans << endl;

    tmp_nd=comb_s(n,b);
    ans=(ans-tmp_nd)%MOD;
    //cout << ans << " " << tmp_ans << endl;
    while(ans<0){
        ans+=MOD;
    }

    cout << ans << endl;

    return 0;
}