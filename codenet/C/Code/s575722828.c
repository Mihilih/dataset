#include <stdio.h>


int main()
{
int S;

scanf("%d",&S);


printf("%d:%d:%d\n",(int)(S/3600),(int)((S % 3600) / 60) ,S % 60);

return 0;

}