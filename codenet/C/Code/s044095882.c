#include <stdio.h>

int main(void)
{
  long int n;

  scanf("%ld", &n);
  long int a[n];
  long int count[n];

  for (long int i = 1; i < n; i++)
    scanf("%ld", &a[i]);

  for (long int i = 0; i < n; i++)
    count[i] = 0;

  for (long int i = 1; i < n; i++)
    count[a[i]-1]++;

  for (long int i = 0; i < n; i++)
    printf("%ld\n", count[i]);

  return 0;
}
