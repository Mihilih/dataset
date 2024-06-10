#include<stdio.h>

int compare(int *a, int *b)
{
    return (*b - *a);
}

int main(void)
{
    int array[10], i;
    for(i = 0; i != 10; i++)
        scanf("%d",array+i);
    qsort(array, 10, sizeof(int), compare);
    for(i = 0; i != 3; i++)
        printf("%d\n", array[i]);
    return 0;
}