#include <stdio.h>

int main() {
	int n, k, cnt;

	scanf("%d%d", &n, &k);
	cnt = 0;
	while (n--) {
		int h;

		scanf("%d", &h);
		if (h >= k)
			cnt++;
	}
	printf("%d\n", cnt);
	return 0;
}