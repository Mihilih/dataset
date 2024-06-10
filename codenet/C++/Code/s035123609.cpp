#include <iostream>

typedef long long ll;

int mat[3000][3000];

ll dp[3000][3000][4];
ll dpl[3000];

int main(int argc, char **argv)
{
    int rr, cc, k;

    std::cin >> rr >> cc >> k;
    for (int i = 1; i <= k; i++) {
        int r, c, v;
        std::cin >> r >> c >> v;
        mat[r - 1][c - 1] = v;
    }
    dp[0][0][1] = mat[0][0];
    for (int y = 0; y < rr; y++) {
        for (int x = 0; x < cc; x++) {
            for (int c = 0; c < 4; c++) {
                int v = mat[y][x];
                ll q;
                if (c == 0 || v == 0) {
                    q = (x == 0) ? dpl[x] : std::max(dpl[x], dp[y][x - 1][c]);
                } else {
                    q = (x == 0) ? dpl[x] + v : std::max(dpl[x] + v, std::max(dp[y][x - 1][c], dp[y][x - 1][c - 1] + v));
                }
                dp[y][x][c] = q;
            }
        }
        for (int x = 0; x < cc; x++) {
            dpl[x] = std::max(std::max(dp[y][x][0], dp[y][x][1]), std::max(dp[y][x][2], dp[y][x][3]));
        }
    }
    std::cout << dpl[cc - 1] << std::endl;
    return 0;
}
