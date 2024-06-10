#include<cstdio>
#include<cstring>
#include<cstdlib>
#include<iostream>
#include<algorithm>
#include<cmath>
using namespace std;
//#define double long double
const double PI=acos(-1.0);
int sig(double d) {
	return fabs(d) < 1e-8 ? 0 : d < 0 ? -1 : 1;
}

struct Point {
	double x, y;
	double k;
	Point(){}
	Point(double x, double y): x(x), y(y) {}
	void set(double x, double y) {
		this->x = x;
		this->y = y; 
	}
	double mod() {
		return sqrt(x*x+y*y);
	}
	double mod_pow() {
		return x*x + y*y;
	}
	void output() {
		printf("x = %f, y = %f\n", x, y);
	}
	bool operator < (const Point &p) const {
		return sig(x-p.x) != 0 ? x < p.x : sig(y-p.y) < 0;
	}
}P[110];
int ch[110];
double ang[110],ans[110];
double dot(Point &o, Point &a, Point &b) {
	return (a.x-o.x)*(b.x-o.x) + (a.y-o.y)*(b.y-o.y);
}

double dot(Point &a, Point &b) {
	return a.x*b.x + a.y*b.y;	//(a.x-o.x)*(b.x-o.x) + (a.y-o.y)*(b.y-o.y);
}
double cross(Point o, Point a, Point b) {
	return (a.x - o.x)*(b.y - o.y)-(b.x - o.x)*(a.y - o.y);
}
int btw(Point &x, Point &a, Point &b) {
	return sig(dot(x, a, b));
}
double dis(Point a, Point b) {
	return sqrt((a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y));
}

double cos(Point o, Point a, Point b) {
	return dot(o,a,b)/dis(o,a)/dis(o,b);
}

int jarvis(Point *p, int n, int *ch) {
	static int d, i, o, s, l, t;
	for(d = i = 0; i < n; i ++)
		if(p[i] < p[d])
			d = i;
	l = s = *ch = d;
	d = 1;
	do {
		o = l;
		for(i = 0; i < n; i ++)
			if((t=sig(cross(p[o], p[l], p[i])))>0 || (t==0 && btw(p[l], p[o], p[i])<=0))
				l = i;
		ch[d ++] = l;
	} while(l != s); 
	return d-1;
}


int main()
{
	memset(ang,0,sizeof(ang));
	memset(ans,0,sizeof(ans));
	int n,xx,yy;
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		scanf("%d%d",&xx,&yy);
		P[i].set(xx,yy);
	}
	if(n==2){
		puts("0.5");
		puts("0.5");
	}else{
		int m=jarvis(P,n,ch);
		double sum=0;
//for(int i=0;i<m;i++){
//	printf("%d ",ch[i]);
//}puts("");
		if(m==2){
			ans[ch[0]]=0.5;
			ans[ch[1]]=0.5;
		}else{
			for(int i=0;i<m;i++){
				ang[ch[i]]=PI-acos(cos(P[ch[i]],P[ch[(i-1+m)%m]],P[ch[(i+1)%m]]));
			}
			for(int i=0;i<n;i++){
				ans[i]=ang[i]/2./PI;
			}
		}
		for(int i=0;i<n;i++){
			printf("%.20f\n",ans[i]);
		}
	}
	return 0;
}