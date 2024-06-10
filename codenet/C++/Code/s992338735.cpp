#include <iostream>
using namespace std;

int N, S;

int main(){
   while ( cin >> N && N>0){
      int M, m, addup, i;
      M = -1;
      m = 1001;
      addup = 0;
      for ( i = 0; i<N; i++){
         cin >> S;
         addup += S;
         if ( S > M) M = S;
         if ( S < m) m = S;
      }
   cout << (addup - M - m)/(N-2)  << endl;
   }
}