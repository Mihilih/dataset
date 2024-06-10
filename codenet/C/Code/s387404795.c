#include <stdio.h>
#include <string.h>

int main(void) {
	char str[201], tmp[101];
	char p[101];
	int slen, plen;
	int i, j, flag;
	
	scanf("%s %s", str, p);
	
	strcpy(tmp, str);
	strcat(str, tmp);
	
	slen = strlen(str);
	plen = strlen(p);
	
	flag = 0;
	for (i = 0; i < slen - plen; i++) {
		if (strncmp(&str[i], p, plen) == 0) flag = 1;
	}
	
	if (flag) puts("Yes");
	else puts("No");
	
	return 0;
}

