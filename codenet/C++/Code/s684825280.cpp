#include<iostream>
#include<algorithm>
#include<vector>

using namespace std;

const int SIZE = (1e5 * 2) + 13;

vector<int> a;
vector<int> cnt(SIZE);

int main(){
    int n, k;
    cin>>n>>k;
    for(int i = 0; i < n; ++i){
        int x;
        cin>>x;
        cnt[x]++;
    }
    for(int i = 0; i < cnt.size(); ++i){
        if(cnt[i] > 0)
            a.push_back(cnt[i]);
    }
    int ans = 0;
    sort(a.begin(), a.end());
    int m = a.size() - k;
    for(int i = 0; i < m; ++i){
        ans += a[i];
    }
    cout<<ans<<endl;
    
}
