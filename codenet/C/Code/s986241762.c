#include <stdio.h>
int main(){
	int n;
  	long sum=0;
  	scanf("%d",&n);
  	int a[n];
  	for(int i=0;i<n;i++){
    	scanf("%d",&a[i]);
    }
  	for(int i=1;i<n;i++){
    	if(a[i-1]>a[i]){
          sum += a[i-1]-a[i];
     	  a[i] = a[i-1];
        }
    }
  	printf("%ld\n",sum);
}