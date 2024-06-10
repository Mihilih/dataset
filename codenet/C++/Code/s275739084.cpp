#include<iostream>
using namespace std;
int main()
{
  int A,B;
  cin>>A>>B;
  int C=A+B;
  if(A%3!=0 && B%3!=0 && C%3!=0)
    {
      cout<<"Impossible"<<endl;
    }else{
    cout<<"Possible"<<endl;
  }
  return 0;
}
