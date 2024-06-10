#include <iostream>
#include <algorithm>
#include <vector>
#include <string>
#include <cmath>

using namespace std;

int main(void){
    int minA = pow(10,9) + 1;
    int num = 0;
    
    int n,t,f = 0;
    cin >> n >> t;
    vector<int> A(n);
    
    for(int i = 0; i < n; i++){
        cin >> A[i];
    }
    
    for(int i = 0; i < n; i++){
        if(minA > A[i]){
            minA = A[i];
        }else{
            
            if(f == A[i] - minA)num++;
            else if(f < A[i] - minA){
                num = 1;
                f = A[i] - minA;
            }
            
        }
    }
    
    cout << num << endl;
    
    
}
