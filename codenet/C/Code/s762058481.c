#include <stdio.h>
#include <stdlib.h>

int chmin(int a, int b)
{
	if (a > b)
		return b;
	else
		return a;
}


int main(int argc, char const *argv[])
{
	int n;
	scanf("%d", &n);
	int dp[n];
	int h[n];
	for (int i = 0; i < n; ++i)
		dp[i] = 10000;

	for (int i = 0; i < n; ++i)
		scanf("%d", &h[i]);

	dp[0] = 0;
	for (int i = 1; i < n; ++i)
	{			//i - 1の高さから iに移るときのコスト		//i - 2の高さから 以下略
		if (i == 1)dp[1] = abs(h[1] - h[0]);
		else dp[i] = chmin(dp[i - 1] + abs(h[i] - h[i - 1]), dp[i - 2] + abs(h[i] - h[i - 2]));
	}
	printf("%d\n", dp[n - 1]);
	return 0;
}
