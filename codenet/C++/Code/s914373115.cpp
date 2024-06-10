#include <iostream>
#include <vector>
using namespace std;
void A(void);
void B(void);
void C(void);
void D(void);

int main(void){
    B();
}

void B(void){
    long long int x,sum;
    cin>>x;
    int i;
    sum=100;
    for(i=0;sum<x;++i){
        sum+=sum/100;
    }
    cout<<i<<endl;
}