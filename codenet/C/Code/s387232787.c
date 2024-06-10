#include <stdio.h>

int c[26];

int main(void)
{
	char str[1200];
	for (; scanf("%s", str) > 0;) {
		for (char *p = str; *p; p++) {
			if ('a' <= *p && *p <= 'z') {
				c[*p - 'a']++;
			} else if ('A' <= *p && *p <= 'Z') {
				c[*p - 'A']++;
			}

		}
	}
	for (int i = 0; i < 26; i++) {
		printf("%c : %d\n", 'a' + i, c[i]); 
	}
	return 0;
}

