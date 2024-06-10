#include<iostream>
#include<cmath>
using namespace std;

int main() {
    int N = 0;
    cin >> N;
    int A[N];
    for (int i = 0; i < N; i++) cin >> A[i];

    int m = A[0];
    int M = A[0];
    for (int i = 0; i < N; i++) {
        if (A[i] < m) m = A[i];
        if (A[i] > M) M = A[i];
    }

    cout << M - m << endl;

    return 0;
}