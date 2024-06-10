#include <stdio.h>

int main(){
  int n, fd[6] = {}, i, j;
  double height;

  scanf("%d", &n);
  while(n--){
    scanf("%lf", &height);
    if(height >= 185.0) fd[5]++;
    else if(height >= 180.0) fd[4]++;
    else if(height >= 175.0) fd[3]++;
    else if(height >= 170.0) fd[2]++;
    else if(height >= 165.0) fd[1]++;
    else fd[0]++;
  }

  for(i = 0;i < 6;i++){
    printf("%d:", i + 1);
    for(j = 0;j < fd[i];j++)
      putchar('*');
    puts("");
  }
  return 0;
}