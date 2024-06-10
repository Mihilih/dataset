#include<iostream>
using namespace std;
int main(){
  int n;
  int array[100];
  cin>>n;
  for(int i=0;i<n;i++){
    cin>>array[i];
  }
  
  int sum=0;
  for(int i=0;i<n-1;i++){
    for(int j=i+1;j<n;j++){
      sum+=array[i]*array[j];
    }
  }
  
  cout<<sum<<endl;
  return(0);
}