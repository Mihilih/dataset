#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
#include<iostream>
#include<algorithm>
#include<queue>
#include<time.h>
using namespace std;
int main()
{
long long int a,b,x;
scanf("%lld%lld%lld",&a,&b,&x);
long long int s=(b/x-a/x);
if(a%x==0)s++;
printf("%lld\n",s);
    return 0;
}
