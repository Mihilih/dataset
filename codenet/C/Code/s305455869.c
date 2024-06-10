#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <memory.h>
#include <limits.h>
#include <math.h>

int main(int argc, char *argv[])
{
    int a, b;
    int ans;

    scanf("%d %d", &a, &b);

    ans = 0;
    if (a >= 13) {
        ans = b;
    } else if (a >= 6) {
        ans = b/2;
    }

    printf("%d\n", ans);

    return 0;
}
