#include<iostream>
using namespace std;
int main(){
  int N,ans,i,count;
  cin >> N;
  int A[N];
  for(i = 0;i<N;i++){
      cin>>A[i];
  }
  i = 0;
  ans = 0;
  count = 0;
  while(A[i+1] != NULL){
    if(A[i] == A[i+1]){
      count++;
      if(count%2 != 0)
        ans++;
    }
    else
      count = 0;
    i++;
  }
  
  cout << ans << "\n";
  return 0;
}