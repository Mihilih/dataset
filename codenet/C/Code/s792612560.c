#include <stdio.h>

int main(void) {
	int n;
	unsigned long long int m;
	scanf("%d",&n);
	m=n;
	n--;
	for(;n>1;n--) {
		m*=n;
	}
	printf("%lld\n",m);
	return 0;
}