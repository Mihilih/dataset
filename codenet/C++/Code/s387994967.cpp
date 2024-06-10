#include <iostream>
using namespace std;

int main()
{
    int A , B;
    cin>>A>> B;
    if(A<13 && A>=6){
         cout<<B/2<<endl;
    }
    if(A<6){
        cout<<0<<endl;

    }
    if(A>=13){
        cout<<B<<endl;        
    }
}
