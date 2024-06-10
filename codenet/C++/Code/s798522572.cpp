#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
  int N, T;
  cin >> N >> T;
  int A[N];
  vector<int> B(N);
  for(int i = 0; i < N; i++) cin >> A[i];
  int m = A[0];
  B[1] = A[1] - m;
  m = min(m, A[1]);
  for(int i = 2; i < N; i++){
    B[i] = A[i] - m;
    m = min(m, A[i]);
  }
  cout << count(B.begin(),B.end(),*max_element(B.begin(),B.end())) << endl;
}
