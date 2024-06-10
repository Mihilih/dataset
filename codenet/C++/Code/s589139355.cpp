#include <iostream>
#include <string>
#include <math.h>
#include <stdio.h>

using namespace std;

int main(){
int a,t=0,h=0,lt,lh,tt,hh,l;
cin >> a;
string taro,hana;
for(int i=0; i<a; ++i){
cin >> taro >> hana;
lt= taro.length();
lh= hana.length();
if(lt>lh){
l=lt;
}
else{
l=lh;
}
tt=0;
hh=0;

if(taro>hana){
t=t+3;
}
else if(hana>taro){
h=h+3;
}
else if(hana==taro){
h=h+1;
t=t+1;
}
}
cout<<t<<" "<<h<<endl;

    return 0;
}