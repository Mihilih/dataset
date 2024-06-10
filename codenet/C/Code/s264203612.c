#include <stdio.h>

int main(){
    double r;
    double s,l;
    double p = 3.141592653589;
    scanf("%lf", &r);
    
    s = r*r*p;
    l = 2*p*r;
    
    printf("%f %f\n",s,l);
    
    return 0;
}
    