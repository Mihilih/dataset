#include <stdio.h>
#include <stdlib.h>
int main() {
  int n;
  int *data;
  scanf("%d\n",&n);
  data = (int*)malloc(sizeof(int)*n);
  for(int i=0; i<n; i++) scanf("%d",&data[i]);
  int max = 0, index;
  for(int i=0; i<n; i++) if(data[i] > max) {max = data[i];index=i;}
  int a = 0;
  for(int i=0; i<n; i++) if(i != index) a += data[i];
  if(a > max)printf("Yes\n");
  else printf("No\n");
  return 0;
}