#include <algorithm>
#include <iostream>
#include <queue>
#include <cmath>
#include <set>
#include <iomanip>
#include <vector>
using namespace std;
typedef long long ll;
int dx[]={0,1,0,-1};
int dy[]={1,0,-1,0};
#define MAX_V 100001
#define MOD 1000000007
typedef vector<vector<int> > Graph;

int main(){
    int n;cin>>n;
    vector<int> ans(n);
    for(int i=0;i<n-1;i++){
        int a;cin>>a;
        a--;
        ans[a]++;
    }
    for(int i=0;i<n;i++) cout<<ans[i]<<endl;
}
