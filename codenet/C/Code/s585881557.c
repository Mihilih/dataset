#include <stdio.h>

int main(void) {
	int h,r;
	scanf("%d%d",&h,&r);
	if(r > -h){printf("1\n");}
	else if (r == -h){printf("0\n");}
	else{printf("-1\n");}
	return 0;
}