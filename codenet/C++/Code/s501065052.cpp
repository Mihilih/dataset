#include <iostream>

using namespace std;

int main(void) {
    int N;
    cin >> N;
    int mem[N + 1];
    for (int i = 1; i <= N; ++i) {
        int P;
        cin >> P;
        mem[P] = i;
    }

    int maxcnt = 1;
    int cnt = 1;
    for (int i = 1; i < N; ++i) {
        if (mem[i] < mem[i + 1]) {
            cnt++;
        } else {
            maxcnt = max(maxcnt, cnt);
            cnt = 1;
        }
        if (i == N - 1) {
            maxcnt = max(maxcnt, cnt);
        }
    }
//    cnt = 1;
//    for (int i = N; i > 1; --i) {
//        if(mem[i] > mem[i-1]){
//            cnt++;
//        }
//    }

    cout << N - maxcnt << endl;
    return 0;
}