#include<stdio.h>

int main(void)
{
    char n[10];
    scanf("%s",n);
    if(((n[0]==n[1])&&(n[1]==n[2]))||((n[1]==n[2])&&(n[2]==n[3])))
    {
        printf("Yes\n");
    }
    else
    {
        printf("No\n");
    }
    return 0;
}