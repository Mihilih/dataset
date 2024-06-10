#include <stdio.h>

main()
{
	int   a,b,mawari,menseki;
	
	scanf("%d %d" , &a, &b);
	mawari=a+a+b+b;
	menseki=a*b;
	printf("%d %d\n",menseki,mawari);
	return 0;
}