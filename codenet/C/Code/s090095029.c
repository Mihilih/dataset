#include <stdio.h>
#include <stdbool.h>
#include <string.h>

int main() {
  int n, m;
  scanf("%d%d", &n, &m);
  bool r0[n];
  memset(r0, 0x00, n);
  int r1[n];
  int nr1 = 0;
  for (int i = 0; i < m; i++) {
    int a, b;
    scanf("%d%d", &a, &b);
    if (a > b) {
      int t = a;
      a = b;
      b = t;
    }
    if (a == 1) r0[b - 1] = true;
    if (b == n) r1[nr1++] = a - 1;
  }
  bool res = false;
  for (int i = 0; i < nr1; i++) {
    if (r0[r1[i]]) res = true;
  }
  puts(res ? "POSSIBLE" : "IMPOSSIBLE");
  return 0;
}
