#include <stdio.h>
#include <string.h>

int main()
{
    char mes[101];
    scanf("%s",mes);
    printf("%c%lu%c\n",mes[0],strlen(mes)-2,mes[strlen(mes)-1]);

    return 0;
}
