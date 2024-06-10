#include <iostream>

#define rep(i,n) for(int i=0;i<n;i++)

using namespace std;

int main()
{
    int h1,h2,m1,m2,k;
    cin>>h1>>m1>>h2>>m2>>k;
    int ans = h2*60+m2-(h1*60+m1);
    
    cout << ans-k << endl;
    

    return 0;
}