#include <stdio.h>
#include <stdlib.h>

#define N 100000
#define INF 1000000

typedef struct
{
    int go, back, cost;
} Date;

int n, d[N];
Date a[500000];
void root(int);

int main()
{
    int i, j, k, u, count = 0;
    scanf("%d", &n);
    for (i = 0; i < n; i++)
    {
        scanf("%d%d", &u, &k);
        for (j = 0; j < k; j++)
        {
            a[count].back = u;
            scanf("%d%d", &a[count].go, &a[count].cost);
            count++;
        }
    }
    root(count);
    for (i = 0; i < n; i++)
        printf("%d %d\n", i, d[i]);
    return 0;
}

void root(int b)
{
    int i, flag = 1;

    for (i = 0; i < n; i++)
        d[i] = INF;
    d[0] = 0;

    while (flag != 0)
    {
        flag = 0;
        for (i = 0; i < b; i++)
        {
            if (a[i].cost + d[a[i].back] < d[a[i].go])
            {
                d[a[i].go] = a[i].cost + d[a[i].back];
                flag = 1;
            }
        }
    }
}

