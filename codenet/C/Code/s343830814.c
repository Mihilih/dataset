#include <stdio.h>
#include <string.h>

int main(int argc, char *argv[])
{
    char buf[512];
    int len;
    fgets(buf, sizeof(buf), stdin);
    len = strlen(buf);
    printf("%c%d%c\n", buf[0], len-3, buf[len-2]);
    return 0;
}