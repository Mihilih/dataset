#include <stdio.h>

int main(){
  int key, i, j, len, a[101];
  scanf("%d", &len);
  for(i = 0;i < len;i++) scanf("%d", a + i);

  for(j = 1;j < len;j++){
    for(i = 0;i < len;i++) printf(i != 0 ? " %d":"%d", a[i]);
    puts("");
    key = a[j];
    for(i = j - 1;i >= 0 && a[i] > key;i--) a[i + 1] = a[i];
    a[i + 1] = key;
  }

  for(i = 0;i < len;i++) printf(i != 0 ? " %d": "%d", a[i]);
  puts("");
  return 0;
}