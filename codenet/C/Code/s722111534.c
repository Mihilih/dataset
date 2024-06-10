#include<stdio.h>
int main(){
  int hcell,wcell,hpaint,wpaint,nblack,nwhite;
  //順にマス行、マス列、塗る行、塗る列、塗られたマス、白いマス
  scanf("%d %d",&hcell,&wcell);
  scanf("%d %d",&hpaint,&wpaint);
  nblack = (wcell*hpaint) + (hcell*wpaint) - (hpaint * wpaint);
  nwhite = (hcell*wcell) - nblack;
  printf("%d\n",nwhite);
  return 0;
}