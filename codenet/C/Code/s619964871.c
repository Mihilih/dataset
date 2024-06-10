/*
 * FileName:     the_number_of_inversions_fix
 * CreatedDate:  2020-06-05 16:25:10 +0900
 * LastModified: 2020-07-06 22:22:35 +0900
 */

#include <stdio.h>
#include <stdlib.h>
#define unko 1e12
long int sort(long int *a, int left, int middle, int right){
    long int l_arr[middle-left+1], r_arr[right-middle+1];
    long int cnt = 0;
    for(int i=0;i<middle-left;i++)l_arr[i] = a[i+left];
    for(int i=0;i<right-middle;i++)r_arr[i] = a[i+middle];
    l_arr[middle-left] = unko;
    r_arr[right-middle] = unko;
    int l=0, r=0;
    for(int i=0;i<right-left;i++){
        if( l_arr[l]<=r_arr[r] ){
            a[left+i] = l_arr[l++];
        }
        else{
            a[left+i] = r_arr[r++];
            cnt += middle-left-l;
        }
    }
    return cnt;
}
long int merge(long int *a, int left, int right){
    if(left+1<right){
        int middle = (left+right)/2;
        long int x1 = merge( a, left, middle);
        long int x2 = merge( a, middle, right);
        long int x3 = sort( a, left, middle, right);
        return x1+x2+x3;
    }
    else{
        return 0;
    }
}

int main(void){
    int n;scanf("%d",&n);
    long int *a = malloc(n*sizeof(long int));
    for(int i=0;i<n;i++)scanf("%ld",a+i);
    printf("%ld\n", merge( a, 0, n));
    free(a);
    return 0;
}

