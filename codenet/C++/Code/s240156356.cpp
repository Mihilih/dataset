#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main(){
  string str1, str2;
  cin >> str1 >> str2;

  sort(str1.begin(), str1.end());
  sort(str2.rbegin(), str2.rend());

  int loop = str1.length() > str2.length() ? str2.length() : str1.length();
  bool flag = false;

  for(int i = 0; loop > i; i++){
    char ch1 = str1[i];
    char ch2 = str2[i];

    if(ch1 == ch2){
      if(loop == i + 1 && str1.length() < str2.length()){
        flag = true;
        break;
      }else{
        continue;
      }
    }else{
      if(ch2 > ch1){
        flag = true;
        break;
      }else{
        break;
      }
    }
  }

  if(flag){
    cout << "Yes" << endl;
  }else{
    cout << "No" << endl;
  }
}

