#include <stdio.h>
#include <math.h>

int main() {
    double r;
    scanf("%lf", &r);
    printf("%lf %lf\n", r * r * M_PI, 2 * M_PI * r);
    return 0;
}