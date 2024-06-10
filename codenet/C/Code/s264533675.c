#include<stdio.h>
int main()
{
    char str[30];
    gets(str);
        str[5] =' ';
        str[13] =' ';
    printf("%s\n", str);
    return 0;
}
