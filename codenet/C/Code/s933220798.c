#include <stdio.h>

int main(void)
{
	double a;
	double ave = 0;
	int i;
	
	for (i = 0; i < 5; i++){
		scanf("%lf", &a);
		if (a <= 40){
			ave += 40;
		}
		else {
			ave += a;
		}
	}
	//printf("%.0f\n", ave);
	
	ave /= 5.0;
	
	printf("%.0f\n", ave);
	
	return (0);
}