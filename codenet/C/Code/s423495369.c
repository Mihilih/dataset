#include <stdio.h>

int main (void) {
  int A, B, C;

  scanf ("%d %d %d", &A, &B, &C);

  if (A < C && C < B) {
    printf ("Yes\n");
  } else if (A > C && C > B) {
    printf ("Yes\n");
  } else {
    printf ("No\n");
  }
}