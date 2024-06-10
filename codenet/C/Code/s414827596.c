#include<stdio.h>

int main(){
	int a,b,c,d,e,f;
	double x,y;
	while(scanf("%d %d %d %d %d %d",&a,&b,&c,&d,&e,&f)!=-1){
		y = (double)(c*d-f*a)/(b*d-e*a);
		x = (double)(c*e-f*b)/(a*e-d*b);
		if(y<=0&&y>-0.0005)y=0;
		if(x<=0&&x>-0.0005)x=0;
		printf("%.3f %.3f\n",x,y);
	}
	return 0;
}