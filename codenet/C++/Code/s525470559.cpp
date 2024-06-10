#include <iostream>
#include <queue>

using namespace std;

struct task {
    string name;
    int time;
};

int main()
{
    int n, q;
    int elaps = 0;
    queue<task> Q;

    cin >> n >> q;

    for(int i = 0; i < n; i++) {
        task tmp;
        cin >> tmp.name >> tmp.time;
        Q.push(tmp);
    }

    while(!Q.empty()) {
        task p = Q.front(); Q.pop();
        if(p.time <= q) {
            elaps += p.time;
            cout << p.name << " " << elaps << endl;
        }
        else {
            p.time -= q;
            elaps += q;
            Q.push(p);
        }
    }
    return 0;
}