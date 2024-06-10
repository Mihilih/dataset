#include <stdio.h>

int main() {
  int height, width, i;
  scanf("%d %d", &height, &width);
  char input_str[width+1];
  for(i = 0; i < width + 2; i++) {
    printf("#");
  }
  printf("\n");
  for(i = 0; i < height; i++) {
    scanf("%s", input_str);
    printf("#%s#\n", input_str);
  }
  for(i = 0; i < width + 2; i++) {
    printf("#");
  }
  printf("\n");
  return 0;
}
