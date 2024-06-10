#include<iostream>
#include<cmath>
#include<complex>
#include<cstdlib>
#include<algorithm>
#include<functional>
using namespace std;
int main(void){
    int n,a[100];
    double avg=0,s,ans;
    cin>>n;
    for(int i=0;i<n;i++){
        cin>>a[i];
        avg+=a[i];
    }
    avg/=n;
    s=abs(a[0]-avg);
    ans=0;
    for(int i=1;i<n;i++){
        if(s>abs(a[i]-avg)){
            s=abs(a[i]-avg);
            ans=i;
        }
    }
    cout<<ans<<endl;
    return 0;
}
