#include <iostream>

using namespace std;

unsigned long a[100100];

int main(void)
{
	int k;
	unsigned long min, max;
	scanf("%d", &k);

	for (int i = 0; i < k; i++)
		scanf("%ld", &a[i]);

	max = 3, min = 2;

	if (a[k - 1] != 2) {
		cout << -1 << endl;
		return 0;
	}

	for (int i = k - 2; i >= 0; i--) {
		if (a[i] > max) {
			cout << -1 << endl;
			return 0;
		} else {
			max = ((max / a[i]) + 1) * a[i] - 1;
			if (min % a[i] != 0) {
				min = ((min / a[i]) + 1) * a[i];
			}
		}

		if (max <= min) {
			cout << -1 << endl;
			return 0;
		}
	}

	printf("%ld %ld\n", min, max);

    return 0;
}
