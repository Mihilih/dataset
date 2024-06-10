#include<stdio.h>
void swap(int *a , int *b) {
	int tmp;
	tmp = *a;
	*a = *b;
	*b = tmp;
}
int main () {
	int a , b;
	while(1) {
		scanf("%d %d" , &a , &b);
		if (a == 0 && b == 0) break;
		if (b < a) swap(&a , &b);
		printf("%d %d\n" , a , b);
	}
	return 0;
}