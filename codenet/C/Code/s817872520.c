// AOJ 2601: Evacuation Route
// 2017.11.26 bal4u@uu

#include <stdio.h>
#include <stdlib.h>

#define INF 0x5fffffff
int a[100002];
int b[100002];

char buf[700002], *p;
int getint()
{
	int n = 0;
	if (*p == '-') {
		p++; while (*p >= '0') n = (n<<3) + (n<<1) + (*p++ & 0xf);
		return -n;
	}
	while (*p >= '0') n = (n<<3) + (n<<1) + (*p++ & 0xf);
	return n;
}

int main()
{
	int w, i, k, f, close, ans;

	fgets(p=buf, 10, stdin), w = getint();
	fgets(p=buf, sizeof(buf), stdin);
	for (ans = 0, f = 0, i = 1; i <= w; i++) {
		a[i] = k = getint(), p++;
		if (!k) f |= 1;
		else if (k < 0) f |= 2;
		else ans += k;
	}
	if (!ans || !(f & 1)) { puts("0"); return 0; }
	if (!(f & 2)) { printf("%d\n", ans); return 0; }

	for (close = 0, f = 0, i = 1; i <= w; i++) {
		if (!a[i]) close = INF, f = -1;
		else if (a[i] < 0) {
			if (f < 0 || close - (i-f) > -a[i]) close = -a[i], f = i;
		} else {
			if (f < 0) b[i] = INF;
			else {
				k = close - (i-f); if (k < 0) k = 0;
				b[i] = k;
			}
		}
	}

	for (close = 0, f = w, i = w; i >= 1; i--) {
		if (!a[i]) close = INF, f = -1;
		else if (a[i] < 0) {
			if (f < 0 || close - (f-i) > -a[i]) close = -a[i], f = i;
		} else {
			if (f < 0) b[i] = INF;
			else {
				k = close - (f-i); if (k < 0) k = 0;
				if (k > b[i]) b[i] = k;
			}
		}
	}

	for (ans = 0, i = 1; i <= w; i++) {
		if (a[i] > 0) {
			if (b[i] > a[i]) ans += a[i];
			else             ans += b[i];
		}
	}
	printf("%d\n", ans);
	return 0;
}