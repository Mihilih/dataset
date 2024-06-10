#include <stdio.h>

int main() {
	
	int n, i, j, q, x[10000], y[500], sum = 0;
	
	scanf("%d", &n);
	
	for( i = 0; i < n; i++) {
		scanf("%d", &x[i]);
	}
	
	scanf("%d", &q);
	
	for( i = 0; i < q; i++) {
		scanf("%d", &y[i]);
	}
	
	for( i = 0; i < q; i++) {
		for( j = 0; j < n; j++) {
			if( y[i]==x[j]) {
			sum = sum + 1;
			break ;
			}
		}
	}
	
	printf("%d\n", sum);
	
	return 0;
}