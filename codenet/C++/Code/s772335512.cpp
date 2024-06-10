#include <iostream>
#include <vector>

using namespace std;

vector<int> G[100000];
bool used[100000];
int grundy[100000];

void dfs(int v){
    used[v] = true;
    grundy[v] = 0;
    for(int i = 0; i < G[v].size(); i++){
        if(!used[G[v][i]]){
            dfs(G[v][i]);
            grundy[v] ^= (grundy[G[v][i]]+1);
        }
    }
}

int main(){
    int N;
    cin >> N;
    for(int i = 0; i < N-1; i++){
        int x, y;
        cin >> x >> y;
        x--; y--;
        G[x].push_back(y);
        G[y].push_back(x);
    }
    dfs(0);
    if(grundy[0] != 0){
        cout << "Alice" << endl;
    }else{
        cout << "Bob" << endl;
    }
}