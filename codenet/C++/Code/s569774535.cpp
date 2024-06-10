#include<iostream>
#include<vector>
#include<string>
#include<algorithm>
#include<map>
#include<cmath>
#include<queue>
#include<stack>
#include<list>

using namespace std;
using ll = long long;

int main(){
    int n;
    cin>>n;
    vector<int> a(n);
    for(int i=0;i<n;i++){
        cin>>a[i];
    }

    int ans=0;
    bool ok = true;
    while(ok){
        for(int i=0;i<n;i++){
            if(a[i]%2 == 1){
                cout<<ans<<endl;
                return 0;
            }
            else{
                a[i] /= 2;
            }
        }
        ans++;
    }

    cout<<ans<<endl;
}