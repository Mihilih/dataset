#include <stdio.h>

int main()
{
   long int n, k, q;
   
   scanf("%ld%ld%ld", &n, &k, &q);
   
    int arr[n];
    for(long int i=0; i<=n; i++) {
        arr[i] = 0;
    }
    
    
    for(long int i=0; i<q; i++) {
        long int temp;
        scanf("%ld", &temp);
        arr[temp] += 1;
    }
    
    for(long int i=1; i<=n; i++) {
        if(arr[i]>(q-k)) {
            printf("Yes\n");
        } else {
            printf("No\n");
        }
    }

    return 0;
}
