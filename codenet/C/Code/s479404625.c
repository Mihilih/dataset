#include <stdio.h>
#include <string.h>

int main()
{
	char A[20], B[20], C[20];

	scanf("%s %s %s", A, B, C);

	int la = strlen(A), lb = strlen(B);

	if (A[la - 1] == B[0] && B[lb - 1] == C[0])
	{
		printf("YES\n");
	}
	else
	{
		printf("NO\n");
	}

	return 0;
}