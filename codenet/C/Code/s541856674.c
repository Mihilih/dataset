#include <stdio.h>

int main() {
	int N = 0;
	int R = 0;

	scanf("%d %d", &N, &R);

	if(N >= 10) {
		printf("%d\n", R);
	} else {
		printf("%d\n", R + 100*(10-N));
	}

	return 0;
}