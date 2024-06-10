#include <iostream>
#include <string>
#include <queue>
#include <utility>
#include <algorithm>
#include <numeric>
#include <set>
#include <climits>
#include <map>

using namespace std;

long long a[200000];
int ind_a[200000];
int main(){
  int N;
  cin >> N;
  for(int i = 0; i < N; i++){
    cin >> a[i];
  }
  for(int i = 0; i < N; i++){
    ind_a[a[i] - 1] = i;
  }

  set <int> used_inds;
  long long ans = 0;
  for(int i = 0; i < N; i++){
    long long left_border;
    long long right_border;
    long long cur_ind = ind_a[i];
    auto left_it = used_inds.lower_bound(cur_ind);
    auto right_it = used_inds.lower_bound(cur_ind + 1);

    if(left_it == used_inds.begin()){
      left_border = -1;
    } else {
      if(left_it == used_inds.end() || *left_it > cur_ind){
        left_it --;
      }
      left_border = *left_it;
    }
    if(right_it == used_inds.end()){
      right_border = N;
    } else {
      right_border = *right_it;
    }
    ans += (cur_ind - left_border) * (right_border - cur_ind) * ((long long)i + 1);

    //cout << i << " " << left_border << " " << right_border << endl;
    //cout << ans << endl;

    used_inds.insert(cur_ind);
  }

  cout << ans << endl;
  return 0;
}
