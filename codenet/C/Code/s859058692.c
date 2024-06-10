#include <stdio.h>
int main(void) 
{
    long sum=0;
    int m, n, i, min, max;
    scanf("%d\n", &n);
    for(i=0; i<n; i++){
        scanf("%d", &m);
        sum += m;
        if(i == 0){
            min=m;
            max=m;
        }
         
        if(min>m){
            min=m;
        }
        if(max<m){
            max=m;
        }
    }
    printf("%d %d %ld\n", min, max, sum);
}